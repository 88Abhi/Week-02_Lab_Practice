// CarRental class that represents a car rental system with rental details
public class CarRental {
    // Declaring private attributes for car rental details
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRate;

    // Default constructor
    public CarRental() {
        // Calls the parameterized constructor with default values
        this("Unknown Customer", "Standard Car", 1, 50.0);
    }

    // Parameterized constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays,
                     double rentalRate) {
        // Assigning values using 'this' keyword
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        // Formula for total cost: rentalDays * rentalRate
        return rentalDays * rentalRate;
    }

    // Method to display car rental details
    public void displayRentalDetails() {
        // Prints the customer's name
        System.out.println("Customer Name: " + customerName);
        // Prints the car model
        System.out.println("Car Model: " + carModel);
        // Prints the number of rental days
        System.out.println("Rental Days: " + rentalDays);
        // Prints the rental rate per day
        System.out.println("Rental Rate per Day: " + rentalRate);
        // Prints the total rental cost
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Creating a CarRental object using the default constructor
        CarRental defaultRental = new CarRental();

        // Creating a CarRental object using the parameterized constructor
        CarRental customRental = new CarRental("Abhishek Jat", "Thar Earth Edition Diesel AT",
                5, 100.0);

        // Displaying details of the default rental
        System.out.println("=== Default Rental ===");
        defaultRental.displayRentalDetails();

        // Displaying details of the custom rental
        System.out.println("\n=== Custom Rental ===");
        customRental.displayRentalDetails();
    }
}