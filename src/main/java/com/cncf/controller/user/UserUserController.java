package com.cncf.controller.user;

import com.cncf.entity.User;
import com.cncf.entity.UserBase;
import com.cncf.response.ResponseData;
import com.cncf.service.UserService;
import com.cncf.util.*;
import com.cncf.vo.LoginVo;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@RequestMapping("/user/user")
public class UserUserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取注册验证码", notes = "获取注册验证码")
    @RequestMapping(value = "/getRegisterVerifyCode", method = {RequestMethod.POST})
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
    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData register(
            @ApiParam("手机号") @RequestParam("mobile") String mobile,
            @ApiParam("密码") @RequestParam("password") String password,
            @ApiParam("验证码") @RequestParam("verifyCode") String verifyCode,
            @ApiParam("真实姓名") @RequestParam(value = "realName", required = false) String realName,
            @ApiParam("性别") @RequestParam(value = "sex", required = false) String sex,
            @ApiParam("公司") @RequestParam(value = "company", required = false) String company,
            @ApiParam("详细地址") @RequestParam(value = "detailAddress", required = false) String detailAddress,
            @ApiParam("邮箱") @RequestParam(value = "email", required = false) String email,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            responseData.jsonFill(2, "获取验证码出错。", null);
            return responseData;
        }
        if (user.getIdentification() == 1) {
            responseData.jsonFill(2, "该号码已被注册。", null);
            return responseData;
        }
        if (!userService.checkVerifyCode(user, verifyCode)) {
            responseData.jsonFill(2, "验证码无效。", null);
            return responseData;
        } else {
            user.setRealName(realName);
            user.setSex(sex);
            user.setCompany(company);
            user.setDetailAddress(detailAddress);
            user.setEmail(email);
            user.setPassword(password);
            user.setIdentification(1);
            boolean res = userService.updateUser(user);
            if (res) {
                responseData.setStatus(1);
            } else {
                responseData.jsonFill(2, "注册失败服务器错误。", null);
            }
        }

        return responseData;
    }

    @ApiOperation(value = "更新个人信息", notes = "")
    @RequestMapping(value = "/updateProfile", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData updateProfile(
            @ApiParam("昵称") @RequestParam(value = "nickname", required = false) String nickname,
            @ApiParam("真实姓名") @RequestParam(value = "realName", required = false) String realName,
            @ApiParam("性别") @RequestParam(value = "sex", required = false) String sex,
            @ApiParam("公司") @RequestParam(value = "company", required = false) String company,
            @ApiParam("详细地址") @RequestParam(value = "detailAddress", required = false) String detailAddress,
            @ApiParam("邮箱") @RequestParam(value = "email", required = false) String email,
            @ApiParam("QQ") @RequestParam(value = "qq", required = false) String qq,
            @ApiParam("主页") @RequestParam(value = "homepage", required = false) String homepage,
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        //用户想要修改自己的信息，须通过AccessTokenValidationInterceptor验证登录，然后将user存入request然后拦截器放行，
        // 请求来到这里从存入request中的user中取userId来用
        User user = UserUtil.getSessionUser(request);
        user = userService.getUserById(user.getId());
        if (nickname != null)
            user.setNickname(nickname);
        if (realName != null)
            user.setRealName(realName);
        if (sex != null)
            user.setSex(sex);
        if (company != null)
            user.setCompany(company);
        if (detailAddress != null)
            user.setDetailAddress(detailAddress);
        if (email != null)
            user.setEmail(email);
        if (qq != null)
            user.setQq(qq);
        if (homepage != null)
            user.setHomepage(homepage);
        boolean res = userService.updateUser(user);
        if (!res) {
            responseData.jsonFill(2, "更新失败", null);
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "根据ID获得信息", notes = "")
    @RequestMapping(value = "/getProfileByUserId", method = {RequestMethod.GET})
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
    public ResponseData<LoginVo> login(@ApiParam("手机号") @RequestParam("mobile") String mobile,
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
            //刷新token，会话30天失效。相当于网站的30天内自动登录
            jedis.expire(user.getAccessToken().getBytes(), 60 * 60 * 24 * 30);
        } catch (Exception e) {
            responseData.jsonFill(2, "登录失败，服务器错误。", null);
            return responseData;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        UserBase userBase = new UserBase();
        LoginVo loginVo = new LoginVo();
        loginVo.setId(user.getId());
        loginVo.setAccessToken(user.getAccessToken());
        BeanUtils.copyProperties(user, userBase);
        loginVo.setUserBase(userBase);
        responseData.jsonFill(1, null, loginVo);
        return responseData;
    }

    @ApiOperation(value = "登出", notes = "登出")
    @RequestMapping(value = "/logout", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> login(
            HttpServletRequest request, HttpServletResponse response) {
        ResponseData<Boolean> responseData = new ResponseData();
        String accessToken = request.getHeader(TokenConfig.DEFAULT_ACCESS_TOKEN_HEADER_NAME);
        if (accessToken == null) {
            responseData.jsonFill(2, "用户未登录", null);
            return responseData;
        }
        //登录信息写入缓存
        Jedis jedis = null;
        try {
            jedis = JedisUtil.getJedis();
            jedis.del(accessToken.getBytes());
            //刷新token，会话30天失效。相当于网站的30天内自动登录
        } catch (Exception e) {
            responseData.jsonFill(2, "登出失败，服务器错误", null);
            return responseData;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        responseData.jsonFill(1, null, true);
        return responseData;
    }

    @ApiOperation(value = "手机号获取验证码", notes = "获取修改密码，找回密码的验证码")
    @RequestMapping(value = "/getPasswordVerifyCode", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData getPasswordVerifyCode(@ApiParam("mobile") @RequestParam("mobile") String mobile,
                                              HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData();
        if (!Util.isPhoneNumber(mobile)) {
            responseData.setErrorMes("手机号格式不正确");
            responseData.setStatus(2);
            return responseData;
        }
        String cod = userService.getVerifyCode(mobile);
        if (cod == null) {
            responseData.setErrorMes("获取验证码失败");
            responseData.setStatus(2);
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "找回密码")
    @RequestMapping(value = "/retrievePassword", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<User> retrievePassword(@ApiParam("手机号") @RequestParam("mobile") String mobile,
                                               @ApiParam("验证码") @RequestParam("verifyCode") String verifyCode,
                                               HttpServletRequest request, HttpServletResponse response) {
        ResponseData<User> responseData = new ResponseData<>();
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            responseData.setErrorMes("用户不存在");
            responseData.setStatus(2);
            return responseData;
        }
        boolean res = userService.checkVerifyCode(user, verifyCode);
        if (res == true) {
            responseData.setStatus(1);
            responseData.setObj(user);
            return responseData;
        }
        responseData.setStatus(2);
        responseData.setErrorMes("验证码错误");
        return responseData;
    }

    @ApiOperation(value = "修改密码")
    @RequestMapping(value = "/updatePassword", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData updatePassword(@ApiParam("手机号") @RequestParam("mobile") String mobile,
                                       @ApiParam("验证码") @RequestParam("verifyCode") String verifyCode,
                                       @ApiParam("要修改为啥密码") @RequestParam("passWord") String passWord,
                                       HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData<>();
        User user = userService.getUserByMobile(mobile);
        if (user == null) {
            responseData.setErrorMes("用户不存在");
            responseData.setStatus(2);
            return responseData;
        }
        boolean res = userService.checkVerifyCode(user, verifyCode);
        if (res == true) {
            boolean success = false;
            user.setUpdateTime(new Date());
            user.setPassword(passWord);
            success = userService.updateUser(user);
            if (success == true) {
                responseData.setStatus(1);
                return responseData;
            }
            responseData.setStatus(2);
            responseData.setErrorMes("修改密码失败");
            return responseData;
        }
        responseData.setStatus(2);
        responseData.setErrorMes("验证码错误");
        return responseData;
    }

    @ApiOperation(value = "变更绑定手机", notes = "需要登录")
    @RequestMapping(value = "/updatePhoneNumber", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData updatePhoneNumber(@ApiParam("手机号") @RequestParam("mobile") String mobile,
                                          HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData<>();
        User user = (User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        if (user == null) {
            responseData.setStatus(2);
            responseData.setErrorMes("用户未登录");
            return responseData;
        }
        user.setUpdateTime(new Date());
        user.setMobile(mobile);
        boolean res = userService.updateUser(user);
        if (res == false) {
            responseData.setStatus(2);
            responseData.setErrorMes("更新失败");
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }

    @ApiOperation(value = "修改头像", notes = "需要登录")
    @RequestMapping(value = "/updateHeadimgUrl", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData updateHeadimgUrl(@ApiParam("头像Url") @RequestParam("headImgUrl") String headImgUrl,
                                         HttpServletRequest request, HttpServletResponse response) {
        ResponseData responseData = new ResponseData<>();
        User user = (User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        if (user == null) {
            responseData.setStatus(2);
            responseData.setErrorMes("用户未登录");
            return responseData;
        }
        //如果用户头像存在，先在服务器把头像给删了
        if (user.getHeadImgUrl() != null || !user.getHeadImgUrl().isEmpty()) {
            FileUtil.deleteFile(user.getHeadImgUrl());
        }

        user.setUpdateTime(new Date());
        user.setHeadImgUrl(headImgUrl);
        boolean res = userService.updateUser(user);
        if (res == false) {
            responseData.setStatus(2);
            responseData.setErrorMes("更新头像失败");
            return responseData;
        }
        responseData.setStatus(1);
        return responseData;
    }
}
