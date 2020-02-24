package com.jlt.main.employee;

import java.util.Scanner;

import com.jlt.pojo.DeleteEmployeeById;
import com.jlt.pojo.DisplayEmployees;
import com.jlt.pojo.NewEmployee;
import com.jlt.pojo.SearchEmployeeById;
import com.jlt.pojo.UpdateEmployeeName;
import com.jlt.pojo.UpdateEmployeeSalary;

public class EmployeeCRUD {

	public static void main(String[] args) {
		int choice;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("\n1)Add new Employee \n 2)Display All Employees \n 3)Update Employee Salary by empId"
					+ "\n4)update employee name by empId\n 5)delete employee by emplId \n6)Display employee by Id\n7)Exit");
			System.out.println("\nEnter Your Choice");

			choice = scanner.nextInt();

			switch (choice) {
			case 1: {
				NewEmployee employee = new NewEmployee();
				employee.createNewEmployee();
				break;
			}
			case 2: {
				DisplayEmployees employee = new DisplayEmployees();
				employee.displayEmployees();
				break;
			}
			case 3: {
				UpdateEmployeeSalary employee = new UpdateEmployeeSalary();
				employee.updateEmployeeSalary();
				;
				break;
			}
			case 4: {
				UpdateEmployeeName employee = new UpdateEmployeeName();
				employee.updateEmployeeName();
				break;
			}
			case 5: {
				DeleteEmployeeById employee = new DeleteEmployeeById();
				employee.deleteEmployeeById();
				;
				break;
			}
			case 6: {
				SearchEmployeeById employee = new SearchEmployeeById();
				employee.searchEmployeeById();
				break;
			}

			default:
				System.out.println("Invalid Choice");
			}

		} while (choice != 7);

	}

}
