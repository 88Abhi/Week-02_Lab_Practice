package com.librarymanagementsystem;

// Class magazine, it extends LibraryItem and implements the Reservable interface
class Magazine extends LibraryItem implements Reservable {

	// Field to store the loan duration for the magazine
	private int loanDuration;

	// Constructor to initialize magazine details
	public Magazine(String itemId, String title, String author, int loanDuration) {
		// Call the parent class constructor to initialize the item details
		super(itemId, title, author);

		// Assign the loan duration to the instance variable
		this.loanDuration = loanDuration;
	}

	// Override the method to get the loan duration for the magazine
	@Override
	public int getLoanDuration() {
		// Return the loan duration for the magazine
		return loanDuration;
	}

	// Implement the method to reserve the magazine
	@Override
	public void reserveItem() {
		// Display a message indicating the magazine has been reserved
		System.out.println("The magazine \"" + getTitle() + "\" has been reserved.");
	}

	// Implement the method to check availability of the magazine
	@Override
	public boolean checkAvailability() {
		// Assume the magazine is always available
		return true;
	}
}

