package structures;
import assignment2.BankAccount;

import java.util.LinkedList;

public class AccountManager {
    private LinkedList<BankAccount> accounts = new LinkedList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added successfully");
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found");
            return;
        }

        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }

    public BankAccount findByUsername(String username) {
        for (BankAccount acc : accounts) {
            if (acc.getUsername().equalsIgnoreCase(username)) {
                return acc;
            }
        }
        return null;
    }

    public void deposit(String username, double amount) {
        BankAccount acc = findByUsername(username);
        if (acc != null) {
            acc.setBalance(acc.getBalance() + amount);
            System.out.println("New balance: " + acc.getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(String username, double amount) {
        BankAccount acc = findByUsername(username);
        if (acc != null) {
            if (acc.getBalance() >= amount) {
                acc.setBalance(acc.getBalance() - amount);
                System.out.println("New balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient funds");
            }
        } else {
            System.out.println("Account not found");
        }
    }
}