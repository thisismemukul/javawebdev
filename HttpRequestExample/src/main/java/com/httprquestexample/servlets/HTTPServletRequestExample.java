package com.httprquestexample.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HTTPServletRequestExample
 */
public class HTTPServletRequestExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HTTPServletRequestExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter printWriter = response.getWriter();
		//1 local
		printWriter.print("<h1>Request Local :" +request.getLocale()+"</h1>");
		//2 content length
		printWriter.print("<h1>Request Local :" +request.getContentLength()+"</h1>");
		//3 Server Name
		printWriter.print("<h1>Request Local :" +request.getServerName()+"</h1>");
		//4 content type
		printWriter.print("<h1>Request Local :" +request.getContentType()+"</h1>");
		//5 content path
		printWriter.print("<h1>Request Local :" +request.getContextPath()+"</h1>");
		//6 parameter
		printWriter.print("<h1>Request Local :" +request.getParameter("userName")+"</h1><br/>");
		printWriter.print("<h1>Country Local :" +request.getParameter("country")+"</h1><br/>");
	}

}
