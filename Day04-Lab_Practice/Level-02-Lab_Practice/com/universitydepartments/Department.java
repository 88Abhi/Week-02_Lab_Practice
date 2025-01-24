package com.universitydepartments;

import java.util.ArrayList;

// Class representing a Department in a University
class Department {
    // Private attribute to store the department name
    private String departmentName;

    // Private list to store faculty members associated with this department
    private ArrayList<Faculty> faculties;

    // Constructor to initialize a Department object with a department name
    public Department(String departmentName) {
        // Assigning the provided department name to the attribute
        this.departmentName = departmentName;

        // Initializing the list that will store faculty members
        this.faculties = new ArrayList<>();
    }

    // Method to add a faculty member to the department
    public void addFaculty(Faculty faculty) {
        // Adding the provided faculty object to the faculties list
        faculties.add(faculty);
    }

    // Method to retrieve the department name
    public String getDepartmentName() {
        // Returning the department name
        return departmentName;
    }

    // Method to display department details along with faculty members
    public void printDepartmentDetails() {
        // Printing department name
        System.out.println("Department: " + departmentName);

        // Checking if department has faculty members
        if (faculties.isEmpty()) {
            System.out.println("No faculty members assigned.");
        } else {
            System.out.println("Faculty Members:");
            for (Faculty faculty : faculties) {
                faculty.printFacultyDetails();
            }
        }
    }
}

