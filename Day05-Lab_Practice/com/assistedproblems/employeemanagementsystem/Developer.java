package com.assistedproblems.employeemanagementsystem;

// Defining the Developer subclass extending Employee
class Developer extends Employee
{
     // Declaring the primary programming language of the developer
     private String programmingLanguage;

     // Constructor to initialize Developer object
     public Developer(String name, int id, double salary, String programmingLanguage)
     {
          super(name, id, salary);
          this.programmingLanguage = programmingLanguage;
     }

     // Overriding displayDetails method to include Developer-specific details
     @Override
     public void displayDetails()
     {
          super.displayDetails();
          System.out.println("Programming Language: " + programmingLanguage);
     }
}

