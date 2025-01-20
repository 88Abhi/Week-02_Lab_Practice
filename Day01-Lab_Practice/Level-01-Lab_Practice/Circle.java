// Circle class represents a circle with an attribute radius.
import java.util.Scanner;
public class Circle
{
    // Attribute to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        // Initializing radius with the given parameter
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        // Formula for area: π * r^2
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        // Formula for circumference: 2 * π * r
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter radius of the circle
        System.out.println("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        // Creating a Circle object with the provided radius
        Circle circle = new Circle(radius);

        // Displaying the area and circumference of the circle
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());

        // Closing the Scanner object
        sc.close();
    }
}
