package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;


public class MyServlet extends HttpServlet { //HttpServlet is a concrete class it does not require to implement any method or such things
public void doGet(HttpServletRequest request, HttpServletResponse response)throws SevletException,IOException
{
	System.out.println("this is get method...");  //for output on console
	
	//we are setting content type in our response, means which type of data we are going to set in our response
	//THI SMETHD HAS THE FUNCTIONALITY THAT IT CAN GIVE THE RESPOSE OF GET METHOD
response.setContentType("text/html");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.print("<h1>this is get method of my servlet </h1>");
}
}
