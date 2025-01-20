// Book class that stores details about a book, such as title, author, and price
public class BookSystem
{
    // Declaring private attributes for book details
    private String title;
    private String author;
    private double price;

    // Default constructor
    public BookSystem() {
        // Calls the parameterized constructor with default values
        this("Unknown Title", "Unknown Author", 0.0);
    }

    // Parameterized constructor to initialize book attributes
    public BookSystem(String title, String author, double price) {
        // Assigning values using 'this' keyword to avoid ambiguity
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        // Prints the book's title
        System.out.println("Title: " + title);
        // Prints the author's name
        System.out.println("Author: " + author);
        // Prints the price of the book
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        BookSystem defaultBook = new BookSystem();

        // Creating an object using the parameterized constructor
        BookSystem customBook = new BookSystem("The Power of Your Subconscious Mind", "Joseph Murphy",10 );

        // Displaying details of the default book
        System.out.println("=== Default Book ===");
        defaultBook.displayDetails();

        // Displaying details of the custom book
        System.out.println("\n=== Custom Book ===");
        customBook.displayDetails();
    }
}
