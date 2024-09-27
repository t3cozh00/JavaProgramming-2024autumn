package exerciseweek5.exercise5_4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Declare a private list to store accounts, specifying the correct generic type
    private List<Accounts> accounts; 
    // what is the generic type? A generic type is a generic class or interface that is parameterized over types. The most common use of generics is to create collection classes. For example, the Java Collection API has many generic classes and interfaces such as HashSet, ArrayList, HashMap, etc.
    // Bank access the both of CurrentAccount and SavingAccount through the interface Accounts

    // Constructor for initializing the list of accounts
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Method to add/remove an account to the list
    public void addAccount(Accounts account) {
        accounts.add(account);
    }
    public void removeAccount(Accounts account) {
        accounts.remove(account);
    }

    // Method to deposit/withdraw a specified amount into an account
    public void deposit(Accounts account, double amount) {
        account.deposit(amount);
    }
    public void withdraw(Accounts account, double amount) {
        account.withdraw(amount);
    }

    // Method to print the balances of all accounts in the bank
    public void printAccountBalances() {
        for (Accounts account : accounts) {
            System.out.println("Account balance" + account.getBalance());
        }
    }


    
}
