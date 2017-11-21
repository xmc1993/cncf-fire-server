package com.cncf.service;

import com.cncf.entity.User;
import com.cncf.entity.UserBase;

/**
 * Created by xmc1993 on 2017/10/14.
 */
public interface UserService {
	
    //这个是用户注册时的获取验证码的服务
    String getVerifyCode(User user);

    User getUserByMobile(String mobile);
    
    //根据手机号获取验证码，这个是修改密码，找回密码(已经存在的用户)；
    String getVerifyCode(String mobile);

    /**
     * 校验验证码 0:参数有误 1:验证码错误 2:验证码已经失效
     * @param user
     * @param verifyCode
     * @return
     */
    boolean checkVerifyCode(User user, String verifyCode);

    //UserBase getUserBaseById(int userId);

    boolean updateUser(User user);

    User getUserById(int userId);
    

}
