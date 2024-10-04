// Base class Vehicle
public class Vehicle {
    private String brand;
    private String model;

    // Constructor to initialize the attributes
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Method to display the vehicle information
    public void displayInformation() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
    }
}
