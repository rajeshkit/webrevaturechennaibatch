package com.easywebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>"
				+ "<head><title>Inbox Servlet</title>"
				+ "</head>"
				+ "<body>"
				+ "<h1>Welcome to Inbox</h1>"
				+ "<h2>Welcome: Rajesh</h2><img src='user.png'>"
				+ "<p>tkjsfgka ahfghafghashf asfkasfhhsf</p>"
				+ "<a href='sent'>Sent Email</a><br><br>"
				+ "<a href='draft'>Email Darfts</a>"
				+ "</body>"
				+ "</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
