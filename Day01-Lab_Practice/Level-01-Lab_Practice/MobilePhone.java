// MobilePhone class represents a mobile phone with attributes like brand, model, and price.
import java.util.Scanner;

public class MobilePhone
{
    // Attribute to store the brand, model, and price of the phone
    private String brand;
    private String model;
    private double price;

    // Constructor to initialize the attributes of MobilePhone class
    public MobilePhone(String brand, String model, double price)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter mobile phone details
        // Taking the brand input
        System.out.println("Enter Brand of the Phone: ");
        String brand = sc.nextLine();

        // Taking the model input
        System.out.println("Enter Model of the Phone: ");
        String model = sc.nextLine();

        // Taking the price input
        System.out.println("Enter Price of the Phone: ");
        double price = sc.nextDouble();

        // Creating a MobilePhone object with the provided details
        MobilePhone mobilePhone = new MobilePhone(brand, model, price);

        // Displaying the details of the mobile phone
        mobilePhone.displayDetails();

        // Closing the Scanner object
        sc.close();
    }
}
