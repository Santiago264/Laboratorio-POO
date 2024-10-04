// Concrete class Square
public class Square extends Shape {
    private double side;

    // Constructor to initialize the attributes
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area (implemented specifically for Square)
    @Override
    public double calculateArea() {
        return this.side * this.side;
    }
}
