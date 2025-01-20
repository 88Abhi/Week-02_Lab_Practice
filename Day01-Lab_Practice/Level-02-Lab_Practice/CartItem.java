// CartItem class that contains shopping cart functionality with attributes item name, price, and quantity
import java.util.Scanner;

public class CartItem
{
    // Attributes fto store item name, price, and quantity
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize item attributes name, price, and quantity
    public CartItem(String itemName, double price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart by increasing the quantity
    public void addItem(int quantity)
    {
        // Increasing quantity by the given amount
        this.quantity += quantity;
        System.out.println("Number of items added to the cart: " + quantity);
    }

    // Method to remove an item from the cart by decreasing the quantity
    public void removeItem(int quantity)
    {
        // Checking if enough quantity is available for removal
        if (this.quantity >= quantity) {
            // Reducing quantity by the given amount
            this.quantity -= quantity;
            System.out.println("Number of items removed from the cart: " + quantity);
        } else {
            // If not enough items are available, display an error message
            System.out.println("Not enough items in the cart to remove.");
        }
    }

    // Method to calculate the total cost of items in the cart
    public double calculateTotalCost()
    {
        // Multiplying price per item by quantity to get total cost
        return price * quantity;
    }

    // Method to display all details of the cart item
    public void displayCartDetails()
    {
        System.out.println("\n--- Shopping Cart Details ---");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter item details
        // Taking item name as input
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        // Taking item price as input
        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        // Taking item quantity as input
        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        // Prompting user for add operations
        System.out.print("Enter the number of items to add to the cart: ");
        int addedItem = scanner.nextInt();

        // Prompting user for remove operations
        System.out.print("Enter the number of items to remove from the cart: ");
        int removedItem = scanner.nextInt();

        // Creating a CartItem object using user-provided values
        CartItem cartItem = new CartItem(itemName, price, quantity);

        // Performing operations: Adding items, removing items, and displaying cart details
        // Adding user-specified quantity to cart
        cartItem.addItem(addedItem);

        // Removing user-specified quantity from cart
        cartItem.removeItem(removedItem);

        // Displaying final cart details
        cartItem.displayCartDetails();

        // Closing the Scanner object
        scanner.close();
    }
}
