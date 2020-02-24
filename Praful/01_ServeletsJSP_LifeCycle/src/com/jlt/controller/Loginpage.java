package com.jlt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginpage
 */
public class Loginpage extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int userId=Integer.valueOf(request.getParameter("txtuserId"));
		int password=Integer.valueOf(request.getParameter("password"));
		
		
		if (userId==123 && password==123) {
			response.sendRedirect("employeeDetails.html");
		}
		else
		{
			response.sendRedirect("Login.html");
		}
	
	}

}
