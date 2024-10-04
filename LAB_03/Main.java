public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30, "johndoe@example.com");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        // Create a BankAccount object
        BankAccount account = new BankAccount("1234567890", 1000, "John Doe");
        account.deposit(500);
        account.withdraw(200);

        // Create a Circle object
        Circle circle = new Circle(5);
        System.out.println("Area of the circle: " + circle.calculateArea());

        // Use the Utilities class
        double celsius = 30;
        double fahrenheit = Utilities.convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
    }
}
