package com.cncf.controller.user;

import com.cncf.controller.manage.ManageLeaveMessageController;
import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.entity.User;
import com.cncf.response.ResponseData;
import com.cncf.service.MessageService;
import com.cncf.service.MessageSetService;
import com.cncf.util.TokenConfig;
import com.cncf.util.UserUtil;
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

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user/leaveMessage")
public class UserLeaveMessageController {

    private static final Log logger = LogFactory.getLog(ManageLeaveMessageController.class);
    @Autowired
    private MessageSetService messageSetService;
    @Autowired
    private MessageService messageService;

    @ApiOperation(value = "添加留言集", notes = "")
    @RequestMapping(value = "insertMessageSet", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData insertMessageSet(@ApiParam("留言主题") @RequestParam("theme") String theme, HttpServletRequest request){
        MessageSet messageSet=new MessageSet();
        Integer idInSession = UserUtil.getSessionUser(request).getId();
        messageSet.setUserId(idInSession);
        messageSet.setTheme(theme);
        messageSet.setCreateTime(new Date());
        ResponseData<MessageSet> responseData = new ResponseData<MessageSet>();
        boolean result=messageSetService.insertMessageSet(messageSet);
        if (!result) {
            responseData.jsonFill(2, "添加留言集失败", null);
            return responseData;
        }
        responseData.jsonFill(1,"添加留言集成功",messageSet);
        return responseData;
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
                                               @ApiParam("该条留言的内容") @RequestParam("content") String content, HttpServletRequest request){
        ResponseData<Message> responseData = new ResponseData<>();
        Message message=new Message();
        message.setSetId(setId);
        User user=(User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        message.setAuthorId(user.getId());
        message.setCreateTime(new Date());
        message.setContent(content);
        message.setType(1);
        boolean result=messageService.insertMessage(message);
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
