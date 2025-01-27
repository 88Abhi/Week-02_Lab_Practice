package com.employeemanagementsystem;

// Defining a subclass FullTimeEmployee that extends Employee and implements Department interface
class FullTimeEmployee extends Employee implements Department {

	// Declaring a private field to store the department name
	private String department;

	// Constructor to initialize full-time employee details
	public FullTimeEmployee(int employeeId, String name, double baseSalary) {
		// Calling the constructor of the superclass Employee
		super(employeeId, name, baseSalary);
	}

	// Overriding the abstract method calculateSalary for full-time employees
	@Override
	public double calculateSalary() {
		// Returning the base salary as the salary for a full-time employee
		return getBaseSalary();
	}

	// Overriding the method to assign a department to the full-time employee
	@Override
	public void assignDepartment(String departmentName) {
		// Assigning the department name to the instance variable
		this.department = departmentName;
	}

	// Overriding the method to retrieve department details
	@Override
	public String getDepartmentDetails() {
		// Returning the department name
		return "Department: " + department;
	}
}