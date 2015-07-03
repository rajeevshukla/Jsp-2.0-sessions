package com.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns="/AddProductToCart.htm")
public class LoginFilter  implements Filter{

	@Override
	public void destroy() {
		
		System.out.println("Filter destroyed.");
	}

	@Override
	public void doFilter(ServletRequest paramServletRequest,
			ServletResponse paramServletResponse, FilterChain paramFilterChain)
			throws IOException, ServletException {
		
		System.out.println("inside do filter");
		
		//pre processing.. 
		
		HttpServletRequest request=(HttpServletRequest)paramServletRequest;
		HttpServletResponse  response=(HttpServletResponse)paramServletResponse;
		
		  HttpSession session= request.getSession(false);
		
		  if(null!=session){
			    if( session.getAttribute("userName")!=null){
			    	
			    }else{
			    	response.sendRedirect("index.jsp");
			    }
		  }else {
			  response.sendRedirect("index.jsp");
		  }
		 paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
		//post processing  after processing over server. 
		 
		 System.out.println("after do filter...");
		
	}

	@Override
	public void init(FilterConfig paramFilterConfig) throws ServletException {
		System.out.println("Filter initilized.");
		
	}

}
