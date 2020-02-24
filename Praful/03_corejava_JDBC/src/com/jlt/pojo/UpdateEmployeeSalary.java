package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployeeSalary {

	public void updateEmployeeSalary() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_update = "update employee_master set salary=? where employee_id=?";
		Scanner scanner=new Scanner(System.in);
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_update);
			System.out.println("Enter EmployeeId to Update=");
			int empId=scanner.nextInt();
			System.out.println("Enter New Salary=");
			float newSalary=scanner.nextFloat();

			preparedStatement.setFloat(1, newSalary);
			preparedStatement.setInt(2, empId);
			
			int count=preparedStatement.executeUpdate();
			System.out.println("Record Updated sucessfully"+count);
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
