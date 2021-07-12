package com.capp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capp.bo.CustomerBO;
import com.capp.bo.CustomerBoImplementation;
import com.capp.model.Customer;

public class ResgistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("registration servlet doget is called");
		
		System.out.println(request.getParameter("cname"));
		System.out.println(request.getParameter("cpass"));
		System.out.println(request.getParameter("cgender")); 
		System.out.println(request.getParameter("cstate"));
		String[] qualification = request.getParameterValues("cqualification");
		StringBuilder sb=new StringBuilder();
		for(String q:qualification) {
			System.out.println("Qualification is"+q);
			sb.append(q);
		}
		System.out.println(request.getParameter("caddress"));
		
		Customer c=new Customer();
		c.setCustomerName(request.getParameter("cname"));
		c.setCustomerGender(request.getParameter("cgender"));
		c.setCustomerPassword(request.getParameter("cpass"));
		c.setCustomerState(request.getParameter("cstate"));
		c.setCustomerAddress(request.getParameter("caddress"));
		c.setCustomerQualification(sb.toString());
		CustomerBO cbo=new CustomerBoImplementation();
		int answer =cbo.addCustomer(c);
		PrintWriter out=response.getWriter();
		
		if(answer!=0) {
			out.println("<html>"
					+ "<head><title>Demo Servlet</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>Welcome Customer:"+c.getCustomerName()+"</h1>"
					+ "<img src='user.png'>"
					+ "<h2>"+c.getCustomerState()+"</h2>"
					+ "</body>"
					+ "</html>");
		}else {
			out.println("<html>"
					+ "<head><title>Demo Servlet</title>"
					+ "</head>"
					+ "<body>"
					+ "<h1>Customer is added Successfully</h1>"
					+ "</body>"
					+ "</html>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
