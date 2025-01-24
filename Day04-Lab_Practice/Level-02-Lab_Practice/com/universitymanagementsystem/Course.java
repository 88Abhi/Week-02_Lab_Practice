package com.universitymanagementsystem;

import java.util.ArrayList;
import java.util.List;

// Class representing a Course in the University
public class Course {

    // Stores the course name
    private String courseName;

    // List to store students enrolled in the course
    private List<Student> enrolledStudents;

    // List to store professors assigned to the course
    private List<Professor> assignedProfessors;

    // Constructor to initialize a Course object with a given name
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
        this.assignedProfessors = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Method to add a professor to the course
    public void addProfessor(Professor professor) {
        assignedProfessors.add(professor);
    }

    // Method to print all students enrolled in the course
    public void printEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getStudentName());
        }
        System.out.println();
    }

    // Method to print all professors assigned to the course
    public void printAssignedProfessors() {
        System.out.println("Professors assigned to " + courseName + ":");
        for (Professor professor : assignedProfessors) {
            System.out.println(" - " + professor.getProfessorName());
        }
        System.out.println();
    }

    // Getter method to retrieve the course name
    public String getCourseName() {
        return courseName;
    }
}
