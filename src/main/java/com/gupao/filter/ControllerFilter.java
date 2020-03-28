package com.gupao.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.stereotype.Component;


@WebFilter(filterName="controllerFilter",urlPatterns="/user")
public class ControllerFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		chain.doFilter(arg0, arg1);
		System.out.println("throw");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("start");
	}

}
