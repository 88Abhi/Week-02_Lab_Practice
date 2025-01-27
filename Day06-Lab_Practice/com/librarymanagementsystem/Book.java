package com.librarymanagementsystem;

// Class book, it extends LibraryItem and implements the Reservable interface
class Book extends LibraryItem implements Reservable {

	// Field to store the loan duration for the book
	private int loanDuration;

	// Constructor to initialize book details
	public Book(String itemId, String title, String author, int loanDuration) {
		// Call the parent class constructor to initialize the item details
		super(itemId, title, author);

		// Assign the loan duration to the instance variable
		this.loanDuration = loanDuration;
	}

	// Override the method to get the loan duration for the book
	@Override
	public int getLoanDuration() {
		// Return the loan duration for the book
		return loanDuration;
	}

	// Implement the method to reserve the book
	@Override
	public void reserveItem() {
		// Display a message indicating the book has been reserved
		System.out.println("The book \"" + getTitle() + "\" has been reserved.");
	}

	// Implement the method to check availability of the book
	@Override
	public boolean checkAvailability() {
		// Assume the book is always available
		return true;
	}
}
