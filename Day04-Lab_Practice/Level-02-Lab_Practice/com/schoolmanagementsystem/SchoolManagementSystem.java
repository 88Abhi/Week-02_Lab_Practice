package com.schoolmanagementsystem;
// SchoolManagementSystem class to demonstrate the School, Students, and Courses
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a school
        School school = new School("TIT_EX");

        // Create students
        Student abhishek = new Student("Abhishek");
        Student amit = new Student("Amit");

        // Add students to the school
        school.addStudent(abhishek);
        school.addStudent(amit);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        abhishek.enrollInCourse(math);
        abhishek.enrollInCourse(science);
        amit.enrollInCourse(science);

        // Show all students in the school
        school.showStudents();

        // Show each student's enrolled courses
        abhishek.showEnrolledCourses();
        amit.showEnrolledCourses();

        // Show students enrolled in each course
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}