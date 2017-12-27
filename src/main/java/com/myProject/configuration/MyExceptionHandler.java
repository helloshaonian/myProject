package com.myProject.configuration;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.json.JSONException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler   {
	
	/**
	 * shiro权限验证失败异常
	 * @param request
	 * @param response
	 * @param exp
	 */
	@ExceptionHandler(value = org.apache.shiro.authz.AuthorizationException.class)
	public void test(ServletRequest request,
			ServletResponse response,Exception exp){
		exp.printStackTrace();
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        if (!StringUtils.contains(httpServletRequest.getRequestURI(), "/v1/login")) {
            String requestedWith = httpServletRequest.getHeader("X-Requested-With");
            if (StringUtils.isNotEmpty(requestedWith) && StringUtils.equals(requestedWith, "XMLHttpRequest")) {//未登录ajax请求拦截处理
            	HashMap<String,String> map=new HashMap<String,String>();
            	map.put("LOGIN_STATUS", "401");
                httpServletResponse.setCharacterEncoding("UTF-8");
                httpServletResponse.setContentType("application/json");
                try {
					httpServletResponse.getWriter().write(org.json.JSONObject.valueToString(map));
				} catch (JSONException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
                return ;
            } else {//
                try {
					httpServletResponse.sendRedirect("/v1/login");
				} catch (IOException e) {
					e.printStackTrace();
				}
                return;
            }
        }
	}

	
	
}
