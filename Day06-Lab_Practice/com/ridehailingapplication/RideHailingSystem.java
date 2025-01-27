package com.ridehailingapplication;

// RideHailingSystem class to test the ride-hailing application
public class RideHailingSystem {

	public static void main(String[] args) {
		// Create a car object with details vehicle ID, driver's name, rate per kilometer, and location
		Car car = new Car("C123", "Abhishek", 2.0, "Bhopal");

		// Create a bike object with details: vehicle ID, driver's name, rate per kilometer, and location
		Bike bike = new Bike("B456", "Amit", 1.0, "Indore");

		// Create an auto object with details: vehicle ID, driver's name, rate per kilometer, and location
		Auto auto = new Auto("A789", "Ajeet", 1.5, "Delhi");

		// Display details of the car
		System.out.println("Car Details:");
		car.getVehicleDetails();
		// Print the fare for a ride of 10 kilometers
		System.out.println("Fare for 10 Km: " + car.calculateFare(10));
		// Print the current location of the car
		System.out.println("Current Location: " + car.getCurrentLocation());

		// Display details of the bike
		System.out.println("\nBike Details:");
		bike.getVehicleDetails();
		// Print the fare for a ride of 10 kilometers
		System.out.println("Fare for 10 Km: " + bike.calculateFare(10));
		// Print the current location of the bike
		System.out.println("Current Location: " + bike.getCurrentLocation());

		// Display details of the auto
		System.out.println("\nAuto Details:");
		auto.getVehicleDetails();
		// Print the fare for a ride of 10 kilometers
		System.out.println("Fare for 10 Km: " + auto.calculateFare(10));
		// Print the current location of the auto
		System.out.println("Current Location: " + auto.getCurrentLocation());

		// Update the location of the car
		car.updateLocation("Bhopal Airport");

		// Update the location of the bike
		bike.updateLocation("Indore Airport");

		// Update the location of the auto
		auto.updateLocation("Delhi Airport");

		// Print updated locations
		System.out.println("\nUpdated Locations:");
		System.out.println("Car Location: " + car.getCurrentLocation());
		System.out.println("Bike Location: " + bike.getCurrentLocation());
		System.out.println("Auto Location: " + auto.getCurrentLocation());
	}
}
