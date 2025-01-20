// Vehicle class that represents a vehicle with owner details and shared registration fee
public class Vehicle {
    // Declaring private instance variable for owner's name and vehicle type
    private String ownerName;
    private String vehicleType;

    // Declaring a static class variable for registration fee
    private static double registrationFee = 100.0;

    // Constructor to initialize a vehicle with owner name and type
    public Vehicle(String ownerName, String vehicleType) {
        // Assigning parameter values to instance variables using 'this'
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display details of a specific vehicle
    public void displayVehicleDetails() {
        // Printing the owner's name
        System.out.println("Owner Name: " + ownerName);

        // Printing the vehicle type
        System.out.println("Vehicle Type: " + vehicleType);

        // Printing the registration fee
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        // Updating the static registrationFee variable with the new fee
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        // Creating the first vehicle instance with owner name and type
        Vehicle vehicle1 = new Vehicle("Abhishek Jat", "Car");

        System.out.println("=== Vehicle Details ===");

        // Displaying details of the first vehicle
        vehicle1.displayVehicleDetails();

        // Printing a message before updating the registration fee
        System.out.println("\nUpdating Registration Fee...");

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(200.0);

        System.out.println("\n=== Updated Vehicle Details ===");

        // Displaying details again after updating registration fee
        vehicle1.displayVehicleDetails();
    }
}