package com.singleinheritance.librarymanagementsystem;

// LibraryManagementSystem class to demonstrate Single Inheritance
public class LibraryManagementSystem
{
	public static void main(String[] args)
	{
		// Creating an Author object with book details
		Author authorBook = new Author("Java Complete Reference", 2020, "Herbert Schildt", "An experienced Java developer and writer.");

		// Displaying the details of the book along with the author
		authorBook.displayInfo();
	}
}
