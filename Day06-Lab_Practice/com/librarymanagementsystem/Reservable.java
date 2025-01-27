package com.librarymanagementsystem;

// Interface defining methods related to reservable items
interface Reservable {

	// Method to reserve a library item
	void reserveItem();

	// Method to check the availability of a library item
	boolean checkAvailability();
}
