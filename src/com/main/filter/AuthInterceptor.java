package com.main.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Ȩ�޿���
 * @author gyc
 *
 */
public class AuthInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String userName = (String) request.getSession().getAttribute("userName");
		if(userName != null) {
			return true;
		}
		
		//@params getQueryString()�õ�get�������
		//@params getRequestURI() �������ʵ�url
		StringBuilder addr = new StringBuilder();
		if(request.getQueryString() != null) {
			addr.append(request.getRequestURI()).append("?").append(request.getQueryString());
		}else
		{
			addr.append(request.getRequestURI());
		}
		/*request.getSession().setAttribute("jiequ", addr.substring(9));*/
		response.sendRedirect("index.do");
		return false;
	}
}
