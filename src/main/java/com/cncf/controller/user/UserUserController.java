package com.cncf.controller.user;

import com.cncf.entity.User;
import com.cncf.entity.UserBase;
import com.cncf.response.ResponseData;
import com.cncf.service.UserService;
import com.cncf.util.JedisUtil;
import com.cncf.util.ObjectAndByte;
import com.cncf.util.UserUtil;
import com.cncf.util.Util;
import com.cncf.vo.LoginVo;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user/user")
public class UserUserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取注册验证码", notes = "获取注册验证码")
    @RequestMapping(value = "/getRegisterVerifyCode", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData getVerifyCode(@ApiParam("mobile") @RequestParam("mobile") String mobile,
                                      HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        if (!Util.isPhoneNumber(mobile)) {
            responseData.setErrorMes("手机号格式不正确");
            responseData.setStatus(2);
            return responseData;
        }
        User user = new User();
        user.setMobile(mobile);
        String code = userService.getVerifyCode(user);
        if (code == null) {
            responseData.setErrorMes("该手机已注册");
            responseData.setStatus(2);
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "注册", notes = "注册")
    @RequestMapping(value = "/register", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData register(@ApiParam("手机号") @RequestParam("mobile") String mobile,
                                 @ApiParam("密码") @RequestParam("password") String password,
                                 @ApiParam("验证码") @RequestParam("verifyCode") String verifyCode,
                                 HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            responseData.jsonFill(2, "获取验证码出错。", null);
            return responseData;
        }
        if (!userService.checkVerifyCode(user, verifyCode)) {
            responseData.jsonFill(2, "验证码无效。", null);
            return responseData;
        } else {
            user.setPassword(password);
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "更新个人信息", notes = "")
    @RequestMapping(value = "/updateProfile", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData updateProfile(
            @ApiParam("昵称") @RequestParam("nickname") String nickname,
            @ApiParam("真实姓名") @RequestParam("realName") String realName,
            @ApiParam("性别") @RequestParam("sex") String sex,
            @ApiParam("公司") @RequestParam("company") String company,
            @ApiParam("城市") @RequestParam("city") String city,
            @ApiParam("邮箱") @RequestParam("email") String email,
            @ApiParam("QQ") @RequestParam("qq") String qq,
            @ApiParam("主页") @RequestParam("homepage") String homepage,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        User user = UserUtil.getSessionUser(request);
        user = userService.getUserById(user.getId());
        user.setNickname(nickname);
        user.setRealName(realName);
        user.setSex(sex);
        user.setCompany(company);
        user.setCity(city);
        user.setEmail(email);
        user.setQq(qq);
        user.setHomepage(homepage);
        boolean res = userService.updateUser(user);
        if (!res){
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得信息", notes = "")
    @RequestMapping(value = "/getProfileByUserId", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<UserBase> getProfileByUserId(
            @ApiParam("用户ID") @RequestParam("userId") Integer userId
    ) {
        ResponseData<UserBase> responseData = new ResponseData();
        UserBase user = userService.getUserBaseById(userId);
        if (user == null) {
            responseData.jsonFill(2, "用户不存在", null);
            return responseData;
        }
        responseData.jsonFill(1, null, user);
        return responseData;
    }


    @ApiOperation(value = "登录", notes = "登录")
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<LoginVo> register(@ApiParam("手机号") @RequestParam("mobile") String mobile,
                                 @ApiParam("密码") @RequestParam("password") String password,
                                 HttpServletRequest request, HttpServletResponse response) {
        ResponseData<LoginVo> responseData = new ResponseData();
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            responseData.jsonFill(2, "用户不存在", null);
            return responseData;
        }
        if (!user.getPassword().equals(password)) {
            responseData.jsonFill(2, "用户名或密码错误。", null);
            return responseData;
        }
        Util.setNewAccessToken(user);

        //登录信息写入缓存
        Jedis jedis = null;
        try {
            jedis = JedisUtil.getJedis();
            jedis.set(user.getAccessToken().getBytes(), ObjectAndByte.toByteArray(user));
            jedis.expire(user.getAccessToken().getBytes(), 60 * 60 * 1);//会话1小时失效
        }catch (Exception e){
            responseData.jsonFill(2, "登录失败，服务器错误。", null);
            return responseData;
        }finally {
            if (jedis != null){
                jedis.close();
            }
        }
        LoginVo loginVo = new LoginVo();
        loginVo.setId(user.getId());
        loginVo.setAccessToken(user.getAccessToken());
        return responseData;
    }



}
