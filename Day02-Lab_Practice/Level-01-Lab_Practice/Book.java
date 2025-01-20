// Book class that represents a book with different access modifiers
public class Book {
    // Public attribute: Accessible from anywhere
    public String ISBN;

    // Protected attribute: Accessible within the same package and subclasses
    protected String title;

    // Private attribute: Accessible only within this class
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        // Assigning values to instance variables
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author name
    public void setAuthor(String author) {
        // Updating the author name
        this.author = author;
    }

    // Public method to get the author name
    public String getAuthor() {
        // Returning the author name
        return author;
    }
}

// Subclass of Book demonstrating access to public and protected attributes
class EBook extends Book {
    // Constructor for EBook calling the superclass constructor
    public EBook(String ISBN, String title, String author) {
        // Calling parent class constructor to initialize attributes
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        // Accessing public ISBN and protected title
        System.out.println("E-Book ISBN: " + ISBN);
        System.out.println("E-Book Title: " + title);
    }
}

// LibrarySystem class to test Book and EBook
class LibrarySystem {
    public static void main(String[] args) {

        // Creating an EBook object
        EBook eBook = new EBook("978-0-12-345678-9", "Java Programming", "Joseph Murphy");

        // Displaying EBook details
        eBook.displayEBookDetails();

        // Setting a new author for the book
        eBook.setAuthor("James Gosling");

        // Printing the updated author name
        System.out.println("Updated Book Author: " + eBook.getAuthor());
    }
}
