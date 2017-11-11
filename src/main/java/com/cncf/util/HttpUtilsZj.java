package com.cncf.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by zj on 2017/8/24.
 */
public class HttpUtilsZj {
    private String[] IEBrowserSignals = {"MSIE", "Trident", "Edge"};

    public boolean isMSBrowser(HttpServletRequest request) {
        String userAgent = request.getHeader("User-Agent");
        for (String signal : IEBrowserSignals) {
            //控制器Mock单元测试时不经过浏览器，所以userAgent为空,如果不判断会报空指针异常
            if (userAgent!=null){
                if (userAgent.contains(signal))
                    return true;
            }
        }
        return false;
    }

    public void iteratorResponse(HttpServletResponse response){
        System.out.println("响应头信息：");
        Iterator<String> iterator=response.getHeaderNames().iterator();
        while (iterator.hasNext()){
            String headerName=iterator.next();
            System.out.println(headerName+":  "+response.getHeader(headerName));
        }
    }

    public void iteratorRequest(HttpServletRequest request){
        System.out.println("请求头信息");
        Enumeration enumeration = request.getHeaderNames();
        while (enumeration.hasMoreElements()) {
            String headName = (String) enumeration.nextElement();
            System.out.println(headName + ":" + request.getHeader(headName) + "   ");
        }
    }

    public String getCookieValByName(HttpServletRequest request,String cookieName){
        Cookie[] cookies=request.getCookies();
        String value=null;
        System.out.println("遍历cookies:");
        for (Cookie cookie:cookies){
            System.out.println(cookie.getName()+"="+cookie.getValue());
            if (cookie.getName().equals(cookieName))
                value=cookie.getValue();
        }
        return value;
    }

    public boolean createCookie(HttpServletResponse response,HttpServletRequest request){
        Cookie cookie=new Cookie("currentPage","1");
        //cookie.setPath("/");//根路径,默认值
        response.addCookie(cookie);
        return true;
    }
}
