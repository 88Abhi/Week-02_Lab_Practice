// Item class represents an item with attributes like itemCode, itemName, and price.
import java.util.Scanner;

public class Item
{
    // Attribute to store the item's code, name, and price
    private String itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the attributes of Item class
    public Item(String itemCode, String itemName, double price)
    {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        // Prints the item name, Code, and price.
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        // Returns the total cost: price * quantity
        return price * quantity;
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter item details
        // Taking the item code input
        System.out.println("Enter Item Code: ");
        String itemCode = sc.nextLine();

        // Taking the item name input
        System.out.println("Enter Item Name: ");
        String itemName = sc.nextLine();

        // Taking the item price input
        System.out.println("Enter Item Price: ");
        double price = sc.nextDouble();

        // Taking the quantity input
        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();

        // Creating an Item object with the provided details
        Item item = new Item(itemCode, itemName, price);

        // Displaying the details of the item
        item.displayDetails();

        // Displaying the total cost for the given quantity
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));

        // Closing the Scanner object
        sc.close();
    }
}
