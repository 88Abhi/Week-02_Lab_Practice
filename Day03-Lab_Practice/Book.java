// Book class to manage library books
public class Book {

    // Static variable shared across all books
    static String libraryName = "TITE Library";

    // Final variable for ISBN
    final String isbn;

    // Instance variables for book details like author, title
    String title;
    String author;

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        // Initializing title using 'this' keyword
        this.title = title;

        // Initializing author using 'this' keyword
        this.author = author;

        // Initializing ISBN using 'this' keyword
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        // Displaying the library name
        System.out.println("Library: " + libraryName);
    }

    // Instance method to display book details
    public void displayBookDetails() {
            // Displaying book details
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        // Creating a Book object for "Java Programming"
        Book book = new Book("Java Programming", "James Gosling", "978-0-13-516630-7");

        // Checking if the current object is an instance of the Book class
        if (book instanceof Book) {
            // Displaying details of the first book
            book.displayBookDetails();
        }

        // Displaying the library name
        displayLibraryName();
    }
}
