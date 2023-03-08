package com.firstservletapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	
	ServletConfig config = null;
	//1
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config= config;
		
	}
	//2

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<h1>Hello World</h1>");
		printWriter.print("<h1>Today is "+ new Date()+" World</h1>");
		
		
	}
	//3
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
	
	//4
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return this.config;
	}
	
	//5
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
