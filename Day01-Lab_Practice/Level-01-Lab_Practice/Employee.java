// Employee class represents an employee with attributes like name, id, and salary.
import java.util.Scanner;

public class Employee
{
    // Attributes to store details about employees name, id, and salary
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize the attributes of Employee class
    public Employee(String name, int id, double salary) {
        // Initializing the attributes employee's name, id, and salary
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        // Print employee's name, employee's ID, and employee's salary
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to enter employee details
        // Taking the employee's name input
        System.out.println("Enter Employee Name: ");
        String name = sc.nextLine();

        // Taking the employee's ID input
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        // Taking the employee's salary input
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Creating an Employee object with the provided details
        Employee employee = new Employee(name, id, salary);

        // Displaying the details of the employee
        employee.displayDetails();

        // Closing the Scanner object
        sc.close();
    }
}
