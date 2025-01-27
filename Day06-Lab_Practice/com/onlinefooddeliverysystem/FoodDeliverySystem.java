package com.onlinefooddeliverysystem;

// FoodDeliverySystem class to test the online food delivery system
public class FoodDeliverySystem {

	public static void main(String[] args) {
		// Create a vegetarian food item object with name, price, quantity, and discount percentage
		VegItem vegItem = new VegItem("Vegetarian Pizza", 15.0, 2, 10);

		// Create a non-vegetarian food item object with name, price, quantity, and additional charge
		NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 10.0, 3, 2.5);

		// Display details of the vegetarian food item
		System.out.println("Vegetarian Food Item Details:");
		vegItem.getItemDetails();
		System.out.println("Discount Details: " + vegItem.getDiscountDetails());
		System.out.println("Total Price after Discount: " + vegItem.calculateTotalPrice());

		// Display details of the non-vegetarian food item
		System.out.println("\nNon-Vegetarian Food Item Details:");
		nonVegItem.getItemDetails();
		System.out.println("Discount Details: " + nonVegItem.getDiscountDetails());
		System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
	}
}

