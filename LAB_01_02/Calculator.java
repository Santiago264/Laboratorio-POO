public class Calculator {
    // Method to perform addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: cannot divide by zero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
