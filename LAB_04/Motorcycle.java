// Final derived class Motorcycle
public final class Motorcycle extends MotorizedVehicle {
    private int numberOfWheels;

    // Constructor to initialize the attributes
    public Motorcycle(String brand, String model, int engineDisplacement, int numberOfWheels) {
        super(brand, model, engineDisplacement);
        this.numberOfWheels = numberOfWheels;
    }

    // Method to display the vehicle information (overridden)
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Number of wheels: " + this.numberOfWheels);
    }
}
