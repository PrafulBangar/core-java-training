package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayEmployees {

	public void displayEmployees() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_select="select * from employee_master";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			Connection connection = DriverManager.getConnection(url);

			PreparedStatement preparedStatement=connection.prepareStatement(sql_select);
			ResultSet resultSet=preparedStatement.executeQuery();
			System.out.println("EmployeeId\t\tName\t\tSalary");
			while(resultSet.next())
			{
				System.out.print("\n"+resultSet.getInt("employee_id"));
				System.out.print("\t\t\t"+resultSet.getString("name"));
				System.out.print("\t\t"+resultSet.getFloat("salary"));
				
			}
			
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
