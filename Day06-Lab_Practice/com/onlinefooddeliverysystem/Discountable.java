package com.onlinefooddeliverysystem;

// Interface defining methods related to discountable items
interface Discountable {

	// Method to apply a discount to the food item
	double applyDiscount();

	// Method to get the details of the applied discount
	String getDiscountDetails();
}
