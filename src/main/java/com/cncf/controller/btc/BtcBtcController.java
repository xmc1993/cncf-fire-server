package com.cncf.controller.btc;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zj
 * @date 2017/10/26 18:09
 */
@Api(value = "Btc", description = "分委会模块接口")
@Controller
@RequestMapping("/btc/btc")
public class BtcBtcController {
    private static final Log logger = LogFactory.getLog(BtcBtcController.class);
    @Autowired
    private BtcService btcService;

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
            return responseData;
        }
        responseData.jsonFill(1,null,btcWithBLOBs);
        return responseData;
    }
}
