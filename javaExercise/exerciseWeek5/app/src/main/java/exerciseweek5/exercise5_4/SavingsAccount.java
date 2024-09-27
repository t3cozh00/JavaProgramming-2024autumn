package exerciseweek5.exercise5_4;

public class SavingsAccount implements Accounts {
    // Declare private instance variables to store balance and interest rate
    private double balance;
    private double interestRate;

    // Constructor for initializing the balance and interest rate
    public SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    // Implement the "deposit/withdraw" method to add/minus a specified amount to the balance
    @Override
    public void deposit(double amount) {
        balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Implement the "getBalance" method to retrieve the current balance
    @Override
    public double getBalance() {
        return balance;
    }

    // Implement the "calculateInterest" method to apply interest to the balance
    public void calculateInterest() {
        balance += balance * interestRate / 100;
    }
}
