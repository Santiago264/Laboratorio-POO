// Concrete Triangle class
public class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize the attributes
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area (implemented specifically for Triangle)
    @Override
    public double calculateArea() {
        return (this.base * this.height) / 2;
    }
}
