package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.xml.crypto.Data;

public class FirstServlet implements Servlet {
	// LifeCycle method
	// Keeping the value coming from parameters into a value
	ServletConfig conf;

	public void init(ServletConfig conf) // this method takes one parameter of ServletConfig

	{
		this.conf = conf;
		System.out.println("creating object.....");
	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// this method takes 2 parameters of request and response, and throws 2
		// exception
		// any logic required for request processing will be written here
		System.out.println("Service running...");
		//set he content type of he response
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>this is my output from servlet method:</h1>");
		out.println("<h1>Todays date and time is "+new Date().toString()+"</h1");
	}

	public void destroy() {
		System.out.println("Going to destroy servlet object... ");
	}

	// NonLifeCycle Method
	public ServletConfig getServletConfig() // returns ServletConfig's object
	{
		return this.conf;

	}

	public String getServletInfo() {
		return "this servlet is creaed by aayush";
	}
//the top 3 methods can run by server without calling but last 2 only runs when we call them.
}
//after creating service project, calling service method in the servlet to execue he service
