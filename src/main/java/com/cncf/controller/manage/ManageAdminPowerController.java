package com.cncf.controller.manage;

import com.cncf.annotation.RequiredPermissions;
import com.cncf.entity.Admin;
import com.cncf.entity.AdminPower;
import com.cncf.response.ResponseData;
import com.cncf.service.AdminPowerService;
import com.cncf.util.ObjectAndByte;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zj
 */
@Api(value = "Admin", description = "后台用户的权限管理接口")
@Controller()
@RequestMapping("/manage/adminPower")
public class ManageAdminPowerController {

    private static final Logger logger = LoggerFactory.getLogger(ManageAdminPowerController.class);
    @Autowired
    private AdminPowerService adminPowerService;

    @RequiredPermissions({4,15})
    @ApiOperation(value = "新增后台用户权限项", notes = "参数codeIds是形如1，2，3的字符串格式")
    @RequestMapping(value = "/addAdminPowers", method = {RequestMethod.POST})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public List<AdminPower> publishAdminPower(
            @ApiParam("后台用户的id") @RequestParam("adminId") Integer adminId,
            @ApiParam("权限码串") @RequestParam("codeIds") String codeIds) {


        String[] codeIdsInArray= codeIds.split(",");
        List<AdminPower> adminPowerList=new ArrayList<>();

        for (int i = 0; i < codeIdsInArray.length; i++) {
            AdminPower adminPower=new AdminPower();
            adminPower.setAdminId(adminId);
            Integer codeId=Integer.parseInt(codeIdsInArray[i]);
            adminPower.setCodeId(codeId);
            adminPower.setCreateTime(new Date());
            adminPower.setUpdateTime(new Date());
            adminPower.setId(null);
            adminPowerService.saveAdminPower(adminPower);
            adminPowerList.add(adminPower);
        }


        return adminPowerList;
    }

    @RequiredPermissions({2,15})
    @ApiOperation(value = "删除后台用户权限项", notes = "")
    @RequestMapping(value = "/deleteAdminPowerById/{id}", method = {RequestMethod.DELETE})
    @ResponseBody
    public ResponseData<Boolean> deleteAdminPowerById(@ApiParam("ID") @PathVariable Integer id) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        boolean success = adminPowerService.deleteAdminPowerById(id);
        if (!success) {
            responseData.jsonFill(2,"删除失败，该项可能已被删除",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

    @RequiredPermissions({2,15})
    @ApiOperation(value = "删除后台用户权限项", notes = "根据后台用户id及其权限码id删除该用户的权限项")
    @RequestMapping(value = "/deleteAdminPower", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> deleteAdminPower(
            @ApiParam("后台用户的id") @RequestParam("adminId") Integer adminId,
            @ApiParam("权限码串") @RequestParam("codeIds") String codeIds) {
        ResponseData<Boolean> responseData = new ResponseData<>();

        String[] codeIdsInArray= codeIds.split(",");
        for (int i = 0; i < codeIdsInArray.length; i++) {
            Integer codeId=Integer.parseInt(codeIdsInArray[i]);
            boolean success = adminPowerService.deleteAdminPower(adminId, codeId);
            if (!success) {
                responseData.jsonFill(2,"删除失败，权限"+codeId+"可能已被删除或不存在！",false);
                return responseData;
            }
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

    @RequiredPermissions({4,15})
    @ApiOperation(value = "根据ID获得后台用户权限项", notes = "参数为管理员权限项的ID即adminPower的id")
    @RequestMapping(value = "/getAdminPowerById/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public AdminPower getAdminPowerById(
            @ApiParam("管理员权限项ID") @PathVariable Integer id) {
        AdminPower adminPower = adminPowerService.getAdminPowerById(id);
        if (adminPower == null) {
            throw new RuntimeException("无效的ID");
        } else {
            return adminPower;
        }
    }


    @RequiredPermissions({4,15})
    @ApiOperation(value = "根据后台用户的id获得后台用户所有权限", notes = "参数为后台用户的id")
    @RequestMapping(value = "/getAdminPowerListAdminId/{id}", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<AdminPower>> getAdminPowerListAdminId(@ApiParam("后台用户id") @PathVariable Integer id) {
        ResponseData<List<AdminPower>> responseData = new ResponseData<>();
        List<AdminPower> adminPowerList = adminPowerService.getAdminPowerListAdminId(id);
        responseData.jsonFill(1, null, adminPowerList);
        return responseData;
    }
}
