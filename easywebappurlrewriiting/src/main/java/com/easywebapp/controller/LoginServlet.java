package com.easywebapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		
		// bo(email,password)---> dao(email,password)
		PrintWriter out=response.getWriter();							//-> select * from user where email=?
		if(username.length()!=0) {
			if(password.length()!=0) {
				
				out.println("<html>"
						+ "<head><title>Inbox Servlet</title>"
						+ "</head>"
						+ "<body>"
						+ "<h1>Welcome to Inbox</h1>"
						+ "<h2>Welcome: "+username+"</h2><img src='user.png'>"
						+ "<p>tkjsfgka ahfghafghashf asfkasfhhsf</p>"
						+ "<a href='sent?uemail="+username+"'>Sent Email</a><br><br>"
						+ "<a href='draft?uemail="+username+"'>Email Darfts</a>"
						+ "</body>"
						+ "</html>");
			}
		}
		else {
			out.println("<html>"
					+ "<head><title>Error Page</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>Login Failed Invalid Credentials </h1>"
					+ "</body>"
					+ "</html>");
		
			
		}
	}

}
