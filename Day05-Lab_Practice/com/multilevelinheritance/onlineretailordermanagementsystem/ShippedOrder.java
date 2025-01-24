package com.multilevelinheritance.onlineretailordermanagementsystem;

// Subclass representing an order that has been shipped
public class ShippedOrder extends Order
{

	// Tracking number for shipment tracking
	protected String trackingNumber;

	// Constructor to initialize shipped order details
	public ShippedOrder(int orderId, String orderDate, String trackingNumber)
	{
		// Calling the parent constructor to initialize order ID and date
		super(orderId, orderDate);
		// Assigning tracking number
		this.trackingNumber = trackingNumber;
	}

	// Overriding method to provide updated order status
	@Override
	public String getOrderStatus()
	{
		// Returning updated status for shipped order
		return "Order Shipped";
	}

	// Method to display order details including tracking number
	public void displayOrderDetails()
	{
		// Calling parent class method to print common details
		super.displayOrderDetails();
		// Printing tracking number
		System.out.println("Tracking Number: " + trackingNumber);
	}
}
