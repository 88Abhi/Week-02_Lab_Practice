package com.hybridinheritance.vehiclemanagementsystem;

// Superclass representing a general vehicle
class Vehicle
{
	// Maximum speed of the vehicle
	protected int maxSpeed;

	// Model name of the vehicle
	protected String model;

	// Constructor to initialize vehicle details
	public Vehicle(int maxSpeed, String model)
	{
		// Initializing values to instance variables
		this.maxSpeed = maxSpeed;
		this.model = model;
	}

	// Method to display vehicle details
	public void displayVehicleDetails()
	{
		// Printing details of the vehicle
		System.out.println("\nModel: " + model);
		System.out.println("Max Speed: " + maxSpeed + " km/h");
	}
}