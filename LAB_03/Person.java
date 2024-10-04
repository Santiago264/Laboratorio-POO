public class Person {
    private String name;
    private int age;
    private String email;

    // Constructor to initialize the attributes
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter method to get the name
    public String getName() {
        return this.name;
    }

    // Setter method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to get the age
    public int getAge() {
        return this.age;
    }

    // Setter method to set the age
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: age cannot be negative.");
        }
    }

    // Getter method to get the email
    public String getEmail() {
        return this.email;
    }

    // Setter method to set the email
    public void setEmail(String email) {
        this.email = email;
    }
}
