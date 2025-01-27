package com.ridehailingapplication;

// Abstract class representing a general vehicle
abstract class Vehicle {

	// Field to store the vehicle ID
	private String vehicleId;

	// Field to store the driver's name
	private String driverName;

	// Field to store the rate per kilometer for the vehicle
	private double ratePerKm;

	// Constructor to initialize vehicle details
	public Vehicle(String vehicleId, String driverName, double ratePerKm) {
		// Initializing values to all instance variables
		this.vehicleId = vehicleId;
		this.driverName = driverName;
		this.ratePerKm = ratePerKm;
	}

	// Getter method to retrieve the vehicle ID
	public String getVehicleId() {
		return vehicleId;
	}

	// Getter method to retrieve the driver's name
	public String getDriverName() {
		return driverName;
	}

	// Getter method to retrieve the rate per kilometer
	public double getRatePerKm() {
		return ratePerKm;
	}

	// Abstract method to calculate the fare for the ride
	public abstract double calculateFare(double distance);

	// Method to display vehicle details
	public void getVehicleDetails() {
		// Print the vehicle ID, driver's name, and rate per kilometer
		System.out.println("Vehicle ID: " + vehicleId);
		System.out.println("Driver Name: " + driverName);
		System.out.println("Rate per Km: " + ratePerKm);
	}
}
