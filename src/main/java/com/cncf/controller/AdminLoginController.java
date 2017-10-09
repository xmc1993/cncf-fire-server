package com.cncf.controller;

import com.cncf.entity.Admin;
import com.cncf.service.AdminService;
import com.cncf.utils.Util;
import com.github.pagehelper.util.StringUtil;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Api(value = "Admin", description = "管理接口")
@Controller
public class AdminLoginController {

	@Autowired
	private AdminService adminService;

	@ApiOperation(value = "登录", notes = "")
	@RequestMapping(value = "login", method = { RequestMethod.POST })
	@ResponseBody
	public String login(
			@ApiParam("用户名") @RequestParam("adminName") String adminName,
			@ApiParam("密码(用md5加密)") @RequestParam("password") String password,
			HttpServletRequest request, HttpServletResponse response) {
		Admin admin = adminService.getAdminByName(adminName);
		if (admin == null) {
			return "管理员不存在";
		}
		// todo 更严格的安全校验
		if (!admin.getPassword().equals(password)) {
			return "账号密码不一致";
		}
		admin.setAccessToken(Util.getToken());
		long currentTime = System.currentTimeMillis();
		currentTime += 1000 * 60 * 60 * 6;// 设置为6小时后失效
		admin.setExpireTime(new Date(currentTime));
		boolean res = adminService.updateAccessToken(admin);
		if (!res) {
			return "登录失败，服务器错误。";
		}

		request.getSession().setAttribute("admin",admin);
		return "登陆成功";
	}

	@ApiOperation(value = "退出", notes = "")
	@RequestMapping("logout")
	@ResponseBody
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		String accessToken = request.getHeader("Authorization");
		if (!StringUtil.isEmpty(accessToken)) {
			// 注销管理员的session信息
			HttpSession session=request.getSession(false);
			if (session==null){
				return;
			}
			Admin admin=(Admin)session.getAttribute("admin");
			session.removeAttribute("admin");

		}
	}
}
