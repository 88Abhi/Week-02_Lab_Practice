package com.ridehailingapplication;

// Class Auto, it is extending Vehicle and implementing GPS interface
class Auto extends Vehicle implements GPS {

	// Field to store the current location of the auto
	private String location;

	// Constructor to initialize auto details
	public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
		// Call the parent constructor to initialize vehicle details
		super(vehicleId, driverName, ratePerKm);

		// Assign location to the instance variable
		this.location = location;
	}

	// Implement the method to calculate fare for the auto
	@Override
	public double calculateFare(double distance) {
		// Calculate fare as rate per kilometer multiplied by the distance
		return getRatePerKm() * distance;
	}

	// Implement the method to get the current location
	@Override
	public String getCurrentLocation() {
		return location;
	}

	// Implement the method to update the location
	@Override
	public void updateLocation(String newLocation) {
		// Update the current location with the new location
		this.location = newLocation;
	}
}