package com;

// Class representing a customer in the grocery store
class Customer {

    // Variable to store the customer's name
    String name;

    // Variable to store the first purchased product
    Product product1;

    // Variable to store the second purchased product
    Product product2;

    // Constructor to initialize a customer with a name
    public Customer(String name) {
        this.name = name;
    }

    // Method to add two products to the customer's purchase list
    public void addProducts(Product p1, Product p2) {
        this.product1 = p1;
        this.product2 = p2;
    }
}

// Class representing a product in the grocery store
class Product {

    // Variable to store the product name
    String name;

    // Variable to store the quantity of the product purchased
    double quantity;

    // Variable to store the price per unit of the product
    double pricePerUnit;

    // Constructor to initialize a product with a name, quantity, and price per unit
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Method to calculate the total price of the product
    public double calculatePrice() {
        return quantity * pricePerUnit;
    }
}

// Class responsible for generating bills for customers
class BillGenerator {

    // Method to calculate the total bill amount for a given customer
    public double calculateTotal(Customer customer) {
        double total = 0;

        // Checking if the first product exists and adding its price to the total
        if (customer.product1 != null) {
            total += customer.product1.calculatePrice();
        }

        // Checking if the second product exists and adding its price to the total
        if (customer.product2 != null) {
            total += customer.product2.calculatePrice();
        }

        return total;
    }

    // Method to generate and display the receipt for a given customer
    public void generateReceipt(Customer customer) {

        // Printing the receipt header with the customer's name
        System.out.println("Receipt for " + customer.name);

        // Displaying the first product's name and price if it exists
        if (customer.product1 != null) {
            System.out.println(customer.product1.name + ": $" +
                    customer.product1.calculatePrice());
        }

        // Displaying the second product's name and price if it exists
        if (customer.product2 != null) {
            System.out.println(customer.product2.name + ": $" +
                    customer.product2.calculatePrice());
        }

        // Displaying the total amount to be paid
        System.out.println("Total: $" + calculateTotal(customer));
    }
}

// GroceryStore class to execute the grocery store billing system
class  GroceryStore {

    // Main method - the entry point of the program
    public static void main(String[] args) {

        // Creating an instance of Customer with a name
        Customer customer = new Customer("Alice");

        // Creating an instance of Product for Apples with a specified quantity and price per unit
        Product apples = new Product("Apples", 2, 3);

        // Creating an instance of Product for Milk with a specified quantity and price per unit
        Product milk = new Product("Milk", 1, 2);

        // Adding the products to the customer's purchase list
        customer.addProducts(apples, milk);

        // Creating an instance of BillGenerator to generate the bill
        BillGenerator billGenerator = new BillGenerator();

        // Calling the method to generate and display the receipt
        billGenerator.generateReceipt(customer);
    }
}
