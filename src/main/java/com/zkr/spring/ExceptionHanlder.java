/**   
 * @File: ExceptionHanlder.java 
 * @Package com.sinosoft.spring.custom 
 * @Description: 使用拦截器记录公共异常
 * @author liuying
 * @date 2016年1月13日 下午9:33:43 
 * @version V1.0   
 */
package com.zkr.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * @File: ExceptionHanlder.java
 * @Package com.sinosoft.spring.custom
 * @ClassName: ExceptionHanlder
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author liuying
 * @date 2016年1月13日 下午9:33:43
 * 
 */
public class ExceptionHanlder extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionHanlder.class);

	/*
	 * (non-Javadoc) <p>Title: afterCompletion</p> <p>Description: </p>
	 * 
	 * @param request
	 * 
	 * @param response
	 * 
	 * @param handler
	 * 
	 * @param ex
	 * 
	 * @throws Exception
	 * 
	 * @see org.springframework.web.servlet.handler.HandlerInterceptorAdapter#
	 * afterCompletion(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		// TODO Auto-generated method stub
		// super.afterCompletion(request, response, handler, ex);
		if (ex != null)
			logger.error(ex.getMessage(), ex);

	}
}
