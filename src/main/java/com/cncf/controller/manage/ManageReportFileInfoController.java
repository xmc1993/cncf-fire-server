package com.cncf.controller.manage;

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
@Api(value = "Admin", description = "")
@Controller
@RequestMapping("/manage/reportFileInfo")
public class ManageReportFileInfoController {
    @Autowired
    private ReportFileInfoService reportFileInfoService;

    @ApiOperation(value = "通过id查询报告文件", notes = "")
    @RequestMapping(value = "selectReportFileInfoById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<ReportFileInfo> selectReportFileInfoById(@ApiParam("报告文件ID") @PathVariable String id){
        return reportFileInfoService.selectReportFileInfoById(id);
    }

    @ApiOperation(value = "分页查询所有报告文件", notes = "")
    @RequestMapping(value = "selectAllReportFileInfoByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<ReportFileInfo>> selectAllReportFileInfoByPage(
            @ApiParam("page") @RequestParam("page") int page,
            @ApiParam("pageSize") @RequestParam("pageSize") int pageSize){
        return reportFileInfoService.selectAllReportFileInfoByPage(page,pageSize);
    }



}
