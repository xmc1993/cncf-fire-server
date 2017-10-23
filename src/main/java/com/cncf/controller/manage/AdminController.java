package com.cncf.controller.manage;

import com.cncf.entity.Admin;
import com.cncf.response.ResponseData;
import com.cncf.service.AdminService;
import com.cncf.util.JedisUtil;
import com.cncf.util.ObjectAndByte;
import com.cncf.util.Util;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Api(value = "Admin", description = "管理接口")
@Controller
@RequestMapping("/manage/admin")
public class AdminController {

    private static final Log logger = LogFactory.getLog(AdminController.class);
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "登录", notes = "")
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Admin> login(@ApiParam("管理员用户名") @RequestParam("adminName") String adminName,
                                     @ApiParam("管理员密码") @RequestParam("password") String password,
                                     HttpServletRequest request, HttpServletResponse response) {
        logger.info("login called");
        ResponseData<Admin> responseData = new ResponseData<>();
        Admin admin = adminService.getAdminByName(adminName);
        if (admin == null) {
            responseData.jsonFill(2, "管理员不存在", null);
            return responseData;
        }
        if (!admin.getPassword().equals(password)) {
            responseData.jsonFill(2, "账号密码不一致", null);
            return responseData;
        }

        admin.setAccessToken(Util.getToken());
        boolean res = adminService.updateAccessToken(admin);
        if (!res) {
            responseData.jsonFill(2,"登录失败，服务器错误。",null);
        }

        // 在缓存中存入登录信息
        Jedis jedis = JedisUtil.getJedis();
        jedis.set(admin.getAccessToken().getBytes(), ObjectAndByte.toByteArray(admin));
        jedis.expire(admin.getAccessToken().getBytes(), 60 * 60 * 6);// 缓存用户信息6小时
        jedis.close();
        responseData.jsonFill(1,null, admin);
        return responseData;
    }

    @ApiOperation(value = "退出", notes = "")
    @RequestMapping(value = "logout", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> logout(HttpServletRequest request, HttpServletResponse response) {
        ResponseData<Boolean> responseData = new ResponseData<Boolean>();
        responseData.jsonFill(1, null, true);
        HttpSession session = request.getSession(false);
        if (session == null) {
            return responseData;
        }
        session.removeAttribute("admin");
        return responseData;
    }

    @ApiOperation(value = "注册", notes = "")
    @RequestMapping(value = "/regist", method = {RequestMethod.POST})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseData<Admin> regist(@ApiParam("管理员用户名") @RequestParam("adminName") String adminName,
                                      @ApiParam("管理员密码") @RequestParam("password") String password) {
        logger.info("regist called");
        System.err.println("进入注册方法");
        ResponseData<Admin> responseData = new ResponseData<>();
        if (adminService.getAdminByName(adminName) != null) {
            responseData.jsonFill(2, "用户名已存在(adminName already exist)", null);
            return responseData;
        }
        Admin admin=new Admin(); admin.setAdminName(adminName);
        admin.setPassword(password); admin.setRegistTime(new Date());
        if (!adminService.saveAdmin(admin)) {
            responseData.jsonFill(2, "注册失败", null);
            return responseData;
        } else{
            responseData.jsonFill(1, null, admin);
            return responseData;
        }
    }
}
