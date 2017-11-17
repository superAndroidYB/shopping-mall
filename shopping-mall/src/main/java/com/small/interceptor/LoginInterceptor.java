package com.small.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.small.common.Constants;
import com.small.user.model.SysUser;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		//获取session
        HttpSession session = request.getSession(true);
        SysUser user = (SysUser)session.getAttribute(Constants.SESSION_USER);
        if(user == null){
        	response.sendRedirect(request.getContextPath()+"/systemlogin");
        	return false;
        }else{
        	return true;
        }
	}

}
