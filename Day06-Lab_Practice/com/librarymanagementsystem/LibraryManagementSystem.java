package com.librarymanagementsystem;

// LibraryManagementSystem class to test the library management system
public class LibraryManagementSystem {

	public static void main(String[] args) {
		// Create a book object with item ID, title, author, and loan duration
		Book book = new Book("B001", "Effective Java", "Joshua Bloch", 14);

		// Create a magazine object with item ID, title, author, and loan duration
		Magazine magazine = new Magazine("M001", "National Geographic", "Various", 7);

		// Create a DVD object with item ID, title, author, and loan duration
		DVD dvd = new DVD("D001", "Inception", "Christopher Nolan", 7);

		// Display details of the book
		System.out.println("Book Details:");
		book.getItemDetails();
		System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
		book.reserveItem();
		System.out.println("Availability: " + (book.checkAvailability() ? "Available" : "Not Available"));

		// Display details of the magazine
		System.out.println("\nMagazine Details:");
		magazine.getItemDetails();
		System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");
		magazine.reserveItem();
		System.out.println("Availability: " + (magazine.checkAvailability() ? "Available" : "Not Available"));

		// Display details of the DVD
		System.out.println("\nDVD Details:");
		dvd.getItemDetails();
		System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
		dvd.reserveItem();
		System.out.println("Availability: " + (dvd.checkAvailability() ? "Available" : "Not Available"));
	}
}
