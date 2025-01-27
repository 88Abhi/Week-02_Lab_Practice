package com.employeemanagementsystem;

// Declaring an abstract class Employee to represent a general employee
abstract class Employee {

	// Declaring a private field to store the employee ID
	private int employeeId;

	// Declaring a private field to store the employee's name
	private String name;

	// Declaring a private field to store the base salary of the employee
	private double baseSalary;

	// Constructor to initialize the employee details
	public Employee(int employeeId, String name, double baseSalary) {
		// Assigning the employee details to instance variables
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getter method to retrieve the employee ID
	public int getEmployeeId() {
		return employeeId;
	}

	// Getter method to retrieve the employee name
	public String getName() {
		return name;
	}

	// Getter method to retrieve the base salary
	public double getBaseSalary() {
		return baseSalary;
	}

	// Declaring an abstract method to calculate the salary of the employee
	public abstract double calculateSalary();

	// Method to display employee details
	public void displayDetails() {
		// Printing the employee details
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
	}
}
