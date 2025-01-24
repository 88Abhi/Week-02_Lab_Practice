package com.hierarchicalinheritance.schoolmanagementsystem;

// SchoolSystem class to test the school system
public class SchoolSystem
{
	public static void main(String[] args)
	{
		// Creating an instance of Teacher with subject specialization
		Teacher teacher = new Teacher("Abhishek", 35, "Mathematics");

		// Displaying teacher details
		teacher.displayTeacherDetails();

		// Calling displayRole() to describe the role
		teacher.displayRole();

		// Creating an instance of Student with grade level
		Student student = new Student("Amit", 16, "10th Grade");

		// Displaying student details
		student.displayStudentDetails();

		// Calling displayRole() to describe the role
		student.displayRole();

		// Creating an instance of Staff with job title
		Staff staff = new Staff("Ankit", 40, "Librarian");

		// Displaying staff details
		staff.displayStaffDetails();

		// Calling displayRole() to describe the role
		staff.displayRole();
	}
}