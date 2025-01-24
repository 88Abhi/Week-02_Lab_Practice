package com.multilevelinheritance.onlineretailordermanagementsystem;

// Subclass representing a delivered order
class DeliveredOrder extends ShippedOrder
{

	// Delivery date of the order
	private String deliveryDate;

	// Constructor to initialize delivered order details
	public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate)
	{
		// Calling parent constructor to initialize common attributes
		super(orderId, orderDate, trackingNumber);
		// Assigning delivery date
		this.deliveryDate = deliveryDate;
	}

	// Overriding method to provide updated order status
	@Override
	public String getOrderStatus()
	{
		// Returning updated status for delivered order
		return "Order Delivered";
	}

	// Method to display all order details including delivery date
	public void displayOrderDetails()
	{
		// Calling parent class method to print common details
		super.displayOrderDetails();
		// Printing delivery date
		System.out.println("Delivery Date: " + deliveryDate);
	}
}