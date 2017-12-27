package com.myProject.configuration.shiro;

import java.util.HashMap;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;


public class ShiroLoginFilter extends AccessControlFilter  {

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated() && !StringUtils.contains(httpServletRequest.getRequestURI(), "/v1/login")) {
            String requestedWith = httpServletRequest.getHeader("X-Requested-With");
            if (StringUtils.isNotEmpty(requestedWith) && StringUtils.equals(requestedWith, "XMLHttpRequest")) {//未登录ajax请求拦截处理
            	HashMap<String,String> map=new HashMap<String,String>();
            	map.put("LOGIN_STATUS", "401");
                httpServletResponse.setCharacterEncoding("UTF-8");
                httpServletResponse.setContentType("application/json");
                httpServletResponse.getWriter().write(org.json.JSONObject.valueToString(map));
                return false;
            } else {//
                httpServletResponse.sendRedirect("/v1/login");
                return false;
            }
        }
        return true;
	}
}
