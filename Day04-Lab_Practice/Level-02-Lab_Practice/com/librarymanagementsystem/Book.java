package com.librarymanagementsystem;

// Book class that show details of books
class Book {
    // Title of the book
    String title;
    // Author of the book
    String author;

    // Constructor to initialize a book with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // toString() for displaying book details
    public String toString() {
        return "\"" + title + "\" by " + author;
    }
}

