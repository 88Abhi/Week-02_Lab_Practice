package com.assistedproblems.animalhierarchy;

// Defining the superclass Animal
class Animal
{
	// Declaring the name of the animal
	protected String name;

	// Declaring the age of the animal
	protected int age;

	// Constructor to initialize the Animal object
	public Animal(String name, int age)
	{
		// Initializing values to instance variables
		this.name = name;
		this.age = age;
	}

	// Method to be overridden by subclasses for unique sounds
	public void makeSound()
	{
		System.out.println("Animal makes a sound");
	}

	// Method to display details of the animal
	public void displayDetails()
	{
		System.out.println("Name: " + name + ", Age: " + age);
	}
}


