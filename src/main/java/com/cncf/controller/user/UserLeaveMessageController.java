package com.cncf.controller.user;

import com.cncf.controller.manage.ManageLeaveMessageController;
import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.entity.User;
import com.cncf.response.ResponseData;
import com.cncf.service.MessageService;
import com.cncf.service.MessageSetService;
import com.cncf.util.TokenConfig;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@Api(value = "用户留言接口", description = "用户留言接口")
@Controller
@RequestMapping("/user/leaveMessage")
public class UserLeaveMessageController {

    private static final Log logger = LogFactory.getLog(ManageLeaveMessageController.class);
    @Autowired
    private MessageSetService messageSetService;
    @Autowired
    private MessageService messageService;
    @Autowired
    private Producer captchaProducer = null;

    @ApiOperation(value = "获取留言所需的验证码", notes = "")
    @RequestMapping(value = "getCaptcha", method = RequestMethod.GET)
    @ResponseBody
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.err.println("访问了captcha");
/*        HttpSession session = request.getSession();
        String code = (String)session.getAttribute(Constants.KAPTCHA_SESSION_KEY);
        System.out.println("******************验证码是: " + code + "******************");*/

        response.setDateHeader("Expires", 0);
        // Set standard HTTP/1.1 no-cache headers.
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.
        response.setHeader("Pragma", "no-cache");
        // return a jpeg
        response.setContentType("image/jpeg");
        // create the text for the image
        String capText = captchaProducer.createText();
        // store the text in the session
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text
        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out
        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }
        //return null;
    }

    @ApiOperation(value = "初始化留言集并添加第一条留言", notes = "内容参数即为第一条留言")
    @RequestMapping(value = "insertMessageSet", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Message> insertMessageSet(
            @ApiParam("留言主题（标题）") @RequestParam("theme") String theme,
            @ApiParam("验证码") @RequestParam("captcha") String captcha,
            @ApiParam("留言内容") @RequestParam("content") String content,
            HttpServletRequest request){

        //添加验证码验证
        ResponseData<Message> responseData = new ResponseData<>();
        String randomString=(String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (captcha == null && randomString == null && !captcha.equalsIgnoreCase(randomString)){
            responseData.jsonFill(2,"验证码不正确",null);
            return responseData;
        }

        //验证登录
        User user=(User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        if (user==null){
            responseData.jsonFill(2, "用户未登录", null);
            return responseData;
        }

        //存储留言集
        MessageSet messageSet=new MessageSet();
        messageSet.setUserId(user.getId());
        messageSet.setTheme(theme);
        messageSet.setCreateTime(new Date());
        messageSet.setValid(1);
        messageSet=messageSetService.insertMessageSet(messageSet);

        //添加留言并放回结果
        return addMessage(messageSet.getSetId(),content,request);
    }

    @ApiOperation(value = "分页查询所有留言集", notes = "")
    @RequestMapping(value = "selectAllMessageSet", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<MessageSet>> selectAllMessageSet(
            @ApiParam("PAGE") @RequestParam("page") int page,
            @ApiParam("SIZE") @RequestParam("pageSize") int pageSize){
        ResponseData<List<MessageSet>> responseData = new ResponseData<>();
        List<MessageSet> MessageSetList=messageSetService.selectAllMessageSet(page,pageSize);
        responseData.jsonFill(1, null, MessageSetList);
        return responseData;
    }

    /*----------------上面是留言集的操作，下面是对留言集中每条留言的操作-----------*/
    @ApiOperation(value = "添加一条留言或回复", notes = "")
    @RequestMapping(value = "insertMessage", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Message> insertMessage(@ApiParam("留言集ID") @RequestParam("setId") Integer setId,
                                               @ApiParam("该条留言的内容") @RequestParam("content") String content,
                                               @ApiParam("验证码") @RequestParam("captcha") String captcha,
                                               HttpServletRequest request){

        //添加验证码验证
        ResponseData<Message> responseData = new ResponseData<>();
        String randomString=(String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);
        if (captcha == null && randomString == null && !captcha.equalsIgnoreCase(randomString)){
            responseData.jsonFill(2,"验证码不正确",null);
            return responseData;
        }

        return addMessage(setId,content,request);
    }

    public ResponseData<Message> addMessage(Integer setId, String content, HttpServletRequest request){
        Message message=new Message();
        message.setSetId(setId);
        User user=(User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        message.setAuthorId(user.getId());
        message.setCreateTime(new Date());
        message.setContent(content);
        message.setType(1);
        boolean result=messageService.insertMessage(message);
        ResponseData<Message> responseData = new ResponseData<>();
        if (!result){
            responseData.jsonFill(2, "留言失败", null);
            return responseData;
        }
        responseData.jsonFill(1,"留言成功",message);
        return responseData;
    }

    @ApiOperation(value = "通过留言集ID查询其下所有留言", notes = "")
    @RequestMapping(value = "selectMessageBySetId", method = {RequestMethod.GET})
    @ResponseBody
    public Message selectMessageBySetId(@ApiParam("留言集ID") @RequestParam("setId") Integer setId){
        return messageService.selectMessageBySetId(setId);
    }
}
