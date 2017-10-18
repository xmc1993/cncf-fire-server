package com.cncf.service.impl;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.cncf.dao.UserDao;
import com.cncf.entity.User;
import com.cncf.entity.UserBase;
import com.cncf.service.UserService;
import com.cncf.util.SmsUtils;
import com.cncf.util.Util;
import com.github.pagehelper.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by xmc1993 on 2017/10/14.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public String getVerifyCode(User user) {
        User userIndb = userDao.getUserByMobile(user.getMobile());
        if (userIndb != null && userIndb.getIdentification() == 1) {
            return null;
        }
        String verifyCode = Util.getRandomCode();
        try {
            SendSmsResponse res = SmsUtils.sendMessage("SMS_101110009", user.getMobile(), verifyCode);
        } catch (ClientException e) {
            e.printStackTrace();
            logger.info("send code:" + verifyCode + " to " + user.getMobile() + "\n");
            return null;
        }
        boolean emptyFlag = userIndb == null ? true : false;
        User tempUser = userIndb;
        if (tempUser == null) {
            tempUser = new User();
        }
        tempUser.setMobile(user.getMobile());
        tempUser.setCreateTime(new Date());
        tempUser.setUpdateTime(new Date());
        tempUser.setVerifyCode(verifyCode);
        //失效时间为30分钟
        long now = System.currentTimeMillis();
        now += 30 * 60 * 1000;
        Date date = new Date(now);
        tempUser.setExpireTime(date);

        boolean res;
        if (emptyFlag) {
            res = userDao.saveUser(tempUser);
        } else {
            res = userDao.updateUser(tempUser);
        }
        if (!res) {
            return null;
        }
        return verifyCode;
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

	@Override
	public String getVerifyCode(String mobile) {
        User user = userDao.getUserByMobile(mobile);
        if(user==null){
        	return null;
        }
        String verifyCode = Util.getRandomCode();
        try {
            SendSmsResponse res = SmsUtils.sendMessage("SMS_101110009", user.getMobile(), verifyCode);
        } catch (ClientException e) {
            e.printStackTrace();
            logger.info("send update code:" + verifyCode + " to " + user.getMobile() + "\n");
            return null;
        }
        user.setVerifyCode(verifyCode);
        
        //过期时间半小时
        long now = System.currentTimeMillis();
        now += 30 * 60 * 1000;
        Date date = new Date(now);
        user.setExpireTime(date);
        
        boolean res=userDao.updateUser(user);
        if(res==false){
        	return null;
        }
		return verifyCode;
	}
}
