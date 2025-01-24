package com.multilevelinheritance.educationalcoursehierarchy;

// Subclass representing an online course
class OnlineCourse extends Course
{

	// Platform where the course is available
	protected String platform;

	// Indicates if the course is recorded
	protected boolean isRecorded;

	// Constructor to initialize online course details
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded)
	{
		// Calling parent constructor to initialize common attributes
		super(courseName, duration);
		// // Initializing values to instance variables
		this.platform = platform;
		this.isRecorded = isRecorded;
	}

	// Overriding method to specify the course type
	@Override
	public String getCourseType()
	{
		// Returning online course type
		return "Online Course";
	}

	// Method to display online course details
	public void displayCourseDetails()
	{
		// Calling parent class method to print common details
		super.displayCourseDetails();
		// Printing Online course information
		System.out.println("Platform: " + platform);
		System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
	}
}
