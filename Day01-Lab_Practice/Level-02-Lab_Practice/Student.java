// Student class models the attributes of a student, such as name, roll number, and marks
import java.util.Scanner;

public class Student
{
    // Attributes to store student's information
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor to initialize the student's details
    public Student(String name, int rollNumber, double marks)
    {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate the grade based on marks
    public String calculateGrade() {
        // Grade A for marks greater than or equal to 90
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            // Grade B for marks greater than or equal to 75
            return "B";
        } else if (marks >= 60) {
            // Grade C for marks greater than or equal to 60
            return "C";
        } else if (marks >= 40) {
            // Grade D for marks greater than or equal to 40
            return "D";
        } else {
            // Grade F for marks less than 50
            return "F";
        }
    }

    // Method to display student's details and grade
    public void displayDetails()
    {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args)
    {
        // Creating a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompting user to input student details
        // Taking student name input
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        // Taking roll number input
        System.out.println("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        // Taking marks input
        System.out.println("Enter Marks: ");
        double marks = sc.nextDouble();

        // Creating a Student object with the provided details
        Student student = new Student(name, rollNumber, marks);

        // Displaying the student's details and grade
        student.displayDetails();

        // Closing the Scanner object
        sc.close();
    }
}
