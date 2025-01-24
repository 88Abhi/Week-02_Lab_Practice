package com.multilevelinheritance.educationalcoursehierarchy;

// Base class representing a general course
class Course
{
	// Name of the course
	protected String courseName;

	// Duration of the course in weeks
	protected int duration;

	// Constructor to initialize course details
	public Course(String courseName, int duration)
	{
		// Initializing values to instance variables
		this.courseName = courseName;
		this.duration = duration;
	}

	// Method to return course type
	public String getCourseType()
	{
		// Returning general course type
		return "General Course";
	}

	// Method to display course details
	public void displayCourseDetails()
	{
		// Printing course details
		System.out.println("\nCourse Name: " + courseName);
		System.out.println("Duration: " + duration + " weeks");
		System.out.println("Type: " + getCourseType());
	}
}