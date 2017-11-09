package com.cncf.controller.manage;

import com.cncf.entity.Btc;
import com.cncf.entity.BtcWithBLOBs;
import com.cncf.response.ResponseData;
import com.cncf.service.BtcService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
            @ApiParam("分委会联系方式") @RequestParam(value = "connection",required = false) String connection,
            @ApiParam("分委会目前管理的标准") @RequestParam(value = "cms",required = false) String cms,
            @ApiParam("分委会制修订中的标准") @RequestParam(value = "crs",required = false) String crs){
        ResponseData<Btc> responseData=new ResponseData<>();
        BtcWithBLOBs btcWithBLOBs=new BtcWithBLOBs(); btcWithBLOBs.setBtcName(btcName);
        btcWithBLOBs.setShortName(shortName); btcWithBLOBs.setSerialNumber(serialNumber);
        btcWithBLOBs.setBtcBrief(btcBrief); btcWithBLOBs.setConnection(connection);
        btcWithBLOBs.setCms(cms); btcWithBLOBs.setCrs(crs);
        int res=btcService.insertBtc(btcWithBLOBs);
        if (res==0){
            responseData.jsonFill(2,"新增分委会失败",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btcWithBLOBs);
        return responseData;
    }

    @ApiOperation(value = "获取所有的Btc(分委会)的简要信息", notes = "")
    @RequestMapping(value = "selectAllBtcShortInfo", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Btc>> selectAllBtc(){
        List<Btc> btcList=btcService.selectAllBtc();
        ResponseData<List<Btc>> responseData=new ResponseData<>();
        responseData.jsonFill(1,null,btcList);
        return responseData;
    }

    @ApiOperation(value = "通过ID获取Btc(分委会)全部信息", notes = "")
    @RequestMapping(value = "selectBtcById", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<BtcWithBLOBs> selectBtcById(@ApiParam("ID") @RequestParam("id") Integer id){
        ResponseData<BtcWithBLOBs> responseData=new ResponseData<>();
        BtcWithBLOBs btcWithBLOBs=btcService.selectBtcById(id);
        if (btcWithBLOBs==null){
            responseData.jsonFill(2,"无效的id",null);
        }
        responseData.jsonFill(1,null,btcWithBLOBs);
        return responseData;
    }

    @ApiOperation(value = "更新Btc(分委会)信息",
            notes = "selective值为1时,传null值时不会写入数据库；selective值为0时，传null值会写入数据库")
    @RequestMapping(value = "updateByPrimaryKeyWithBLOBs", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateByPrimaryKeyWithBLOBs(
            @ApiParam("可否将null值更新到数据库，true可以，false不可以") @RequestParam("selective") int selective,
            @ApiParam("分委会ID") @RequestParam("id") Integer id,
            @ApiParam("分委会名") @RequestParam(value="btcName",required = false) String btcName,
            @ApiParam("分委会简称") @RequestParam(value = "shortName",required = false) String shortName,
            @ApiParam("分委会编号") @RequestParam(value = "serialNumber",required = false) String serialNumber,
            @ApiParam("分委会简介") @RequestParam(value = "btcBrief",required = false) String btcBrief,
            @ApiParam("分委会联系方式") @RequestParam(value = "connection",required = false) String connection,
            @ApiParam("分委会目前管理的标准") @RequestParam(value = "cms",required = false) String cms,
            @ApiParam("分委会制修订中的标准") @RequestParam(value = "crs",required = false) String crs){
        ResponseData<Boolean> responseData=new ResponseData<>();
        BtcWithBLOBs btcWithBLOBs=new BtcWithBLOBs();
        btcWithBLOBs.setId(id);
        btcWithBLOBs.setBtcName(btcName);
        btcWithBLOBs.setShortName(shortName);
        btcWithBLOBs.setSerialNumber(serialNumber);
        btcWithBLOBs.setBtcBrief(btcBrief);
        btcWithBLOBs.setConnection(connection);
        btcWithBLOBs.setCms(cms);
        btcWithBLOBs.setCrs(crs);
        int res;
        if (selective==0){
            res=btcService.updateByPrimaryKeyWithBLOBs(btcWithBLOBs);
        }else{
            res=btcService.updateByPrimaryKeySelective(btcWithBLOBs);
        }
        if (res==0){
            responseData.jsonFill(2,"更新失败",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

    

    @ApiOperation(value = "删除分委会", notes = "")
    @RequestMapping(value = "deleteBtc/{id}", method = {RequestMethod.DELETE})
    @ResponseBody
    public ResponseData<Boolean> deleteBtc(@ApiParam("分委会ID") @PathVariable Integer id){
        ResponseData<Boolean> responseData=new ResponseData<>();
        int res=btcService.deleteBtc(id);
        if (res==0){
            responseData.jsonFill(2,"删除失败",false);
            return responseData;
        }
        responseData.jsonFill(1,"删除成功",true);
        return responseData;
    }

}
