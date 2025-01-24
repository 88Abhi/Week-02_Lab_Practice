package com.multilevelinheritance.onlineretailordermanagementsystem;

// OrderManagementSystem class to execute and test the order management system
public class OrderManagementSystem
{
	public static void main(String[] args)
	{
		// Creating an instance of Order with default status
		Order order = new Order(101, "2025-01-24");

		// Displaying order details
		order.displayOrderDetails();
		System.out.println();

		// Creating an instance of ShippedOrder with tracking details
		ShippedOrder shippedOrder = new ShippedOrder(102, "2025-01-22", "TRK12345");
		// Displaying shipped order details
		shippedOrder.displayOrderDetails();
		System.out.println();

		// Creating an instance of DeliveredOrder with delivery date
		DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-01-20", "TRK67890", "2025-01-23");
		// Displaying delivered order details
		deliveredOrder.displayOrderDetails();
	}
}

