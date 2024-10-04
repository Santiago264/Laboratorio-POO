// Derived class Manager
public class Manager extends Employee {
    // Constructor to initialize the attributes
    public Manager(String name, double salary) {
        super(name, salary);
    }

    // Method to calculate the bonus (overridden)
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (super.getSalary() * 0.05);
    }
}
