package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewEmployee {

	public void createNewEmployee() {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_insert = "insert into employee_master values(?,?,?)";
		Scanner scanner = new Scanner(System.in);

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);

			PreparedStatement preparedStatement = connection.prepareStatement(sql_insert);
			System.out.println("Enter Employee Details 1)Id 2)Name3)Salary");
			int empId = scanner.nextInt();
			String empName = scanner.next();
			Float empSalary = scanner.nextFloat();
			preparedStatement.setInt(1, empId);
			preparedStatement.setString(2, empName);
			preparedStatement.setFloat(3, empSalary);

			int rowCount = preparedStatement.executeUpdate();
			System.out.println(rowCount + "Records inserted Successfully");

			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Failed due to" + e.getMessage());
			e.printStackTrace();

		}
	}

}
