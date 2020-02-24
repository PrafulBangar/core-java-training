package com.jlt.pojo;

public class Employee {
 private int empId;
 private String name;
 private double salary;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(int employeeId, String name, double salary) {
	super();
	this.empId = employeeId;
	this.name = name;
	this.salary = salary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", toString()=" + super.toString()
			+ "]";
}
public void setSalary(double salary) {
	this.salary = salary;
}


}
