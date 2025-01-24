package com.multilevelinheritance.onlineretailordermanagementsystem;

// Base class representing an order
public class Order
{

	// Order ID to uniquely identify an order
	protected int orderId;

	// Date when the order was placed
	protected String orderDate;

	// Constructor to initialize order details
	public Order(int orderId, String orderDate)
	{
		// Initializing values to instance variables
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	// Method to return the current order status
	public String getOrderStatus()
	{
		// Returning default order status
		return "Order Placed";
	}

	// Method to display order details
	public void displayOrderDetails()
	{
		// Printing order details
		System.out.println("Order ID: " + orderId);
		System.out.println("Order Date: " + orderDate);
		System.out.println("Status: " + getOrderStatus());
	}
}



