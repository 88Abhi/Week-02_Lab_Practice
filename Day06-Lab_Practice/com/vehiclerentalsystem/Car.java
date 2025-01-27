package com.vehiclerentalsystem;

// Class Car, it extends the Vehicle class and implements the Insurable interface
class Car extends Vehicle implements Insurable {

	// Static constant to store the insurance rate for cars
	private static final double INSURANCE_RATE = 0.05;

	// Constructor to initialize the car details
	public Car(String vehicleNumber, double rentalRate) {
		// Call the parent class constructor with provided arguments
		super(vehicleNumber, "Car", rentalRate);
	}

	// Override the method to calculate the rental cost for a car
	@Override
	public double calculateRentalCost(int days) {
		// Calculate the rental cost by multiplying the rental rate and days
		return getRentalRate() * days;
	}

	// Override the method to calculate the insurance cost for a car
	@Override
	public double calculateInsurance() {
		// Calculate the insurance cost as a percentage of the rental rate
		return getRentalRate() * INSURANCE_RATE;
	}

	// Override the method to provide the insurance details for the car
	@Override
	public String getInsuranceDetails() {
		// Return the insurance rate for the car
		return "Insurance Rate: " + (INSURANCE_RATE * 100) + "%";
	}
}




