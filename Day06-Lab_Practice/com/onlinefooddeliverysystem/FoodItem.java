package com.onlinefooddeliverysystem;

// Abstract class representing a general food item
abstract class FoodItem {

	// Field to store the name of the food item
	private String itemName;

	// Field to store the price of the food item
	private double price;

	// Field to store the quantity of the food item
	private int quantity;

	// Constructor to initialize food item details
	public FoodItem(String itemName, double price, int quantity) {
		// Initializing values to all instance variables
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter method to retrieve the food item name
	public String getItemName() {
		return itemName;
	}

	// Getter method to retrieve the food item price
	public double getPrice() {
		return price;
	}

	// Getter method to retrieve the quantity of the food item
	public int getQuantity() {
		return quantity;
	}

	// Abstract method to calculate the total price of the food item
	public abstract double calculateTotalPrice();

	// Method to display the details of the food item
	public void getItemDetails() {
		// Print the food item name, price, and quantity
		System.out.println("Item Name: " + itemName);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
	}
}