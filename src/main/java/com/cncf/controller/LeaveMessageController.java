package com.cncf.controller;

import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.service.MessageService;
import com.cncf.service.MessageSetService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("leaveMessage")
public class LeaveMessageController {

    private static final Log logger = LogFactory.getLog(LeaveMessageController.class);
    @Autowired
    private MessageSetService messageSetService;
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "insertMessageSet", method = {RequestMethod.POST})
    @ResponseBody
    public String insertMessageSet(MessageSet messageSet){
        boolean result=messageSetService.insertMessageSet(messageSet);
        if (!result){
            return "添加留言集失败";
        }
        return "添加留言集成功";
    }

    @RequestMapping(value = "updateSetValid", method = {RequestMethod.GET})
    @ResponseBody
    public String updateSetValid(int id,int valid){
        boolean result=messageSetService.updateValid(id,valid);
        if (!result){
            return "更新valid字段失败";
        }
        return "更新valid字段成功";
    }

    @RequestMapping(value = "selectAllMessageSet", method = {RequestMethod.GET})
    @ResponseBody
    public List selectAllMessageSet(){
        List list=messageSetService.selectAllMessageSet();
        return list;
    }
    /*----------------上面是留言集的操作，下面是对留言集中每条留言的操作-----------*/
    @RequestMapping(value = "insertMessage", method = {RequestMethod.POST})
    @ResponseBody
    public String insertMessage(Message message){
        boolean result=messageService.insertMessage(message);
        if (!result){
            return "留言失败";
        }
        return "留言成功";
    }

    @RequestMapping(value = "updateValid", method = {RequestMethod.GET})
    @ResponseBody
    public String updateValid(int id,int valid){
        boolean result=messageService.updateValid(id,valid);
        if (!result){
            return "更新valid字段失败";
        }
        return "更新valid字段成功";
    }

    @RequestMapping(value = "selectMessageBySetId", method = {RequestMethod.GET})
    @ResponseBody
    public Message selectMessageBySetId(int setId){
        return messageService.selectMessageBySetId(setId);
    }
}
