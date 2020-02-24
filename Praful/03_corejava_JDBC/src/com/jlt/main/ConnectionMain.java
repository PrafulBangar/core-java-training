package com.jlt.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionMain {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String user = "";
		String password = "";
		String sql_insert = "insert into employee_master values(?,?,?)";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("1)Driver Loaded Successfully");
			Connection connection = DriverManager.getConnection(url);
			System.out.println("2)connection success");

			PreparedStatement preparedStatement = connection.prepareStatement(sql_insert);
			preparedStatement.setInt(1,101);
			preparedStatement.setString(2, "Praful");
			preparedStatement.setFloat(3, (float) 1000.0);
			System.out.println("prepared statement created");
			int rowCount = preparedStatement.executeUpdate();
			System.out.println(rowCount + "Records inserted");

			connection.close();
			System.out.println("3)connection closed");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed due to" + e.getMessage());
			e.printStackTrace();

		}
	}

}
