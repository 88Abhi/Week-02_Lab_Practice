package com.vehiclerentalsystem;

// Class Bike, it extends the Vehicle class and implements the Insurable interface
class Bike extends Vehicle implements Insurable {

	// Static constant to store the insurance rate for bikes
	private static final double INSURANCE_RATE = 0.03;

	// Constructor to initialize the bike details
	public Bike(String vehicleNumber, double rentalRate) {
		// Call the parent class constructor with provided arguments
		super(vehicleNumber, "Bike", rentalRate);
	}

	// Override the method to calculate the rental cost for a bike
	@Override
	public double calculateRentalCost(int days) {
		// Calculate the rental cost by multiplying the rental rate and days
		return getRentalRate() * days;
	}

	// Override the method to calculate the insurance cost for a bike
	@Override
	public double calculateInsurance() {
		// Calculate the insurance cost as a percentage of the rental rate
		return getRentalRate() * INSURANCE_RATE;
	}

	// Override the method to provide the insurance details for the bike
	@Override
	public String getInsuranceDetails() {
		// Return the insurance rate for the bike
		return "Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
	}
}
