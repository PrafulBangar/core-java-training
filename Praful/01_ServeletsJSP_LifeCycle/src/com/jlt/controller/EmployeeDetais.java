package com.jlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeDetais extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int employeeId=Integer.valueOf(request.getParameter("txtEmployeeId"));
String name=request.getParameter("txtName");
double salary=Double.valueOf(request.getParameter("txtSalary"));

PrintWriter out=response.getWriter();
out.println("EmployeeId"+employeeId);
out.println("name=="+name);
out.println("Salary=="+salary);


	}

}
