public class BankAccount {
    public String accountNumber;
    private double balance;
    protected String accountHolder;

    // Constructor to initialize the attributes
    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
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
}
