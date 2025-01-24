package com.assistedproblems.animalhierarchy;

// Defining the Dog subclass extending Animal
public class Dog extends Animal
{
	// Constructor to initialize Dog object
	public Dog(String name, int age)
	{
		super(name, age);
	}

	// Overriding makeSound method to specify dog's sound
	@Override
	public void makeSound()
	{
		System.out.println(name + " barks");
	}
}

