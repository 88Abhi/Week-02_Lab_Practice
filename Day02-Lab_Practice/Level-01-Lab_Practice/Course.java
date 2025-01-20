// Course class that represents online courses with details and a shared institute name
public class Course {
    // Declaring instance variables for course name, duration, and fee
    private String courseName;
    private int duration;
    private double fee;

    // Declaring a static class variable for the institute name
    private static String instituteName = "TITE";

    // Constructor to initialize a course with name, duration, and fee
    public Course(String courseName, int duration, double fee) {
        // Assigning parameter values to instance variables using 'this'
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display details of a specific course
    public void displayCourseDetails() {
        // Printing the course name
        System.out.println("Course Name: " + courseName);

        // Printing the course duration in weeks
        System.out.println("Duration: " + duration + " weeks");

        // Printing the course fee
        System.out.println("Fee: " + fee);

        // Printing the institute name (shared across all courses)
        System.out.println("Institute: " + instituteName);
    }

    // Static method to update the institute name for all courses
    public static void updateInstituteName(String newName) {
        // Updating the static instituteName variable with the new name
        instituteName = newName;
    }

    public static void main(String[] args) {
        // Creating the first course instance with name, duration, and fee
        Course course1 = new Course("Java Programming", 6, 500.0);

        System.out.println("=== Course Details ===");

        // Displaying details of the first course
        course1.displayCourseDetails();

        // Printing a message before updating the institute name
        System.out.println("\nUpdating Institute Name...");

        // Updating the institute name for all courses
        Course.updateInstituteName("TIT");

        System.out.println("\n=== Updated Course Details ===");

        // Displaying details again after updating institute name
        course1.displayCourseDetails();
    }
}
