// Employee class to manage employee details
public class Employee {

    // Static variable shared across all employees
    static String companyName = "TIT";
    static int totalEmployees;

    // Final variable for employee ID
    final int id;

    // Instance variables for employee name and designation
    String name;
    String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        // Initializing name using 'this' keyword
        this.name = name;

        // Initializing id using 'this' keyword
        this.id = id;

        // Initializing designation using 'this' keyword
        this.designation = designation;

        // Incrementing total Employees whenever new employee added
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        // Displaying the total number of employees
        System.out.println("Total Employees in " + companyName + " is: " + totalEmployees);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
            // Displaying employee details
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        // Creating an Employee object for John
        Employee employee = new Employee("Abhishek Jat", 101, "Software Engineer");

        // Checking if the current object is an instance of the Employee class
        if (employee instanceof Employee) {
            // Displaying details of the first employee
            employee.displayEmployeeDetails();
        }

        // Displaying the total number of employees
        displayTotalEmployees();
    }
}
