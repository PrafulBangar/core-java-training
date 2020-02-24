package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Calculation extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//int num1 = Integer.valueOf(request.getParameter("txtNum1"));
	//	int num2 = Integer.valueOf(request.getParameter("txtNum2"));
		
		int number=Integer.valueOf(request.getParameter("txtNumber"));
		
		PrintWriter out = response.getWriter();

		out.println("<table border=1>");
		if (true) {

            out.println("<tr><td>number<td>No<td>result");

         for (int i = 1; i <=10; i++) {
                int result = i * number;
                out.println("<tr><td>"+number+"<td>" + i + "<td>" + result);
         }
         out.println("</table>");
		
		}
		/*int result;
		if (String.valueOf(request.getParameter("Add")).equals("+")) {
			result = num1 + num2;
			out.println("Addition is=" + result);
		}
		else {
			result = num1 - num2;
			out.println("Subtraction is=" + result);*/
		}

	}


