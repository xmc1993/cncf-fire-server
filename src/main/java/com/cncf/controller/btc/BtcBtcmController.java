package com.cncf.controller.btc;

import com.cncf.entity.Btcm;
import com.cncf.response.ResponseData;
import com.cncf.service.BtcmService;
import com.cncf.util.JedisUtil;
import com.cncf.util.ObjectAndByte;
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

/**
 * @author zj
 * @date 2017/10/27 21:32
 */
@Api(value = "BTCM", description = "和委员有关的接口")
@Controller
@RequestMapping("/btc/btcm")
public class BtcBtcmController {
    private static final Log logger = LogFactory.getLog(BtcBtcmController.class);
    @Autowired
    private BtcmService btcmService;

    @ApiOperation(value = "委员登录", notes = "")
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<LoginVo> login(
            @ApiParam("委员账号") @RequestParam("code") String code,
            @ApiParam("密码") @RequestParam("password") String password){
        logger.info("login called");
        ResponseData<LoginVo> responseData = new ResponseData<>();
        Btcm btcm=btcmService.getBtcmByCode(code);
        if (btcm==null){
            responseData.jsonFill(2,"该账号不存在",null);
            return responseData;
        }
        if (!btcm.getPassword().equals(password)){
            responseData.jsonFill(2, "账号密码不一致", null);
            return responseData;
        }
        btcm.setAccessToken(Util.getToken());
        boolean res=btcmService.updateAccessToken(btcm);
        if (!res) {
            responseData.jsonFill(2,"登录失败，服务器错误。",null);
        }

        // 在缓存中存入登录信息
        Jedis jedis = JedisUtil.getJedis();
        jedis.set(btcm.getAccessToken().getBytes(), ObjectAndByte.toByteArray(btcm));
        jedis.expire(btcm.getAccessToken().getBytes(), 60 * 60 * 6);// 缓存用户信息6小时
        jedis.close();

        LoginVo loginVo=new LoginVo();
        loginVo.setId(btcm.getId());
        loginVo.setAccessToken(btcm.getAccessToken());
        responseData.jsonFill(1,null, loginVo);
        return responseData;
    }

}
