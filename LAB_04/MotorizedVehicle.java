
// Derived class MotorizedVehicle
public class MotorizedVehicle extends Vehicle {
    private int engineDisplacement;

    // Constructor to initialize the attributes
    public MotorizedVehicle(String brand, String model, int engineDisplacement) {
        super(brand, model);
        this.engineDisplacement = engineDisplacement;
    }

    // Method to display the vehicle information (overridden)
    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Engine Displacement: " + this.engineDisplacement);
    }
}
