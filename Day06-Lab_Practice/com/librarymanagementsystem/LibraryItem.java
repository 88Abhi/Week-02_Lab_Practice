package com.librarymanagementsystem;

// Abstract class representing a general library item
abstract class LibraryItem {

	// Field to store the unique item ID
	private String itemId;

	// Field to store the title of the library item
	private String title;

	// Field to store the author of the library item
	private String author;

	// Constructor to initialize library item details
	public LibraryItem(String itemId, String title, String author) {
		// Initializing values to instance variables
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Getter method to retrieve the item ID
	public String getItemId() {
		return itemId;
	}

	// Getter method to retrieve the title of the item
	public String getTitle() {
		return title;
	}

	// Getter method to retrieve the author of the item
	public String getAuthor() {
		return author;
	}

	// Abstract method to get the loan duration of the library item
	public abstract int getLoanDuration();

	// Method to display library item details
	public void getItemDetails() {
		// Print item ID, title, and author
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}