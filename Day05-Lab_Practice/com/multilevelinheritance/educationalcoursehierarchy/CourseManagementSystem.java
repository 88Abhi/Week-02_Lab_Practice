package com.multilevelinheritance.educationalcoursehierarchy;

// CourseManagementSystem class to execute and test the course hierarchy
public class CourseManagementSystem
{
	public static void main(String[] args)
	{
		// Creating an instance of Course with default details
		Course course = new Course("Mathematics", 8);

		// Displaying course details
		course.displayCourseDetails();

		// Creating an instance of OnlineCourse with platform and recording details
		OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 6, "Udemy", true);

		// Displaying online course details
		onlineCourse.displayCourseDetails();

		// Creating an instance of PaidOnlineCourse with fee and discount details
		PaidOnlineCourse paidCourse = new PaidOnlineCourse("AI & Machine Learning", 10, "Coursera", true, 500, 20);

		// Displaying paid online course details
		paidCourse.displayCourseDetails();
	}
}

