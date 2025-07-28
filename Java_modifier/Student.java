package Java_modifier;

public class Student {

	// Instance variables

	int id;

	String name;

	// Static variable to count total students

	static int studentCount = 0;

	// Constructor

	public Student(int id, String name) {

		this.id = id;

		this.name = name;

		studentCount++; // Increment count whenever a student is created

	}

	// Static method to return total students

	static int getTotalStudents() {

		return studentCount;

	}

	// Method to print student details

	void printDetails() {

		System.out.println("ID: " + id + ", Name: " + name);

	}

	// Main method

	public static void main(String[] args) {

		// Creating student objects

		Student s1 = new Student(101, "Ravi");

		Student s2 = new Student(102, "Shreyash");

		Student s3 = new Student(103, "Dinesh");

		Student s4 = new Student(103, "Prashant");

		// Printing each student's details

		s1.printDetails();

		s2.printDetails();

		s3.printDetails();

		// Printing total number of students created

		System.out.println("Total students created: " + Student.getTotalStudents());

	}

}