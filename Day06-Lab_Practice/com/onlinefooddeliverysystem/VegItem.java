package com.onlinefooddeliverysystem;

// Class vegetarian, it extends FoodItem and implements the Discountable interface
class VegItem extends FoodItem implements Discountable {

	// Field to store the discount percentage for vegetarian items
	private double discountPercentage;

	// Constructor to initialize vegetarian food item details
	public VegItem(String itemName, double price, int quantity, double discountPercentage) {
		// Call the parent class constructor to initialize the item details
		super(itemName, price, quantity);

		// Assign the discount percentage to the instance variable
		this.discountPercentage = discountPercentage;
	}

	// Override the method to calculate the total price for the vegetarian item
	@Override
	public double calculateTotalPrice() {
		// Calculate the total price as price multiplied by quantity
		double totalPrice = getPrice() * getQuantity();
		// Apply discount on the total price
		return totalPrice - applyDiscount();
	}

	// Implement the method to apply the discount on vegetarian items
	@Override
	public double applyDiscount() {
		// Calculate the discount amount based on the discount percentage
		return (getPrice() * discountPercentage) / 100 * getQuantity();
	}

	// Implement the method to get the discount details for vegetarian items
	@Override
	public String getDiscountDetails() {
		// Return a string describing the discount percentage
		return "Discount: " + discountPercentage + "%";
	}
}
