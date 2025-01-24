package com.multilevelinheritance.educationalcoursehierarchy;

// Subclass representing a paid online course
class PaidOnlineCourse extends OnlineCourse
{

	// Course fee in dollars
	private double fee;

	// Discount percentage on the course
	private double discount;

	// Constructor to initialize paid course details
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount)
	{
		// Calling parent constructor to initialize common attributes
		super(courseName, duration, platform, isRecorded);
		// Initializing values to instance variables
		this.fee = fee;
		this.discount = discount;
	}

	// Overriding method to specify the course type
	@Override
	public String getCourseType()
	{
		// Returning paid online course type
		return "Paid Online Course";
	}

	// Method to calculate and return the final price after discount
	public double getFinalPrice()
	{
		// Calculating final price after applying discount
		return fee - (fee * discount / 100);
	}

	// Method to display paid online course details
	public void displayCourseDetails()
	{
		// Calling parent class method to print common details
		super.displayCourseDetails();
		// Printing course details
		System.out.println("Fee: " + fee);
		System.out.println("Discount: " + discount + "%");
		System.out.println("Final Price: " + getFinalPrice());
	}
}
