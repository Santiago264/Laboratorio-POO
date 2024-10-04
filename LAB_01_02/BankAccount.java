public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of " + amount + " successful. Current balance: " + this.balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance to make the withdrawal.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Current balance: " + this.balance);
        }
    }

    // Method to check the balance
    public void checkBalance() {
        System.out.println("Current balance: " + this.balance);
    }
}
