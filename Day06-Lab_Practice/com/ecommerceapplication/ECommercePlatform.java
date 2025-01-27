package com.ecommerceapplication;

// ECommercePlatform class to test the implementation of the e-commerce platform
public class ECommercePlatform {

	public static void main(String[] args) {
		// Create an Electronics object with specific details
		Electronics laptop = new Electronics(101, "Laptop", 800.0);

		// Create a Clothing object with specific details
		Clothing shirt = new Clothing(102, "Shirt", 40.0);

		// Create a Groceries object with specific details
		Groceries apple = new Groceries(103, "Apple", 2.0);

		// Display the details and final price for the electronics product
		System.out.println("Electronics Details:");
		laptop.displayDetails();
		System.out.println("Discount: " + laptop.calculateDiscount());
		System.out.println("Tax: " + laptop.calculateTax());
		System.out.println("Final Price: " + (laptop.getPrice() + laptop.calculateTax() - laptop.calculateDiscount()));

		// Display the details and final price for the clothing product
		System.out.println("\nClothing Details:");
		shirt.displayDetails();
		System.out.println("Discount: " + shirt.calculateDiscount());
		System.out.println("Tax: " + shirt.calculateTax());
		System.out.println("Final Price: " + (shirt.getPrice() + shirt.calculateTax() - shirt.calculateDiscount()));

		// Display the details and final price for the groceries product
		System.out.println("\nGroceries Details:");
		apple.displayDetails();
		System.out.println("Discount: " + apple.calculateDiscount());
		System.out.println("Final Price: " + (apple.getPrice() - apple.calculateDiscount()));
	}
}
