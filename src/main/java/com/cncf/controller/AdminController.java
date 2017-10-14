package com.cncf.controller;

import com.cncf.entity.Admin;
import com.cncf.service.AdminService;
import com.github.pagehelper.util.StringUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

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
    public String login(String adminName, String password, HttpServletRequest request, HttpServletResponse response) {
        logger.info("login called");
        Admin admin = adminService.getAdminByName(adminName);
        if (admin == null) {
            return "管理员不存在";
        }
        if (!admin.getPassword().equals(password)) {
            return "账号密码不一致";
        }
        request.getSession().setAttribute("admin", admin);
        return "登陆成功";
    }

    @ApiOperation(value = "退出", notes = "")
    @RequestMapping("logout")
    @ResponseBody
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute("admin");
    }

    @RequestMapping(value = "regist", method = {RequestMethod.POST})
    @ResponseBody
    public String regist(Admin admin) {
        logger.info("regist called");
        System.out.println("访问了regist");

        if (adminService.getAdminByName(admin.getAdminName())!=null){
            return "用户名已存在(adminName already exist)";
        }
        if (!adminService.saveAdmin(admin)){
            System.err.println("注册失败");
            return "注册失败(false)";
        }
        else
            //return "注册成功(success)";
            return "test";
    }
}
