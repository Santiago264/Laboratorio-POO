// Base class Employee
public class Employee {
    private String name;
    private double salary;

    // Constructor to initialize the attributes
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate the bonus
    public double calculateBonus() {
        return this.salary * 0.10;
    }

    // Getter method to get the name
    public String getName() {
        return this.name;
    }

    // Getter method to get the salary
    public double getSalary() {
        return this.salary;
    }
}
