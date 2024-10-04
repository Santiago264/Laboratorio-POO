// Final derived class Car
public final class Car extends MotorizedVehicle {
    private int numberOfDoors;

    // Constructor to initialize the attributes
    public Car(String brand, String model, int engineDisplacement, int numberOfDoors) {
        super(brand, model, engineDisplacement);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display the vehicle information (overridden)
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Number of doors: " + this.numberOfDoors);
    }
}
