package com.httpservletresponse.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Servlet implementation class BinaryStreamExample
 */
public class BinaryStreamExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BinaryStreamExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//setting response mime type
		response.setContentType("image/png");
		//response binary stream 
		ServletOutputStream outputStream = 	response.getOutputStream();
		//open stream
		InputStream inputStream = getServletContext().getResourceAsStream("images/download.png");
		//define byte array
		byte[] imageByte= new byte[inputStream.available()];
		//read the image 
		inputStream.read(imageByte);
		//write img bytes n servlet o/p stream
		outputStream.write(imageByte);
		//flush the response
		outputStream.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
