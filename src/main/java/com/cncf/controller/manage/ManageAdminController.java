package com.cncf.controller.manage;

import com.cncf.annotation.RequiredPermissions;
import com.cncf.entity.Admin;
import com.cncf.response.ResponseData;
import com.cncf.service.AdminPowerService;
import com.cncf.service.AdminService;
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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author zj
 */
@Api(value = "Admin", description = "管理接口")
@Controller
@RequestMapping("/manage/admin")
public class ManageAdminController {

    private static final Log logger = LogFactory.getLog(ManageAdminController.class);
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminPowerService adminPowerService;

    @ApiOperation(value = "登录", notes = "")
    @RequestMapping(value = "login", method = {RequestMethod.POST})
    @ResponseBody
    public ResponseData<LoginVo> login(@ApiParam("管理员用户名") @RequestParam("adminName") String adminName,
                                       @ApiParam("管理员密码") @RequestParam("password") String password) {
        logger.info("login called");
        ResponseData<LoginVo> responseData = new ResponseData<>();
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
            responseData.jsonFill(2, "登录失败，服务器错误。", null);
        }

        // 在缓存中存入登录信息
        Jedis jedis = JedisUtil.getJedis();
        //是否需要清除就的且依然可以使用的token，也就是是否允许多处登录。
        //如果不清除，redis里面的token多了容易重复，重复就会覆盖，所以考虑是否在将token存入redis中之前先检查是否已存在。
        //jedis.del()

        jedis.set(admin.getAccessToken().getBytes(), ObjectAndByte.toByteArray(admin));
        jedis.expire(admin.getAccessToken().getBytes(), 60 * 60 * 6);// 缓存用户信息6小时
        jedis.close();

        List<Integer> codeList = adminPowerService.getAdminPowerCodeListByAdminId(admin.getAdminId());

        LoginVo loginVo = new LoginVo();
        loginVo.setId(admin.getAdminId());
        loginVo.setAccessToken(admin.getAccessToken());
        loginVo.setCodeIds(codeList);
        responseData.jsonFill(1, null, loginVo);
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

    @RequiredPermissions({ 11, 15 })
    @ApiOperation(value = "注册", notes = "")
    @RequestMapping(value = "/regist", method = {RequestMethod.POST})
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseData<Admin> regist(@ApiParam("管理员用户名（最多20个字符/汉字）") @RequestParam("adminName") String adminName,
                                      @ApiParam("管理员密码（最多20个字符）") @RequestParam("password") String password) {
        logger.info("regist called");
        ResponseData<Admin> responseData = new ResponseData<>();
        if (adminService.getAdminByName(adminName) != null) {
            responseData.jsonFill(2, "用户名已存在(adminName already exist)", null);
            return responseData;
        }
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        admin.setPassword(password);
        admin.setRegistTime(new Date());
        if (!adminService.saveAdmin(admin)) {
            responseData.jsonFill(2, "注册失败", null);
            return responseData;
        } else {
            responseData.jsonFill(1, null, admin);
            System.err.println(admin.getRegistTime());
            return responseData;
        }
    }

    @ApiOperation(value = "获取所有的后台用户", notes = "")
    @RequestMapping(value = "selectAllAdmin", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseData<List<Admin>> selectAllAdmin() {
        List<Admin> AdminList = adminService.selectAllAdmin();
        ResponseData<List<Admin>> responseData = new ResponseData<>();
        responseData.jsonFill(1, null, AdminList);
        return responseData;
    }

    @ApiOperation(value = "删除后台用户", notes = "")
    @RequestMapping(value = "deleteAdmin/{id}", method = {RequestMethod.DELETE})
    @ResponseBody
    public ResponseData<Boolean> deleteAdmin(@ApiParam("后台用户ID") @PathVariable Integer id) {
        ResponseData<Boolean> responseData = new ResponseData<>();
        boolean res = adminService.deleteAdmin(id);
        if (!res) {
            responseData.jsonFill(2, "删除失败", false);
            return responseData;
        }
        responseData.jsonFill(1, "删除成功", true);
        return responseData;
    }

}
