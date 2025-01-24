package com.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Class representing a Professor in the University
public class Professor {

    // Stores the professor's name
    private String professorName;

    // List to store the courses the professor teaches
    private List<Course> coursesTaught;

    // Constructor to initialize a Professor object with a given name
    public Professor(String professorName) {
        this.professorName = professorName;
        this.coursesTaught = new ArrayList<>();
    }

    // Method to assign a professor to a course
    public void assignProfessorToCourse(Course course) {
        coursesTaught.add(course);
        course.addProfessor(this);
    }

    // Method to print all courses the professor teaches
    public void printCoursesTaught() {
        System.out.println("Professor " + professorName + " teaches the following courses:");
        for (Course course : coursesTaught) {
            System.out.println(" - " + course.getCourseName());
        }
        System.out.println();
    }

    // Getter method to retrieve the professor's name
    public String getProfessorName() {
        return professorName;
    }
}
