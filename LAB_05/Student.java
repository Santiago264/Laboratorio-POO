// Derived class Student
public class Student extends Person {
    private String name;

    // Constructor to initialize the attributes
    public Student(String name) {
        this.name = name;
    }

    // Method to greet (overridden to include the student's name)
    @Override
    public void greet() {
        System.out.println("Hello, I am " + this.name);
    }

    // Method to greet another person (overloaded)
    public void greet(String name) {
        System.out.println("Hello " + name + ", I am " + this.name);
    }
}
