package com.assistedproblems.animalhierarchy;

// AnimalHierarchy class to demonstrate inheritance and polymorphism
public class AnimalHierarchy
{
	public static void main(String[] args)
	{
		// Creating an object of Dog class
		Dog dog = new Dog("Buddy", 5);

		// Creating an object of Cat class
		Cat cat = new Cat("Whiskers", 3);

		// Creating an object of Bird class
		Bird bird = new Bird("Kiwi", 2);

		System.out.println("Dog details: ");
		// Displaying Dog details
		dog.displayDetails();

		// Calling Dog's makeSound method
		dog.makeSound();

		System.out.println("\nCat details: ");
		// Displaying Cat details
		cat.displayDetails();

		// Calling Cat's makeSound method
		cat.makeSound();

		System.out.println("\nBird details: ");
		// Displaying Bird details
		bird.displayDetails();

		// Calling Bird's makeSound method
		bird.makeSound();
	}
}