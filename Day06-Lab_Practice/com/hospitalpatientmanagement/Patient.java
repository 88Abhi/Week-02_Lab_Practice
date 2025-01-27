package com.hospitalpatientmanagement;

// Abstract class representing a general patient
abstract class Patient {

	// Field to store the patient's ID
	private int patientId;

	// Field to store the patient's name
	private String name;

	// Field to store the patient's age
	private int age;

	// Constructor to initialize patient details
	public Patient(int patientId, String name, int age) {
		// Initializing values to all instance variables
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	// Getter method to retrieve the patient's ID
	public int getPatientId() {
		return patientId;
	}

	// Getter method to retrieve the patient's name
	public String getName() {
		return name;
	}

	// Getter method to retrieve the patient's age
	public int getAge() {
		return age;
	}

	// Abstract method to calculate the total bill for the patient
	public abstract double calculateBill();

	// Method to display the patient's details
	public void getPatientDetails() {
		// Print the patient ID, name, and age
		System.out.println("Patient ID: " + patientId);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

