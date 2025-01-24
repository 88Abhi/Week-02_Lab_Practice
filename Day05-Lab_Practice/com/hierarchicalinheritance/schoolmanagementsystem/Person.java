package com.hierarchicalinheritance.schoolmanagementsystem;

// Superclass representing a general person in the school
class Person
{
	// Name of the person
	protected String name;

	// Age of the person
	protected int age;

	// Constructor to initialize name and age
	public Person(String name, int age)
	{
		// Initializing values to instance variables
		this.name = name;
		this.age = age;
	}

	// Method to display basic person details
	public void displayDetails()
	{
		// Printing the details of the person
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
	}

	// Method to be overridden by subclasses to describe their role
	public void displayRole()
	{
		// Printing a general role description
		System.out.println("This is a person in the school.");
	}
}
