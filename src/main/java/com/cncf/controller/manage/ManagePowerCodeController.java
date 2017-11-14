package com.cncf.controller.manage;

import com.cncf.annotation.RequiredPermissions;
import com.cncf.entity.PowerCode;
import com.cncf.response.ResponseData;
import com.cncf.service.PowerCodeService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Api(value = "Admin", description = "管理接口")
@Controller()
@RequestMapping("/manage/powerCode")
public class ManagePowerCodeController {
    private static final Logger logger = LoggerFactory.getLogger(ManagePowerCodeController.class);
    @Autowired
    private PowerCodeService powerCodeService;

    @RequiredPermissions({1,15})
    @ApiOperation(value = "新增权限码项", notes = "")
    @RequestMapping(value = "/addPowerCode", method = {RequestMethod.POST})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public PowerCode publishPowerCode(
            @ApiParam("权限码名称") @RequestParam(value = "name") String name,
            @ApiParam("权限描述") @RequestParam(value = "description",required = false) String description) {
        PowerCode powerCode=new PowerCode();
        powerCode.setName(name);
        powerCode.setDescription(description);
        powerCode.setCreateTime(new Date());
        powerCode.setUpdateTime(new Date());
        powerCodeService.savePowerCode(powerCode);
        return powerCode;
    }

    @RequiredPermissions({3,15})
    @ApiOperation(value = "更新权限码项", notes = "更新失败则返回null，成功则返回权限码对象。传null值置空相应字段")
    @RequestMapping(value = "/updatePowerCodes", method = {RequestMethod.POST})
    @ResponseBody
    public PowerCode updatePowerCode(
            @ApiParam("ID") @RequestParam("id") int id,
            @ApiParam("权限名称") @RequestParam(value = "name",required = false) String name,
            @ApiParam("权限描述") @RequestParam(value = "description",required = false) String description) {
        PowerCode powerCode=new PowerCode();
        powerCode.setId(id);
        powerCode.setName(name);
        powerCode.setDescription(description);
        powerCode.setUpdateTime(new Date());
        return powerCodeService.updatePowerCode(powerCode) ? powerCode : null;

    }

    @RequiredPermissions({2,15})
    @ApiOperation(value = "删除权限码项", notes = "")
    @RequestMapping(value = "/deletePowerCodes/{id}", method = {RequestMethod.DELETE})
    @ResponseBody
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseData<Boolean> deletePowerCode(
            @ApiParam("ID") @PathVariable int id,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        boolean success = powerCodeService.deletePowerCode(id);
        if (!success) {
            responseData.jsonFill(2,"删除失败",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }


    @RequiredPermissions({4,15})
    @ApiOperation(value = "根据ID获得权限码项", notes = "")
    @RequestMapping(value = "/getPowerCodesById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public PowerCode getPowerCodesById(
            @ApiParam("ID") @PathVariable int id,
            HttpServletRequest request, HttpServletResponse response) {
        PowerCode powerCode = powerCodeService.getPowerCodeById(id);
        if (powerCode == null) {
            throw new RuntimeException("无效的ID");
        } else {
            return powerCode;
        }
    }

    @RequiredPermissions({4,15})
    @ApiOperation(value = "获得权限码", notes = "")
    @RequestMapping(value = "/getPowerCodeList", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<PowerCode>> getPowerCodeList(
            @ApiParam("页") @RequestParam int page,
            @ApiParam("页大小") @RequestParam int pageSize,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<List<PowerCode>> responseData = new ResponseData<>();
        List<PowerCode> powerCodeList = powerCodeService.getPowerCodeListByPage(page, pageSize);
        responseData.jsonFill(1, null, powerCodeList);
        responseData.setCount(powerCodeService.getPowerCodeCount());
        return responseData;
    }

}
