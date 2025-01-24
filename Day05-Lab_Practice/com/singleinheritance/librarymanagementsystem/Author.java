package com.singleinheritance.librarymanagementsystem;

// Defining the subclass Author extending Book
class Author extends Book
{
	// Declaring the author's name
	private String authorName;

	// Declaring the author's biography
	private String bio;

	// Constructor to initialize Author object
	public Author(String title, int publicationYear, String authorName, String bio)
	{
		// Calling the superclass constructor to set title and publicationYear
		super(title, publicationYear);
		this.authorName = authorName;
		this.bio = bio;
	}

	// Overriding displayInfo method to include Author-specific details
	@Override
	public void displayInfo()
	{
		// Calling the superclass method to display book details
		super.displayInfo();
		System.out.println("Author: " + authorName);
		System.out.println("Bio: " + bio);
	}
}
