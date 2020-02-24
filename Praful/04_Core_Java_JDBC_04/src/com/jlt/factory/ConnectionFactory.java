package com.jlt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";

	private Connection connection;

	public Connection getDBConnection() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url);
			return connection;

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed due to" + e.getMessage());
			e.printStackTrace();

		}
		return null;

	}
}
