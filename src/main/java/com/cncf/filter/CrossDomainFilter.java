package com.cncf.filter;

import org.apache.http.entity.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import org.apache.http.entity.ContentType;

/**
 * Filter比Spring的Intercepter更早介入请求生命周期，所以可以更早的处理OPTIONS请求.
 * 
 * 这个Filter在{@link }中引入.
 */
public class CrossDomainFilter implements Filter {
  private static final Logger LOG = LoggerFactory.getLogger(CrossDomainFilter.class);

  private volatile boolean allowCrossDomain = true;
  
  @Override
	public void init(FilterConfig config) throws ServletException {
  	allowCrossDomain = Boolean.valueOf(config.getInitParameter("allowCrossDomain"));
	}
  
	@Override
	public void doFilter(ServletRequest rq, ServletResponse rs,
			FilterChain filterChain) throws IOException, ServletException {

	HttpServletRequest request = (HttpServletRequest) rq;
    HttpServletResponse response = (HttpServletResponse) rs;
    if (response.getContentType() == null || response.getContentType().isEmpty()) {
      response.setContentType(ContentType.APPLICATION_JSON.toString());
    }

    // 设置允许跨域访问
    //LOG.info("Request Orign = {}", request.getHeader("Origin"));

    if (allowCrossDomain) {
      //LOG.info("允许客户端跨域访问");
      // 重要：clientIp不能为*，否则session无法传递到服务器端.
      response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
      response.addHeader("Access-Control-Allow-Credentials", "true");

      /**
       * 处理 Preflight 情况下的额外返回数据:
       * https://developer.mozilla.org/en-US/docs/Web/HTTP/Access_control_CORS#Preflighted_requests
       * 需要确认 Preflight 是有效的请求，而不是直接进行的OPTIONS操作.
       */
      if (request.getHeader("Access-Control-Request-Method") != null
          && "OPTIONS".equalsIgnoreCase(request.getMethod())) {
        response.addHeader("Access-Control-Allow-Methods", "GET, POST");
        response.addHeader("Access-Control-Allow-Headers",
            "Accept,Authorization,Cache-Control,Content-Type,DNT,If-Modified-Since,Keep-Alive,Origin,User-Agent,X-Requested-With");
      }
      // response.addCookie(new Cookie("test-random-time", System.currentTimeMillis() + ""));
      filterChain.doFilter(request, response);
    }
  }

	@Override
	public void destroy() {
	}

	public void setAllowCrossDomain(boolean allowCrossDomain) {
    this.allowCrossDomain = allowCrossDomain;
  }

}
