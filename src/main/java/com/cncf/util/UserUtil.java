package com.cncf.util;

import com.cncf.entity.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xmc1993 on 2017/10/14.
 */
public class UserUtil {

    public static void shieldPirvateInfo(User user){
        user.setPassword("");
        user.setVerifyCode("");
        user.setExpireTime(null);
    }

    public static User getSessionUser(HttpServletRequest request){
        User user = (User) request.getAttribute(TokenConfig.DEFAULT_USERID_REQUEST_ATTRIBUTE_NAME);
        return user;
    }
}
