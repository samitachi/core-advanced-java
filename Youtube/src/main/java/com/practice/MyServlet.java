package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet { // HttpServlet is a concrete class it does not require to implement any
												// method or such things
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is get method..."); // for output on console

		// we are setting content type in our response, means which type of data we are
		// going to set in our response
		// THI SMETHD HAS THE FUNCTIONALITY THAT IT CAN GIVE THE RESPOSE OF GET METHOD
		response.setContentType("text/html");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); // PrintWritter is a variable, response object is used to generate
												// dynamic response
		out.print("<h1>this is get method of my servlet </h1>");
		out.println(new Date().toString());
		// BY GET METHOD FROM WE CAN SEND HE REQUEST

		// if we want to send request in the form of post request then,
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
	{
		
	}
}
//Servlet is a server side program which is kept on the server, and whenever any request comes on the server, to process that request our servlet executes,
//when a request comes on the server for first time, no object is created of the servlet, but for the first rquest object gets created. Now, to initialize that 
//object servlet calls init() method. So whatever part f code we want to initialize we write it in init() method..
//Now, logic is executed which is written inside service() method. As the object is now created, service is called, now n no.of requests will come and n no. of responses
//will go.Now, everything of this gets complete, when server's object goes to destroy the web container, to release the resources,  service calls the destroy method.
