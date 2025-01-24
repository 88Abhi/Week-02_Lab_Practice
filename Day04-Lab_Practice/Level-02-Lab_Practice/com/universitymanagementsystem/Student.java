package com.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Class representing a Student in the University
public class Student {

    // Stores the student's name
    private String studentName;

    // List to store the courses in which the student is enrolled
    private List<Course> enrolledCourses;

    // Constructor to initialize a Student object with a given name
    public Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    // Method to print all courses the student is enrolled in
    public void printEnrolledCourses() {
        System.out.println("Student: " + studentName + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    // Getter method to retrieve the student's name
    public String getStudentName() {
        return studentName;
    }
}
