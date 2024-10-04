// Base class BankAccount
public class BankAccount {
    private double balance;

    // Constructor to initialize the attributes
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("Not enough balance to perform the withdrawal.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Current balance: " + this.balance);
        }
    }

    // Method to get the balance
    public double getBalance() {
        return this.balance;
    }
}
