package com.cncf.controller.user;

import com.cncf.entity.ReportFileInfo;
import com.cncf.response.ResponseData;
import com.cncf.service.ReportFileInfoService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zj
 */
@Api(value = "User", description = "报告文件信息的crud接口")
@Controller
@RequestMapping("/user/reportFileInfo")
public class UserReportFileInfoController {
    @Autowired
    private ReportFileInfoService reportFileInfoService;

    @ApiOperation(value = "通过id查询报告文件", notes = "")
    @RequestMapping(value = "selectReportFileInfoById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<ReportFileInfo> selectReportFileInfoById(@ApiParam("报告文件ID") @PathVariable String id){
        ResponseData<ReportFileInfo> responseData=new ResponseData<>();
        ReportFileInfo reportFileInfo=reportFileInfoService.selectReportFileInfoById(id);
        if (reportFileInfo==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,reportFileInfo);
        return responseData;
    }

    @ApiOperation(value = "分页查询所有报告文件", notes = "")
    @RequestMapping(value = "selectAllReportFileInfoByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<ReportFileInfo>> selectAllReportFileInfoByPage(
            @ApiParam("page") @RequestParam("page") int page,
            @ApiParam("pageSize") @RequestParam("pageSize") int pageSize){
        ResponseData<List<ReportFileInfo>> responseData=new ResponseData<>();
        List<ReportFileInfo> reportFileInfoList=reportFileInfoService.selectAllReportFileInfoByPage(page,pageSize);
        responseData.jsonFill(1,null,reportFileInfoList);
        responseData.setCount(reportFileInfoList.size());
        return responseData;
    }

}
