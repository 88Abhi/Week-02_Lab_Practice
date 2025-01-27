package com.hospitalpatientmanagement;

// Interface defining methods related to medical records for patients
interface MedicalRecord {

	// Method to add medical records for a patient
	void addRecord(String record);

	// Method to view medical records of a patient
	String viewRecords();
}