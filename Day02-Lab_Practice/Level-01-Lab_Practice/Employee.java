// Employee class representing an employee with different access modifiers
public class Employee {
    // Public attribute: Can be accessed from anywhere
    public int employeeID;

    // Protected attribute: Can be accessed in the same package and subclasses
    protected String department;

    // Private attribute: Can only be accessed within this class
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        // Assigning values to instance variables
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to update salary
    public void setSalary(double salary) {
            // Updating the salary value
            this.salary = salary;
    }

    // Public method to get the current salary
    public double getSalary() {
        // Returning the salary amount
        return salary;
    }

    // Public method to display employee details
    public void displayEmployeeDetails() {
        // Printing employee ID
        System.out.println("Employee ID: " + employeeID);

        // Printing department
        System.out.println("Department: " + department);

        // Printing salary
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager inheriting from Employee class
class Manager extends Employee {
    // Constructor for Manager class calling the superclass constructor
    public Manager(int employeeID, String department, double salary) {
        // Calling parent class constructor to initialize attributes
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        // Accessing public employeeID
        System.out.println("Manager Employee ID: " + employeeID);

        // Accessing protected department
        System.out.println("Manager Department: " + department);
    }
}

// EmployeeSystem class to test Employee and Manager classes
class EmployeeSystem {
    public static void main(String[] args) {
        // Creating a Manager object with employee details
        Manager manager = new Manager(101, "IT", 70000.0);

        // Displaying manager details
        manager.displayManagerDetails();

        // Updating the salary using the public method
        manager.setSalary(75000.0);

        // Printing the updated salary
        System.out.println("Updated Salary: " + manager.getSalary());

        // Displaying complete employee details
        manager.displayEmployeeDetails();
    }
}
