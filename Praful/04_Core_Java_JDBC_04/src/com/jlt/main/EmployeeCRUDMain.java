package com.jlt.main;

import java.util.Scanner;

import com.jlt.dao.EmployeeDao;
import com.jlt.pojo.Employee;

public class EmployeeCRUDMain {

	public static void main(String[] args) {

		int employeeId;
		String name;
		double salary;
		String choice = "";

		Scanner scanner = new Scanner(System.in);
		EmployeeDao employeeDao = new EmployeeDao();

		do {
			System.out.println("\n1)Add new Employee \n 2)Display All Employees \n 3)Update Employee Salary by empId"
					+ "\n4)update employee name by empId\n 5)delete employee by emplId \n6)Display employee by Id\n7)Exit");
			System.out.println("\nEnter Your Choice");

			choice = scanner.next();

			switch (choice) {
			case "1": {
				System.out.println("Enter Employee Id");
				employeeId = scanner.nextInt();
				System.out.println("Name=");
				name = scanner.next();
				System.out.println("Salary=");
				salary = scanner.nextDouble();

				Employee employee = new Employee(employeeId, name, salary);
				if (employeeDao.addEmployee(employee)) {
					System.out.println("Employee added sucessfully");
				} else {
					System.out.println("failed to add");
				}
				break;
			}

			}

		} while (choice.equalsIgnoreCase("yes"));

	}

}
