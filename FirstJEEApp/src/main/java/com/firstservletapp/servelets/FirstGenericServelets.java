package com.firstservletapp.servelets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstGenericServelets extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5938367402078452486L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = res.getWriter();
		printWriter.print("<h1>Hello World from Generics server</h1>");
		printWriter.print("<h1>Today is "+ new Date()+" World</h1>");
		
	}

}
