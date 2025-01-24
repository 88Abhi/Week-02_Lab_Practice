package com.universitymanagementsystem;

// UniversityManagementSystem class to demonstrate the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating Student objects
        Student abhishek = new Student("Abhishek");
        Student ajeet = new Student("Ajeet");
        Student ankit = new Student("Ankit");

        // Creating Professor objects
        Professor professorAnkit = new Professor("Dr. Ashish");
        Professor professorAmit = new Professor("Dr. Amit");

        // Creating Course objects
        Course dsa = new Course("Data Structures and Algorithms");
        Course oops = new Course("Object-Oriented Programming");

        // Enrolling students in courses
        abhishek.enrollInCourse(dsa);
        ajeet.enrollInCourse(oops);
        ankit.enrollInCourse(dsa);
        ankit.enrollInCourse(oops);

        // Assigning professors to courses
        professorAnkit.assignProfessorToCourse(dsa);
        professorAmit.assignProfessorToCourse(oops);

        // Displaying enrolled courses for students
        abhishek.printEnrolledCourses();
        ajeet.printEnrolledCourses();
        ankit.printEnrolledCourses();

        // Displaying courses taught by professors
        professorAnkit.printCoursesTaught();
        professorAmit.printCoursesTaught();

        // Displaying students enrolled in each course
        dsa.printEnrolledStudents();
        oops.printEnrolledStudents();

        // Displaying professors assigned to each course
        dsa.printAssignedProfessors();
        oops.printAssignedProfessors();
    }
}