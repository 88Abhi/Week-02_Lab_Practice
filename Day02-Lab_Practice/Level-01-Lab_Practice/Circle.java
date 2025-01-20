// Circle class that represents a circle with a radius and supports constructor chaining
public class Circle {
    // Declaring private attribute for the radius of the circle
    private double radius;

    // Default constructor
    public Circle() {
        // Calls the parameterized constructor with a default radius of 1.0
        this(1.0);
    }

    // Parameterized constructor to initialize radius with a user-provided value
    public Circle(double radius) {
        // Assigning value using 'this' keyword
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        // Formula for area of a circle: π * r^2
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        // Prints the radius of the circle
        System.out.println("Radius: " + radius);
        // Prints the calculated area of the circle
        System.out.println("Area: " + calculateArea());
    }

    public static void main(String[] args) {
        // Creating a Circle object using the default constructor
        Circle defaultCircle = new Circle();

        // Creating a Circle object using the parameterized constructor
        Circle customCircle = new Circle(5.0);

        // Displaying details of the default circle
        System.out.println("=== Default Circle ===");
        defaultCircle.displayDetails();

        // Displaying details of the custom circle
        System.out.println("\n=== Custom Circle ===");
        customCircle.displayDetails();
    }
}
