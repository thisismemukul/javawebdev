package com.firstservletapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstHTTPServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7715332558695495501L;

//	@Override
	/*
	 * public void service(ServletRequest req, ServletResponse res) throws
	 * ServletException, IOException { // TODO Auto-generated method stub
	 * PrintWriter printWriter = res.getWriter();
	 * printWriter.print("<h1>Hello World from HTTP server</h1>");
	 * printWriter.print("<h1>Today is "+ new Date()+" World</h1>");
	 * 
	 * }
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("<h1>Hello World from doGet HTTP server</h1>");
		printWriter.print("<h1>Today is "+ new Date()+" World</h1>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	doGet(req, resp);
	}
}
