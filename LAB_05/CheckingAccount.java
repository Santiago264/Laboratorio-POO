// Subclass CheckingAccount
public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor to initialize the attributes
    public CheckingAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Method to withdraw money (overridden to allow overdrafts)
    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException {
        double currentBalance = getBalance();
        double balanceAfterWithdrawal = currentBalance - amount;

        if (balanceAfterWithdrawal < -this.overdraftLimit) {
            throw new OverdraftLimitExceededException("The overdraft limit has been exceeded.");
        } else if (balanceAfterWithdrawal < 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount);
        }
    }
}
