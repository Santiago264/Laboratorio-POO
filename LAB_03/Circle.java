public class Circle {
    private final double radius;

    // Constructor to initialize the attribute
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
