package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("this is a servlet using generic servlet");
		res.setContentType("text/html"); //for output on console
		PrintWriter out = res.getWriter();
		out.println("<h1> This is my second servlet using generic servlet</h1>");
		//Generic Servlets are the implemented class of servlets, thus we dont need o write all
		//abstract methods implementations thus our service codes becomes shorter
	}
	

}
