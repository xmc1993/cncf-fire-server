package com.cncf.controller;

import com.cncf.entity.Admin;
import com.cncf.response.ResponseData;
import com.cncf.service.AdminService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Api(value = "Admin", description = "管理接口")
@Controller
@RequestMapping("admin")
public class AdminController {

    private static final Log logger = LogFactory.getLog(AdminController.class);
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "登录", notes = "")
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> login(String adminName, String password, HttpServletRequest request, HttpServletResponse response) {
        logger.info("login called");
        ResponseData<String> responseData = new ResponseData<String>();
        Admin admin = adminService.getAdminByName(adminName);
        if (admin == null) {
            responseData.jsonFill(2, "管理员不存在", null);
            return responseData;
        }
        if (!admin.getPassword().equals(password)) {
            responseData.jsonFill(2, "账号密码不一致", null);
            return responseData;
        }
        request.getSession().setAttribute("admin", admin);
        responseData.jsonFill(2, "登陆成功", null);

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

    @RequestMapping(value = "regist", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<String> regist(Admin admin) {
        logger.info("regist called");
        ResponseData<String> responseData = new ResponseData<String>();
        if (adminService.getAdminByName(admin.getAdminName()) != null) {
            responseData.jsonFill(2, "用户名已存在(adminName already exist)", null);
            return responseData;
        }
        if (!adminService.saveAdmin(admin)) {
            System.err.println("注册失败");
            responseData.jsonFill(2, "注册失败", null);
            return responseData;
        } else
            responseData.jsonFill(2, "注册成功", null);
        return responseData;
    }
}
