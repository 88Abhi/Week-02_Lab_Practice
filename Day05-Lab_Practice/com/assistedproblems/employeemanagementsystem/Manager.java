package com.assistedproblems.employeemanagementsystem;

// Defining the Manager subclass extending Employee
class Manager extends Employee
{
     // Declaring the number of team members under the manager
     private int teamSize;

     // Constructor to initialize Manager object
     public Manager(String name, int id, double salary, int teamSize)
     {
          super(name, id, salary);
          this.teamSize = teamSize;
     }

     // Overriding displayDetails method to include Manager-specific details
     @Override
     public void displayDetails()
     {
          super.displayDetails();
          System.out.println("Team Size: " + teamSize);
     }
}
