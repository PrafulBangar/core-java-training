package com.jlt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jlt.factory.ConnectionFactory;
import com.jlt.pojo.Employee;

public class EmployeeDao {
	private int rowCount;
	private ConnectionFactory factory;
	private Connection connection;
	private PreparedStatement preparedStatement;

	private String sql_Insert = "insert into employee_master values (?,?,?)";

	public boolean addEmployee(Employee employee) {
		try {
			factory = new ConnectionFactory();
			connection = factory.getDBConnection();
			preparedStatement = connection.prepareStatement(sql_Insert);
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());

			rowCount = preparedStatement.executeUpdate();
			connection.close();
			if (rowCount > 0)
				return true;
			else
				return false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

}
