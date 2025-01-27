package com.vehiclerentalsystem;

// Class Truck, it extends the Vehicle class and implements the Insurable interface
class Truck extends Vehicle implements Insurable {

	// Static constant to store the insurance rate for trucks
	private static final double INSURANCE_RATE = 0.08;

	// Constructor to initialize the truck details
	public Truck(String vehicleNumber, double rentalRate) {
		// Call the parent class constructor with provided arguments
		super(vehicleNumber, "Truck", rentalRate);
	}

	// Override the method to calculate the rental cost for a truck
	@Override
	public double calculateRentalCost(int days) {
		// Calculate the rental cost by multiplying the rental rate and days
		return getRentalRate() * days;
	}

	// Override the method to calculate the insurance cost for a truck
	@Override
	public double calculateInsurance() {
		// Calculate the insurance cost as a percentage of the rental rate
		return getRentalRate() * INSURANCE_RATE;
	}

	// Override the method to provide the insurance details for the truck
	@Override
	public String getInsuranceDetails() {
		// Return the insurance rate for the truck
		return "Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
	}
}
