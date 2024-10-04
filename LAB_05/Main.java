public class Main {
    public static void main(String[] args) throws OverdraftLimitExceededException {
        // Exercise 1: Abstract class Shape
        Shape triangle = new Triangle(5, 6);
        Shape square = new Square(4);

        System.out.println("Area of the triangle: " + triangle.calculateArea());
        System.out.println("Area of the square: " + square.calculateArea());

        // Exercise 2: Movable interface
        Movable car = new Car();
        Movable plane = new Airplane();

        car.move();
        plane.move();

        // Exercise 3: Base Person class and derived Student class
        Person person = new Person();
        Student student = new Student("Juan");

        person.greet();
        student.greet();
        student.greet("Maria");

        // Exercise 4: Base Vehicle class and derived Car class
        Vehicle vehicle = new Vehicle("Toyota");
        Cars car2 = new Cars("Toyota", 4);

        System.out.println("Brand of the vehicle: " + vehicle.getBrand());
        System.out.println("Brand of the car: " + car2.getBrand());
        System.out.println("Number of doors of the car: " + car2.getNumberOfDoors());

        // Exercise 5: Base BankAccount class and derived CheckingAccount class
        BankAccount bankAccount = new BankAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1000, 500);

        try {
            bankAccount.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkingAccount.withdraw(2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (OverdraftLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
