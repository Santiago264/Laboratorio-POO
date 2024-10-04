public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("John Doe", "1234567890", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();

        // Create a Calculator object
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Division: " + calculator.divide(10, 5));

        // Create an Employee object
        Employee employee = new Employee("John Doe", 5000, "Development");
        employee.displayInformation();
    }
}
