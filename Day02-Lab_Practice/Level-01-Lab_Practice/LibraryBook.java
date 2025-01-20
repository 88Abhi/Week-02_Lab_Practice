// LibraryBook class that stores book details and allows borrowing functionality
public class LibraryBook {

    // Declaring private attributes for book details
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor to initialize book attributes
    public LibraryBook(String title, String author, double price) {
        // Assigning values using 'this' keyword
        this.title = title;
        this.author = author;
        this.price = price;
        // Initially, the book is available
        this.isAvailable = true;
    }

    // Method to borrow the book
    public void borrowBook() {
        // Checks if the book is available for borrowing
        if (isAvailable) {
            // Marks the book as borrowed
            isAvailable = false;
            System.out.println("Book borrowed successfully!");
        } else {
            // Informs that the book is already borrowed
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        // Prints the book's title
        System.out.println("Title: " + title);
        // Prints the author's name
        System.out.println("Author: " + author);
        // Prints the price of the book
        System.out.println("Price: " + price);
        // Prints the availability status of the book
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        // Creating a book object using the parameterized constructor
        LibraryBook book = new LibraryBook("Herbert Schildt", "Java: The Complete Reference", 10.0);

        // Displaying book details before borrowing
        System.out.println("=== Book Details Before Borrowing ===");
        book.displayDetails();

        // Borrowing the book
        System.out.println("\nAttempting to Borrow Book...");
        book.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\n=== Book Details After Borrowing ===");
        book.displayDetails();
    }
}
