package com.cncf.service.impl;

import com.cncf.dao.UserDao;
import com.cncf.entity.User;
import com.cncf.entity.UserBase;
import com.cncf.service.UserService;
import com.github.pagehelper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xmc1993 on 2017/10/14.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String getVerifyCode(User user) {
        return null;
    }

    @Override
    public User getUserByMobile(String mobile) {
        return userDao.getUserByMobile(mobile);
    }

    @Override
    public boolean checkVerifyCode(User user, String verifyCode) {
        //排除无效的情况
        if (user == null || StringUtil.isEmpty(verifyCode) || user.getVerifyCode() == null || user.getExpireTime() == null)
            return false;
        Date now = new Date();
        //仅仅当验证码相同且验证码没有过期才通过验证
        if (user.getVerifyCode().equals(verifyCode) && now.compareTo(user.getExpireTime()) < 0) {
            //清除使用过的验证码
            userDao.updateVerifyCode(user.getId(), "");
            return true;
        }
        return false;
    }

    @Override
    public UserBase getUserBaseById(int userId) {
        return userDao.getUserBaseById(userId);
    }

    @Override
    public boolean updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public User getUserById(int userId) {
        return userDao.getUserById(userId);
    }
}
