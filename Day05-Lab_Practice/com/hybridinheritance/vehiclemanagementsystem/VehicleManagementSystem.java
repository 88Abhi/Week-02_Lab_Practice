package com.hybridinheritance.vehiclemanagementsystem;

// VehicleManagementSystem class to test the vehicle management system
public class VehicleManagementSystem
{
	public static void main(String[] args)
	{
		// Creating an instance of ElectricVehicle with battery capacity
		ElectricVehicle electricCar = new ElectricVehicle(180, "Tesla Cyber Truck", 75);

		// Displaying electric vehicle details
		electricCar.displayVehicleDetails();

		// Charging the electric vehicle
		electricCar.charge();

		// Creating an instance of PetrolVehicle with fuel capacity
		PetrolVehicle petrolCar = new PetrolVehicle(200, "Thar Roxx", 50);

		// Displaying petrol vehicle details
		petrolCar.displayVehicleDetails();

		// Refueling the petrol vehicle
		petrolCar.refuel();
	}
}
