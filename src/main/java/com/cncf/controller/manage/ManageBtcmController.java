package com.cncf.controller.manage;

import com.cncf.entity.Btcm;
import com.cncf.response.ResponseData;
import com.cncf.service.BtcmService;
import com.cncf.util.JedisUtil;
import com.cncf.util.ObjectAndByte;
import com.cncf.util.TokenConfig;
import com.cncf.util.Util;
import com.cncf.vo.LoginVo;
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
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author zj
 * @date 2017/10/27 21:32
 */
@Api(value = "admin", description = "管理端的技术委员会分委会的委员的接口")
@Controller
@RequestMapping("/manage/btcm")
public class ManageBtcmController {
    private static final Log logger = LogFactory.getLog(ManageBtcmController.class);
    @Autowired
    private BtcmService btcmService;

    @ApiOperation(value = "注册委员信息", notes = "")
    @RequestMapping(value = "register", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Btcm> register(
            @ApiParam("账号") @RequestParam("code") String code,
            @ApiParam("密码") @RequestParam("password") String password,
            @ApiParam("真实姓名") @RequestParam("realName") String realName,
            @ApiParam("所属部门ID") @RequestParam("btcId") Integer btcId){
        Btcm btcm=btcmService.getBtcmByCode(code);
        ResponseData<Btcm> responseData=new ResponseData<>();
        if (btcm!=null){
            responseData.jsonFill(2,"该账号已存在",null);
            return responseData;
        }
        btcm=new Btcm(); btcm.setCode(code); btcm.setPassword(password);
        btcm.setRealName(realName); btcm.setRegistTime(new Date()); btcm.setBtcId(btcId);
        boolean res=btcmService.saveBtcm(btcm);
        if (!res){
            responseData.jsonFill(2,"注册失败",null);
            return responseData;
        }
        responseData.jsonFill(1,"注册成功",btcm);
        return responseData;
    }

    @ApiOperation(value = "删除委员", notes = "")
    @RequestMapping(value = "delete", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Boolean> delete(@ApiParam("委员ID") @RequestParam("id") Integer id){
        ResponseData<Boolean> responseData=new ResponseData<>();
        boolean res=btcmService.deleteBtcm(id);
        if (!res){
            responseData.jsonFill(2,"删除失败",false);
            return responseData;
        }
        responseData.jsonFill(1,"删除成功",true);
        return responseData;
    }

    @ApiOperation(value = "通过账号查找委员", notes = "")
    @RequestMapping(value = "getBtcmByCode", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<Btcm> getBtcmByCode(@ApiParam("委员的账号") @RequestParam("code") String code){
        ResponseData<Btcm> responseData=new ResponseData<>();
        Btcm btcm=btcmService.getBtcmByCode(code);
        if (btcm==null){
            responseData.jsonFill(1,"该账号不存在",null);
            return responseData;
        }
        responseData.jsonFill(1,null,btcm);
        return responseData;
    }

    @ApiOperation(value = "查找所有委员", notes = "")
    @RequestMapping(value = "selectAllBtcmByPage", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Btcm>> selectAllBtcmByPage(
            @ApiParam("当前页数") @RequestParam("page") int page,
            @ApiParam("页面大小") @RequestParam("pageSize") int pageSize ){
        ResponseData<List<Btcm>> responseData = new ResponseData<>();
        List<Btcm> btcmList=btcmService.selectAllBtcmByPage(page,pageSize);
        responseData.jsonFill(1, null,btcmList);
        return responseData;
    }

    @ApiOperation(value = "更新委员信息", notes = "此接口只可用于更新密码、所属分委会btcId")
    @RequestMapping(value = "updateBtcm", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> updateBtcm(
            @ApiParam("密码") @RequestParam(value="password",required = false) String password,
            @ApiParam("所属分委会") @RequestParam(value = "btcId",required = false) Integer btcId,
            HttpServletRequest request){
        Btcm btcm=(Btcm) request.getAttribute(TokenConfig.DEFAULT_BTCMID_REQUEST_ATTRIBUTE_NAME);
        if (password!=null){
            btcm.setPassword(password);
        }
        if (btcId!=null){
            btcm.setBtcId(btcId);
        }
        ResponseData<Boolean> responseData=new ResponseData<>();
        boolean res=btcmService.updateBtcm(btcm);
        if (!res){
            responseData.jsonFill(2,"更新失败",false);
            return responseData;
        }
        responseData.jsonFill(1,null,true);
        return responseData;
    }

}
