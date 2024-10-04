// Derived class Car
public class Cars extends Vehicle {
    private int numberOfDoors;

    // Constructor to initialize the attributes
    public Cars(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to get the number of doors
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
}
