package com.vehiclerentalsystem;

// VehicleRentalSystem class to test the vehicle rental system
public class VehicleRentalSystem {

	public static void main(String[] args) {
		// Create a Car object with details vehicle number and rental rate
		Car car = new Car("C001", 50.0);

		// Create a Bike object with details vehicle number and rental rate
		Bike bike = new Bike("B001", 20.0);

		// Create a Truck object with details vehicle number and rental rate
		Truck truck = new Truck("T001", 100.0);

		// Display the rental and insurance details for the car
		System.out.println("Car Details:");
		System.out.println("Rental Cost (5 days): " + car.calculateRentalCost(5));
		System.out.println("Insurance Cost: " + car.calculateInsurance());
		System.out.println(car.getInsuranceDetails());

		// Display the rental and insurance details for the bike
		System.out.println("\nBike Details:");
		System.out.println("Rental Cost (3 days): " + bike.calculateRentalCost(3));
		System.out.println("Insurance Cost: " + bike.calculateInsurance());
		System.out.println(bike.getInsuranceDetails());

		// Display the rental and insurance details for the truck
		System.out.println("\nTruck Details:");
		System.out.println("Rental Cost (7 days): " + truck.calculateRentalCost(7));
		System.out.println("Insurance Cost: " + truck.calculateInsurance());
		System.out.println(truck.getInsuranceDetails());
	}
}
