package com.cncf.controller.user;

import com.cncf.entity.ReportInfo;
import com.cncf.response.ResponseData;
import com.cncf.service.ReportInfoService;
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
@Api(value = "User", description = "检验报告的crud")
@Controller
@RequestMapping("/user/reportInfo")
public class UserReportInfoController {
    @Autowired
    private ReportInfoService reportInfoService;

    @ApiOperation(value = "通过id获取报告信息", notes = "")
    @RequestMapping(value = "selectReportInfoById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<ReportInfo> selectReportInfoById(@ApiParam("id") @PathVariable String id){
        ResponseData<ReportInfo> responseData=new ResponseData<>();
        ReportInfo reportInfo=reportInfoService.selectReportInfoById(id);
        if (reportInfo==null){
            responseData.jsonFill(2,"无效的id",null);
            return responseData;
        }
        responseData.jsonFill(1,null,reportInfo);
        return responseData;
    }

    @ApiOperation(value = "分页查询所有报告信息", notes = "")
    @RequestMapping(value = "selectAllReportInfoByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<ReportInfo>> selectAllReportInfoByPage(
            @ApiParam("page") @RequestParam("page") int page,
            @ApiParam("pageSize") @RequestParam("pageSize") int pageSize){
        ResponseData<List<ReportInfo>> responseData=new ResponseData<>();
        List<ReportInfo> reportInfoList=reportInfoService.selectAllReportInfoByPage(page,pageSize);
        responseData.jsonFill(1,null,reportInfoList);
        responseData.setCount(reportInfoList.size());
        return responseData;
    }

}
