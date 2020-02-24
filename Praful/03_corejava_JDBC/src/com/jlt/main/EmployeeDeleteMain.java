package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDeleteMain {
	public static void main(String[] args) {
		
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_delete="delete from employee_master where employee_id=?";
		
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection=DriverManager.getConnection(url);
		PreparedStatement preparedStatement=connection.prepareStatement(sql_delete);
		
		preparedStatement.setInt(1, 101);
		int row_count=preparedStatement.executeUpdate();
			System.out.println("row count=="+row_count);
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
