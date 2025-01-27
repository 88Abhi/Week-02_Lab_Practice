package com.onlinefooddeliverysystem;

// Class non-vegetarian, it extends FoodItem and implements the Discountable interface
class NonVegItem extends FoodItem implements Discountable {

	// Field to store the additional charge for non-vegetarian items
	private double additionalCharge;

	// Constructor to initialize non-vegetarian food item details
	public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
		// Call the parent class constructor to initialize the item details
		super(itemName, price, quantity);

		// Assign the additional charge to the instance variable
		this.additionalCharge = additionalCharge;
	}

	// Override the method to calculate the total price for the non-vegetarian item
	@Override
	public double calculateTotalPrice() {
		// Calculate the total price as price multiplied by quantity
		double totalPrice = getPrice() * getQuantity();
		// Add additional charge to the total price
		return totalPrice + additionalCharge;
	}

	// Implement the method to apply a discount on non-vegetarian items
	@Override
	public double applyDiscount() {
		// Non-vegetarian items have no discount
		return 0;
	}

	// Implement the method to get the discount details for non-vegetarian items
	@Override
	public String getDiscountDetails() {
		// Non-vegetarian items have no discount
		return "No discount available for non-vegetarian items";
	}
}

