package com.librarymanagementsystem;

// Class DVD, it extends LibraryItem and implements the Reservable interface
class DVD extends LibraryItem implements Reservable {

	// Field to store the loan duration for the DVD
	private int loanDuration;

	// Constructor to initialize DVD details
	public DVD(String itemId, String title, String author, int loanDuration) {
		// Call the parent class constructor to initialize the item details
		super(itemId, title, author);

		// Assign the loan duration to the instance variable
		this.loanDuration = loanDuration;
	}

	// Override the method to get the loan duration for the DVD
	@Override
	public int getLoanDuration() {
		// Return the loan duration for the DVD
		return loanDuration;
	}

	// Implement the method to reserve the DVD
	@Override
	public void reserveItem() {
		// Display a message indicating the DVD has been reserved
		System.out.println("The DVD \"" + getTitle() + "\" has been reserved.");
	}

	// Implement the method to check availability of the DVD
	@Override
	public boolean checkAvailability() {
		// Assume the DVD is always available
		return true;
	}
}