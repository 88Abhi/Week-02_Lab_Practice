package com.hospitalpatientmanagement;

// Class InPatient, extending Patient and implementing MedicalRecord interface
class InPatient extends Patient implements MedicalRecord {

	// Field to store the hospitalization days
	private int hospitalizationDays;

	// Field to store the daily charge for the in-patient
	private double dailyCharge;

	// Field to store the list of medical records for the in-patient
	private StringBuilder medicalRecords = new StringBuilder();

	// Constructor to initialize in-patient details
	public InPatient(int patientId, String name, int age, int hospitalizationDays, double dailyCharge) {
		// Call the parent constructor to initialize the patient details
		super(patientId, name, age);

		// Initializing values to instance variables
		this.hospitalizationDays = hospitalizationDays;
		this.dailyCharge = dailyCharge;
	}

	// Implement the method to calculate the total bill for the in-patient
	@Override
	public double calculateBill() {
		// Calculate the total bill as daily charge multiplied by hospitalization days
		return hospitalizationDays * dailyCharge;
	}

	// Implement the method to add medical records for the in-patient
	@Override
	public void addRecord(String record) {
		// Append the new medical record to the list of medical records
		medicalRecords.append(record);
	}

	// Implement the method to view medical records for the in-patient
	@Override
	public String viewRecords() {
		// Return the list of medical records as a string
		return medicalRecords.toString();
	}
}
