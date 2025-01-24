package com.hybridinheritance.restaurantmanagementsystem;

// RestaurantManagement class to test the restaurant system
public class RestaurantManagement
{
	public static void main(String[] args)
	{
		// Creating an instance of Chef with specialty
		Chef chef = new Chef("Abhishek", 101, "Indian");

		// Displaying chef details
		chef.displayChefDetails();

		// Calling performDuties() to describe the work
		chef.performDuties();

		// Printing a blank line for separation
		System.out.println();

		// Creating an instance of Waiter with table count
		Waiter waiter = new Waiter("Amit", 102, 5);

		// Displaying waiter details
		waiter.displayWaiterDetails();

		// Calling performDuties() to describe the work
		waiter.performDuties();
	}
}
