package exerciseweek5.exercise5_4;

/**
4. Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
 */
public interface Accounts {

    // Declare the abstract method "deposit/withdraw" to deposit/withdraw a specified amount
    void deposit(double amount);
    void withdraw(double amount);

    // Declare the abstract method "getBalance" to retrieve the current balance
    double getBalance();

    
}
