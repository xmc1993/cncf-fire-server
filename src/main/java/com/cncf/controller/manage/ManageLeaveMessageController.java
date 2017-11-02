package com.cncf.controller.manage;

import com.cncf.entity.Admin;
import com.cncf.entity.Message;
import com.cncf.entity.MessageSet;
import com.cncf.response.ResponseData;
import com.cncf.service.MessageService;
import com.cncf.service.MessageSetService;
import com.cncf.util.TokenConfig;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author zj
 */
@Controller
@RequestMapping("/manage/leaveMessage")
public class ManageLeaveMessageController {

    private static final Log logger = LogFactory.getLog(ManageLeaveMessageController.class);
    @Autowired
    private MessageSetService messageSetService;
    @Autowired
    private MessageService messageService;

    @ApiOperation(value = "审核一个留言集", notes = "valid=1表示通过审核，valid=0表示待审核，valid=-1表示审核不通过")
    @RequestMapping(value = "updateMessageSetValid", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData updateMessageSetValid(@ApiParam("留言集ID") @RequestParam("id") int id,
                                              @ApiParam("是否通过审核") @RequestParam("valid") int valid){
        ResponseData<MessageSet> responseData = new ResponseData<>();
        boolean result=messageSetService.updateMessageSetValid(id,valid);
        if (!result){
            responseData.jsonFill(2, "更新valid字段失败", null);
            return responseData;
        }
        responseData.jsonFill(1,"更新valid字段成功",null);
        return responseData;
    }

    @ApiOperation(value = "分页查询留言集", notes = "")
    @RequestMapping(value = "selectAllMessageSet", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<MessageSet>> selectAllMessageSet(
            @ApiParam("PAGE") @RequestParam("page") int page,
            @ApiParam("SIZE") @RequestParam("pageSize") int pageSize){
        ResponseData<List<MessageSet>> responseData = new ResponseData<>();
        List<MessageSet> messageSetList=(List<MessageSet>)messageSetService.selectAllMessageSet(page,pageSize);
        responseData.jsonFill(1, null, messageSetList);
        responseData.setCount(messageSetList.size());
        return responseData;
    }

    /*----------------上面是留言集的操作，下面是对留言集中每条留言的操作-----------*/
    @ApiOperation(value = "添加一条留言或回复", notes = "")
    @RequestMapping(value = "insertMessage", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Message> insertMessage(
            @ApiParam("留言集ID") @RequestParam("setId") Integer setId,
            @ApiParam("该条留言的内容") @RequestParam("content") String content,HttpServletRequest request){
        ResponseData<Message> responseData = new ResponseData<>();
        Message message=new Message();
        message.setSetId(setId);
        Admin admin=(Admin) request.getAttribute(TokenConfig.DEFAULT_ADMINID_REQUEST_ATTRIBUTE_NAME);
        message.setAuthorId(admin.getAdminId());
        message.setCreateTime(new Date());
        message.setContent(content);
        message.setType(2);
        boolean result=messageService.insertMessage(message);
        if (!result){
            responseData.jsonFill(2, "留言失败", null);
            return responseData;
        }
        responseData.jsonFill(1,"留言成功",message);
        return responseData;
    }

    @ApiOperation(value = "审核一条留言", notes = "valid=1表示通过审核，valid=0表示待审核，valid=-1表示审核不通过")
    @RequestMapping(value = "updateMessageValid", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> updateMessageValid(@ApiParam("本条留言的ID") @RequestParam("id") int id,
                                                    @ApiParam("是否通过审核") @RequestParam("valid") int valid){
        ResponseData<Boolean> responseData=new ResponseData<>();
        boolean result=messageService.updateMessageValid(id,valid);
        if (!result){
            responseData.jsonFill(2,"更新valid字段失败",result);
            return responseData;
        }
        responseData.jsonFill(1,"更新valid字段成功",result);
        return responseData;
    }

    @ApiOperation(value = "通过留言集ID查询其下所有留言", notes = "")
    @RequestMapping(value = "selectMessageBySetId", method = {RequestMethod.GET})
    @ResponseBody
    public Message selectMessageBySetId(@ApiParam("留言集ID") @RequestParam("setId") int setId){
        return messageService.selectMessageBySetId(setId);
    }
}
