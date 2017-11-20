package com.cncf.controller.user;

import com.cncf.entity.ReportInfo;
import com.cncf.entity.ReportInfoWithBLOBs;
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

    @ApiOperation(value = "通过id获取报告信息", notes = "全部字段")
    @RequestMapping(value = "selectReportInfoById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<ReportInfoWithBLOBs> selectReportInfoById(String id){
        return reportInfoService.selectReportInfoWithBLOBsById(id);
    }

    @ApiOperation(value = "分页查询所有报告信息", notes = "简要信息")
    @RequestMapping(value = "selectAllReportInfoByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<ReportInfoWithBLOBs>> selectAllReportInfoByPage(
            @ApiParam("page") @RequestParam("page") int page,
            @ApiParam("pageSize") @RequestParam("pageSize") int pageSize){
        return reportInfoService.selectAllReportInfoWithBLOBsByPage(page,pageSize);
    }

}
