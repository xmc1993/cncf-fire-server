package com.cncf.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthInterceptor废弃 extends HandlerInterceptorAdapter {

    private static Logger logger = LoggerFactory.getLogger(AuthInterceptor废弃.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logger.info("************:" + request.getRequestURI());
        System.out.println("进入了preHandle()方法");
        if (request.getSession().getAttribute("admin")==null){
            System.out.println("验证，无session");
            return false;
        }
        System.out.println("验证，有session");
        return super.preHandle(request, response, handler);
    }

}
