package com.cncf.controller.user;

import com.cncf.entity.Btc;
import com.cncf.response.ResponseData;
import com.cncf.service.BtcService;
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
 * @date 2017/10/26 18:09
 */
@Api(value = "User", description = "用户接口")
@Controller
@RequestMapping("/user/btc")
public class UserBtcController {
    private static final Log logger = LogFactory.getLog(UserBtcController.class);
    @Autowired
    private BtcService btcService;

    @ApiOperation(value = "获取所有的Btc(分委会)", notes = "")
    @RequestMapping(value = "selectAllBtc", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Btc>> selectAllBtc(){
        List<Btc> btcList=btcService.selectAllBtc();
        ResponseData<List<Btc>> responseData=new ResponseData<>();
        if (btcList==null){
            responseData.jsonFill(2,"无分委会信息",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btcList);
        return responseData;
    }

    @ApiOperation(value = "通过模块ID获取需要显示其信息的Btc(分委会)", notes = "")
    @RequestMapping(value = "selectBtcByModuleId", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Btc> selectBtcByModuleId(@ApiParam("模块ID") @RequestParam("moduleId") String moduleId){

        Btc btc=btcService.selectBtcByModuleId(moduleId);
        ResponseData<Btc> responseData=new ResponseData<>();
        if (btc==null){
            responseData.jsonFill(2,"无分委会信息",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btc);
        return responseData;
    }

    @ApiOperation(value = "通过ID获取Btc(分委会)", notes = "")
    @RequestMapping(value = "selectBtcById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Btc> selectBtcById(@ApiParam("ID") @RequestParam("id") Integer id){
        ResponseData<Btc> responseData=new ResponseData<>();
        Btc btc=btcService.selectBtcById(id);
        if (btc==null){
            responseData.jsonFill(2,"无效的分委会id",null);
        }
        responseData.jsonFill(1,null,btc);
        return responseData;
    }
}
