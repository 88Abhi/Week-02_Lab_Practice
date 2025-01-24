package com.hybridinheritance.restaurantmanagementsystem;

// Superclass representing a general person
class Person
{
	// Name of the person
	protected String name;

	// Unique ID assigned to the person
	protected int id;

	// Constructor to initialize person details
	public Person(String name, int id)
	{
		// Initializing values to instance variables
		this.name = name;
		this.id = id;
	}

	// Method to display general person details
	public void displayPersonDetails()
	{
		// Printing details of the person
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
}
