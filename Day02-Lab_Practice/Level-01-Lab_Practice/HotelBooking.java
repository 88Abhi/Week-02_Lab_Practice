// HotelBooking class that stores guest booking details
public class HotelBooking {

    // Declaring private attributes for booking details
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        // Calls the parameterized constructor with default values
        this("Unknown Guest", "Standard", 1);
    }

    // Parameterized constructor to initialize booking attributes
    public HotelBooking(String guestName, String roomType, int nights) {
        // Assigning values using 'this' keyword
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor to duplicate an existing booking
    public HotelBooking(HotelBooking other) {
        // Copy values from the given HotelBooking object
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        // Prints the guest's name
        System.out.println("Guest Name: " + guestName);
        // Prints the type of room booked
        System.out.println("Room Type: " + roomType);
        // Prints the number of nights booked
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        // Creating a booking using the default constructor
        HotelBooking defaultBooking = new HotelBooking();

        // Creating a booking using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Abhishek Jat", "Deluxe", 3);

        // Creating a booking using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        // Displaying details of the default booking
        System.out.println("=== Default Booking ===");
        defaultBooking.displayBooking();

        // Displaying details of the custom booking
        System.out.println("\n=== Custom Booking ===");
        customBooking.displayBooking();

        // Displaying details of the copied booking
        System.out.println("\n=== Copied Booking ===");
        copiedBooking.displayBooking();
    }
}
