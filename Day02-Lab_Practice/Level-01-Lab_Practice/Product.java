// Product class that represents a product with individual details and total products
public class Product {
    // Declaring private instance variable for product name and price
    private String productName;
    private double price;

    // Declaring a static class variable to track total number of products created
    private static int totalProducts = 0;

    // Constructor to initialize a product with name and price
    public Product(String productName, double price) {
        // Assigning parameter values to instance variables using 'this'
        this.productName = productName;
        this.price = price;

        // Incrementing the totalProducts counter each time a product is created
        totalProducts++;
    }

    // Instance method to display details of a specific product
    public void displayProductDetails() {
        // Printing the name of the product
        System.out.println("Product Name: " + productName);

        // Printing the price of the product
        System.out.println("Price: " + price);
    }

    // Static method to display the total number of products created
    public static void displayTotalProducts() {
        // Printing the total count of products created across all instances
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        // Creating the first product instance with name and price
        Product product1 = new Product("Laptop", 50000);

        System.out.println("=== Product Details ===");

        // Displaying details of the first product
        product1.displayProductDetails();

        System.out.println("\n=== Total Products ===");

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}
