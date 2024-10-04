public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 5000);
        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Bonus: " + employee.calculateBonus());

        // Create a Manager object
        Manager manager = new Manager("Jane Doe", 6000);
        System.out.println("Manager: " + manager.getName());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Bonus: " + manager.calculateBonus());

        // Create a Car object
        Car car = new Car("Toyota", "Corolla", 1600, 4);
    }
}

    