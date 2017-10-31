package com.cncf.controller.manage;

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
 * @date 2017/10/25 19:52
 */
@Api(value = "admin", description = "后台管理分委会接口")
@Controller
@RequestMapping("/manage/btc")
public class ManageBtcController {
    private static final Log logger = LogFactory.getLog(ManageBtcController.class);
    @Autowired
    private BtcService btcService;

    @ApiOperation(value = "新增Btc(分委会)", notes = "")
    @RequestMapping(value = "insertBtc", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Btc> insertBtc(
            @ApiParam("分委会名") @RequestParam(value="btcName",required = false) String btcName,
            @ApiParam("分委会简称") @RequestParam(value = "shortName",required = false) String shortName,
            @ApiParam("分委会编号") @RequestParam(value = "serialNumber",required = false) String serialNumber,
            @ApiParam("分委会简介") @RequestParam(value = "btcBrief",required = false) String btcBrief,
            @ApiParam("分委会联系方式") @RequestParam(value = "connection",required = false) String connection){
        ResponseData<Btc> responseData=new ResponseData<>();
        Btc btc=new Btc(); btc.setBtcName(btcName); btc.setShortName(shortName);
        btc.setSerialNumber(serialNumber); btc.setBtcBrief(btcBrief); btc.setConnection(connection);
        Boolean res=btcService.insertBtc(btc);
        if (!res){
            responseData.jsonFill(2,"新增分委会失败",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btc);
        return responseData;
    }

    @ApiOperation(value = "获取所有的Btc(分委会)", notes = "")
    @RequestMapping(value = "selectAllBtc", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Btc>> selectAllBtc(){
        List<Btc> btcList=btcService.selectAllBtc();
        ResponseData<List<Btc>> responseData=new ResponseData<>();
        if (btcList.size()==0){
            responseData.jsonFill(2,"无分委会信息",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btcList);
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
            return responseData;
        }
        responseData.jsonFill(1,null,btc);
        return responseData;
    }

    @ApiOperation(value = "更新Btc(分委会)信息", notes = "")
    @RequestMapping(value = "updateBtc", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateBtc(
            @ApiParam("分委会ID") @RequestParam("id") Integer id,
            @ApiParam("分委会名") @RequestParam(value="btcName",required = false) String btcName,
            @ApiParam("分委会简称") @RequestParam(value = "shortName",required = false) String shortName,
            @ApiParam("分委会编号") @RequestParam(value = "serialNumber",required = false) String serialNumber,
            @ApiParam("分委会简介") @RequestParam(value = "btcBrief",required = false) String btcBrief,
            @ApiParam("分委会联系方式") @RequestParam(value = "connection",required = false) String connection){
        ResponseData<Boolean> responseData=new ResponseData<>();
        Btc btc=new Btc();
        btc.setId(id);
        btc.setBtcName(btcName);
        btc.setShortName(shortName);
        btc.setSerialNumber(serialNumber);
        btc.setBtcBrief(btcBrief);
        btc.setConnection(connection);
        boolean res=btcService.updateBtc(btc);
        if (!res){
            responseData.jsonFill(2,"更新失败",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }



}
