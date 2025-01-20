// Student class to manage student data
public class Student {

    // Static variable shared across all students
    static String universityName = "RGPV University";
    static int totalStudents;

    // Final variable for roll number
    final int rollNumber;

    // Instance variables for student name and grade
    String name;
    double grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double grade) {
        // Initializing name using 'this' keyword
        this.name = name;

        // Initializing roll number using 'this' keyword
        this.rollNumber = rollNumber;

        // Initializing grade using 'this' keyword
        this.grade = grade;

        // Increment total students whenever a student is added
        totalStudents++;
    }

    // Static method to display total number of students
    public static void displayTotalStudents() {
        // Displaying total number of students in the university
        System.out.println("Total Students in " + universityName + " is: " + totalStudents);
    }

    // Instance method to display student details
    public void displayStudentDetails() {
            // Displaying university name
            System.out.println("University: " + universityName);

            // Displaying student's name
            System.out.println("Student Name: " + name);

            // Displaying student's roll number
            System.out.println("Roll Number: " + rollNumber);

            // Displaying student's grade
            System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        // Creating student1 object and initializing details
        Student student1 = new Student("Abhishek Jat", 101, 85.5);

        // Checking if the current object is an instance of the Student class
        if (student1 instanceof Student) {
            // Displaying details of student1
            student1.displayStudentDetails();
        }

        // Displaying total number of students
        displayTotalStudents();
    }
}
