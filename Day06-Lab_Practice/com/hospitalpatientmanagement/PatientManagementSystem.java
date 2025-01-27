package com.hospitalpatientmanagement;

// PatientManagementSystem class to test the hospital patient management system
public class PatientManagementSystem {

	public static void main(String[] args) {
		// Create an in-patient object with details ID, name, age, hospitalization days, and daily charge
		InPatient inPatient = new InPatient(101, "Abhishek", 45, 5, 200);

		// Create an out-patient object with details ID, name, age, and consultation fee
		OutPatient outPatient = new OutPatient(102, "Amit", 38, 100);

		// Display details of the in-patient
		System.out.println("In-Patient Details:");
		inPatient.getPatientDetails();
		inPatient.addRecord("Prescribed Medication: FluMed.");

		// Print the medical records for the in-patient
		System.out.println("Medical Records: " + inPatient.viewRecords());

		// Print the calculated bill for the in-patient
		System.out.println("Total Bill: " + inPatient.calculateBill());

		// Display details of the out-patient
		System.out.println("\nOut-Patient Details:");
		outPatient.getPatientDetails();
		outPatient.addRecord("Diagnosed with Flu.");

		// Print the medical records for the out-patient
		System.out.println("Medical Records: " + outPatient.viewRecords());

		// Print the calculated bill for the out-patient
		System.out.println("Total Bill: " + outPatient.calculateBill());
	}
}

