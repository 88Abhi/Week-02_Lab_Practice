// Product class to manage shopping cart items
public class Product {

    // Static variable shared across all products
    static double discount = 10.0;

    // Final variable for product ID
    final int productID;

    // Instance variables for product name, price, and quantity
    String productName;
    double price;
    int quantity;

    // Constructor to initialize product details
    public Product(String productName, double price, int quantity, int productID) {
        // Initializing product name using 'this' keyword
        this.productName = productName;

        // Initializing price using 'this' keyword
        this.price = price;

        // Initializing quantity using 'this' keyword
        this.quantity = quantity;

        // Initializing product ID using 'this' keyword
        this.productID = productID; 
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        // Updating the static discount variable
        discount = newDiscount;
    }

    // Instance method to calculate total price for the product
    public double calculateTotalPrice() {
        // Calculating total price considering the discount
        double totalPrice = (quantity * price) - (((quantity * price) * discount) / 100);

        // Return the total price after discount
        return totalPrice;
    }

    // Instance method to display product details
    public void displayProductDetails() {
            // Displaying product details
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Price (after discount): " + calculateTotalPrice());
    }

    public static void main(String[] args) {
        // Creating a Product object for "Laptop"
        Product product1 = new Product("Laptop", 800.0, 2, 1001);

        // Checking if the current object is an instance of the Product class
        if (product1 instanceof Product) {
            // Displaying details of the first product
            product1.displayProductDetails();
        }
        // Updating the discount to 20%
        updateDiscount(20.0);

        // Displaying updated details of the first product after discount change
        product1.displayProductDetails();
    }
}
