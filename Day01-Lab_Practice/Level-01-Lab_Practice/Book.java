// Book class represents a book with attributes like title, author, and price.
import java.util.Scanner;

public class Book
{
    // Attribute to store the title, author, and price of the book
    private String title;
    private String author;
    private double price;

    // Constructor to initialize the attributes of Book class
    public Book(String title, String author, double price)
    {
        // Initialize the attributes book's title, author's name, and the price of the book
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        // Prints the book's title,  author's name, and the price of the book
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter book details
        // Taking the book's title input
        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();

        // Taking the book's author input
        System.out.println("Enter Book Author: ");
        String author = sc.nextLine();

        // Taking the book's price input
        System.out.println("Enter Book Price: ");
        double price = sc.nextDouble();

        // Creating a Book object with the provided details
        Book book = new Book(title, author, price);

        // Displaying the details of the book
        book.displayDetails();

        // Closing the Scanner object
        sc.close();
    }
}
