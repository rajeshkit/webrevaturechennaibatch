package com.capp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is a demo servlet doget method");
		PrintWriter out=response.getWriter();
		out.println("<html>"
				+ "<head><title>Demo Servlet</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Welcome Demo Servlet Page</h1>"
				+ "<img src='user.png'>"
				+ "<p>tkjsfgka ahfghafghashf asfkasfhhsf</p>"
				+ "</body>"
				+ "</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is a demo servlet doPost method");
	}

}
