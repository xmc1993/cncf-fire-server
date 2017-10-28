package com.cncf.controller.manage;

import com.cncf.controller.user.UserModuleController;
import com.cncf.entity.Module;
import com.cncf.response.ResponseData;
import com.cncf.service.ModuleService;
import com.wordnik.swagger.annotations.Api;
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

import java.util.List;

/**
 * @author zj
 * @date 2017/10/25 19:48
 */
@Api(value = "admin", description = "后台显示的系统各导航模块的接口")
@Controller
@RequestMapping("/manage/module")
public class ManageModuleController {
    private static final Log logger = LogFactory.getLog(ManageModuleController.class);
    @Autowired
    private ModuleService moduleService;

    @ApiOperation(value = "查询所有父模块", notes = "")
    @RequestMapping(value = "selectAllParentModule", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Module>> selectAllParentModule(){
        List<Module> moduleList=moduleService.selectAllParentModule();
        ResponseData<List<Module>> responseData=new ResponseData<>();
        if (moduleList.size()==0){
            responseData.jsonFill(2,"无模块可显示",null);
            return responseData;
        }
        responseData.jsonFill(1,null,moduleList);
        return responseData;
    }

    @ApiOperation(value = "根据父模块ID查询所有子模块", notes = "")
    @RequestMapping(value = "selectAllChildModuleByParentId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Module>> selectAllChildModuleByParentId(
            @ApiParam("父模块ID") @RequestParam("parentId") String parentId){
        List<Module> moduleList=moduleService.selectAllChildModuleByParentId(parentId);
        ResponseData<List<Module>> responseData=new ResponseData<>();
        if (moduleList.size()==0){
            responseData.jsonFill(2,"该模块无子模块可显示",null);
            return responseData;
        }
        responseData.jsonFill(1,null,moduleList);
        return responseData;
    }
}
