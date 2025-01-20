// MovieTicket class models the ticket booking system
import java.util.Scanner;

public class MovieTicket
{
    // Attribute to store the movie name, seat number, and the price of the ticket
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price)
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket (assign seat and update price)
    public void bookTicket(String seat, double ticketPrice)
    {
        // Assigning the seat number
        this.seatNumber = seat;

        // Assigning the ticket price
        this.price = ticketPrice;

        // Prints the booking details
        System.out.println("Ticket booked for seat " + seat + " at price " + ticketPrice);
    }

    // Method to display ticket details
    public void displayTicketDetails()
    {
        // Prints the movie name, seat number, and the price of the ticket
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter movie ticket details
        // Taking movie name input
        System.out.println("Enter Movie Name: ");
        String movieName = sc.nextLine();

        // Taking seat number input
        System.out.println("Enter Seat Number: ");
        String seatNumber = sc.nextLine();

        // Taking ticket price input
        System.out.println("Enter Ticket Price: ");
        double price = sc.nextDouble();

        // Creating a MovieTicket object with the provided details
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Booking the ticket and displaying the details
        ticket.bookTicket(seatNumber, price);
        ticket.displayTicketDetails();

        // Closing the Scanner object
        sc.close();
    }
}
