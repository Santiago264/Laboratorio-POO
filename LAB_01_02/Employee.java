public class Employee {
    private String name;
    private double salary;
    private String department;

    // Constructor to initialize the attributes
    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Method to get the name
    public String getName() {
        return this.name;
    }

    // Method to get the department
    public String getDepartment() {
        return this.department;
    }

    // Method to get the salary (only accessible within the Employee class)
    private double getSalary() {
        return this.salary;
    }

    // Method to display employee information
    public void displayInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.getSalary());
    }
}
