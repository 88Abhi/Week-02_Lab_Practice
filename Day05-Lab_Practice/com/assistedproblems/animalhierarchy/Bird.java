package com.assistedproblems.animalhierarchy;

// Defining the Bird subclass extending Animal
public class Bird extends Animal
{
	// Constructor to initialize Bird object
	public Bird(String name, int age)
	{
		super(name, age);
	}

	// Overriding makeSound method to specify bird's sound
	@Override
	public void makeSound()
	{
		System.out.println(name + " chirps");
	}
}