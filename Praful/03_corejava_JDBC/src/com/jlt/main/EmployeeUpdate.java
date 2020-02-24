package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeUpdate {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_update = "update employee_master set salary=? where employee_id=?";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_update);

			preparedStatement.setFloat(1, 2002);
			preparedStatement.setInt(2, 101);
			
			int count=preparedStatement.executeUpdate();
			System.out.println("rows affected"+count);
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
