package com.vehiclerentalsystem;

// Abstract class to represent the general details of a vehicle
abstract class Vehicle {

	// Field to store the vehicle number
	private String vehicleNumber;

	// Field to store the type of vehicle
	private String type;

	// Field to store the rental rate per day
	private double rentalRate;

	// Constructor to initialize vehicle details
	public Vehicle(String vehicleNumber, String type, double rentalRate) {
		// Initializing values to instance variables
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.rentalRate = rentalRate;
	}

	// Getter method to retrieve the vehicle number
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	// Getter method to retrieve the type of the vehicle
	public String getType() {
		return type;
	}

	// Getter method to retrieve the rental rate per day
	public double getRentalRate() {
		return rentalRate;
	}

	// Abstract method to calculate the rental cost for a given number of days
	public abstract double calculateRentalCost(int days);
}


