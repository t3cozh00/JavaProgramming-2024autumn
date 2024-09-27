package exerciseweek5.exercise5_4;

//// Declare the CurrentAccount class, which implements the Account interface
public class CurrentAccount implements Accounts {
    // Declare private instance variables to store balance and overdraft limit
    private double balance;
    private double overdraftLimit; //透支限额

    // Constructor for initializing the balance and overdraft limit
    public CurrentAccount(double initialDeposit, double overdraftLimit) {
        this.balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        // Check if the balance plus overdraft limit is sufficient to cover the withdrawal
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }

    // Method to set the overdraft limit for the current account
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

