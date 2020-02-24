package com.jlt.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployeeById {
	public void deleteEmployeeById() {

		String url = "jdbc:sqlserver://localhost:1433;databaseName=employeedb;integratedSecurity=true";
		String sql_delete = "delete from employee_master where employee_id=?";
		Scanner scanner = new Scanner(System.in);

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection connection = DriverManager.getConnection(url);
			PreparedStatement preparedStatement = connection.prepareStatement(sql_delete);
			System.out.println("Enter Emp Id to Delete");
			int empId = scanner.nextInt();

			preparedStatement.setInt(1, empId);
			int row_count = preparedStatement.executeUpdate();
			System.out.println("Deleted Successfullyt==" + row_count);
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
