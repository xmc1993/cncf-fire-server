package com.cncf.controller.user;

import com.cncf.controller.manage.ManageLeaveMessageController;
import com.cncf.entity.LeaveMessage;
import com.cncf.entity.LeaveMessageWithBLOBs;
import com.cncf.entity.User;
import com.cncf.response.ResponseData;
import com.cncf.service.LeaveMessageService;
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
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author zj
 */
@Api(value = "用户留言接口", description = "用户留言接口")
@Controller
@RequestMapping("/user/leaveMessage")
public class UserLeaveMessageController {

    private static final Log logger = LogFactory.getLog(ManageLeaveMessageController.class);
    @Autowired
    private LeaveMessageService leaveMessageService;
    @Autowired
    private Producer captchaProducer = null;

    @ApiOperation(value = "获取图形验证码", notes = "")
    @RequestMapping(value = "getCaptcha", method = RequestMethod.GET)
    @ResponseBody
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
    }

    @ApiOperation(value = "添加留言", notes = "")
    @RequestMapping(value = "insertLeaveMessage", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> insertLeaveMessage(
            @ApiParam("留言主题") @RequestParam("theme") String theme,
            @ApiParam("留言内容") @RequestParam("content") String content,
            @ApiParam("验证码") @RequestParam("captcha") String captcha,
            HttpServletRequest request) {

        //添加验证码验证
        ResponseData<Boolean> responseData = new ResponseData<>();
        String randomString = (String) request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY);

        //下面3个if的验证顺序要先验证非空，否则如果为空，equals方法会报出异常
        if (randomString == null){
            responseData.jsonFill(2,"验证码失效，请刷新验证码",false);
            return responseData;
        }
        if (captcha==null){
            responseData.jsonFill(2,"参数captcha不可为空",false);
            return responseData;
        }
        if (!randomString.equalsIgnoreCase(captcha)) {
            responseData.jsonFill(2, "验证码不正确", false);
            return responseData;
        }
        User user = (User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        LeaveMessageWithBLOBs leaveMessageWithBLOBs=new LeaveMessageWithBLOBs();
        leaveMessageWithBLOBs.setUserId(user.getId());
        leaveMessageWithBLOBs.setTheme(theme);
        leaveMessageWithBLOBs.setContent(content);
        leaveMessageWithBLOBs.setCreateTime(new Date());
        int res = leaveMessageService.insertLeaveMessage(leaveMessageWithBLOBs);
        if (res==0){
            responseData.jsonFill(2,"添加留言失败",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

    @ApiOperation(value = "分页查询留言", notes = "")
    @RequestMapping(value = "selectAllLeaveMessageByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<LeaveMessage>> selectAllLeaveMessageByPage(
            @ApiParam("PAGE") @RequestParam("page") int page,
            @ApiParam("SIZE") @RequestParam("pageSize") int pageSize){
        ResponseData<List<LeaveMessage>> responseData = new ResponseData<>();
        List<LeaveMessage> leaveMessageList=leaveMessageService.selectAllLeaveMessageByPage(page,pageSize);
        responseData.jsonFill(1, null, leaveMessageList);
        responseData.setCount(leaveMessageList.size());
        return responseData;
    }

}
