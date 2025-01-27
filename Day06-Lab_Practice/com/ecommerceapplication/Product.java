package com.ecommerceapplication;

// Abstract class to represent general attributes of a product
abstract class Product {

	// Field to store the unique product ID
	private int productId;

	// Field to store the name of the product
	private String name;

	// Field to store the price of the product
	private double price;

	// Constructor to initialize product details
	public Product(int productId, String name, double price) {
		// Initializing the values to instance variables
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Getter method to retrieve the product ID
	public int getProductId() {
		return productId;
	}

	// Getter method to retrieve the name of the product
	public String getName() {
		return name;
	}

	// Getter method to retrieve the price of the product
	public double getPrice() {
		return price;
	}

	// Setter method to update the price of the product
	public void setPrice(double price) {
		this.price = price;
	}

	// Abstract method to calculate the discount for a product
	public abstract double calculateDiscount();

	// Method to display the details of the product
	public void displayDetails() {
		// Print the product details
		System.out.println("Product ID: " + productId);
		System.out.println("Product Name: " + name);
		System.out.println("Price: " + price);
	}
}