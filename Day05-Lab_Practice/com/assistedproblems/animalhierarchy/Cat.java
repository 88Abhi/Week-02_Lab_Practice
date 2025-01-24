package com.assistedproblems.animalhierarchy;

// Defining the Cat subclass extending Animal
public class Cat extends Animal
{
	// Constructor to initialize Cat object
	public Cat(String name, int age)
	{
		super(name, age);
	}

	// Overriding makeSound method to specify cat's sound
	@Override
	public void makeSound()
	{
		System.out.println(name + " meows");
	}
}

