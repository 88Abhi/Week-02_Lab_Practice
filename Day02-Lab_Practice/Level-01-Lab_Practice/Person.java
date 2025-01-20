// Person class that stores personal details and allows cloning through a copy constructor
public class Person {

    // Declaring private attributes for person details
    private String name;
    private int age;

    // Parameterized constructor to initialize person attributes
    public Person(String name, int age) {
        // Assigning values using 'this' keyword
        this.name = name;
        this.age = age;
    }

    // Copy constructor to clone another person's attributes
    public Person(Person other) {
        // Copy values from the given Person object
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person's details
    public void displayDetails() {
        // Prints the name of the person
        System.out.println("Name: " + name);
        // Prints the age of the person
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person originalPerson = new Person("Abhishek", 25);

        // Creating a Person object using the copy constructor
        Person clonedPerson = new Person(originalPerson);

        // Displaying the details of original person
        System.out.println("=== Original Person ===");
        originalPerson.displayDetails();

        // Displaying details of the cloned person
        System.out.println("\n=== Cloned Person ===");
        clonedPerson.displayDetails();
    }
}
