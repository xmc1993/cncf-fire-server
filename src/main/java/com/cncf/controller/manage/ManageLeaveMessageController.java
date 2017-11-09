package com.cncf.controller.manage;

import com.cncf.entity.Admin;
import com.cncf.entity.LeaveMessage;
import com.cncf.entity.LeaveMessageWithBLOBs;
import com.cncf.response.ResponseData;
import com.cncf.service.LeaveMessageService;
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
    private LeaveMessageService leaveMessageService;

    @ApiOperation(value = "审核留言", notes = "pass=0表示待审核，pass=1表示通过审核，pass=2表示审核不通过")
    @RequestMapping(value = "verifyLeaveMessage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> verifyLeaveMessage(@ApiParam("留言ID") @RequestParam("id") Integer id,
                                              @ApiParam("是否通过审核") @RequestParam("pass") byte pass){
        ResponseData<Boolean> responseData = new ResponseData<>();
        int result=leaveMessageService.verifyLeaveMessage(id,pass);
        if (result==0){
            responseData.jsonFill(2, "更新pass字段失败", false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

    @ApiOperation(value = "通过ID查询留言", notes = "")
    @RequestMapping(value = "selectLeaveMessageById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<LeaveMessage> selectLeaveMessageById(@ApiParam("留言ID") @PathVariable Integer id){
        ResponseData<LeaveMessage> responseData=new ResponseData<>();
        LeaveMessage leaveMessage=leaveMessageService.selectLeaveMessageById(id);
        if (leaveMessage==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,leaveMessage);
        return responseData;
    }

    @ApiOperation(value = "分页查询留言", notes = "")
    @RequestMapping(value = "selectAllLeaveMessageByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<LeaveMessage>> selectAllLeaveMessageByPage(
            @ApiParam("PAGE") @RequestParam("page") int page,
            @ApiParam("SIZE") @RequestParam("pageSize") int pageSize){
        ResponseData<List<LeaveMessage>> responseData = new ResponseData<>();
        List<LeaveMessage> leaveMessageList=(List<LeaveMessage>)leaveMessageService.selectAllLeaveMessageByPage(page,pageSize);
        responseData.jsonFill(1, null, leaveMessageList);
        responseData.setCount(leaveMessageList.size());
        return responseData;
    }

    @ApiOperation(value = "回复留言", notes = "该接口内部设置通过审核，而不用单独设置通过审核")
    @RequestMapping(value = "reply", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> reply(
            @ApiParam("留言ID") @RequestParam("id") Integer id,
            @ApiParam("回复的内容") @RequestParam("reply") String reply,HttpServletRequest request){
        ResponseData<Boolean> responseData = new ResponseData<>();
        LeaveMessageWithBLOBs leaveMessageWithBLOBs=new LeaveMessageWithBLOBs();
        leaveMessageWithBLOBs.setId(id);
        leaveMessageWithBLOBs.setReply(reply);
        leaveMessageWithBLOBs.setReplyTime(new Date());
        Byte pass=1; leaveMessageWithBLOBs.setPass(pass);
        int res=leaveMessageService.updateLeaveMessage(leaveMessageWithBLOBs);
        if (res==0){
            responseData.jsonFill(2, "留言失败", false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

}
