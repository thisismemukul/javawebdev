package com.applicationscope.servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class ContextParamExample
 */
public class ContextParamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		config.getServletContext();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContextParamExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		ServletContext servletContext= request.getServletContext();
		printWriter.print("<h1>Hello World from Generics server</h1>");
		printWriter.print("<h2> Context Parameter </h2><br/>");
		printWriter.print("<h3>DB Pram: "+servletContext.getInitParameter("db-ip")+" </h3>");
		printWriter.print("<h3>DB Pram: "+servletContext.getInitParameter("db-port")+" </h3>");
		/*
		 * request.getServletContext(); getServletContext();
		 */
	 Enumeration<String> enumeration =	servletContext.getInitParameterNames();
	 //loop
	 //servletContext.getInitParameter(T);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
