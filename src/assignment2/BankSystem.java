package assignment2;
import structures.AccountManager;
import structures.AccountRequestManager;
import structures.BillQueueManager;
import structures.TransactionManager;

import java.util.Scanner;

public class BankSystem {
    private AccountManager accountManager = new AccountManager();
    private TransactionManager transactionManager = new TransactionManager();
    private BillQueueManager billQueueManager = new BillQueueManager();
    private AccountRequestManager requestManager = new AccountRequestManager();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1 - Bank");
            System.out.println("2 - ATM");
            System.out.println("3 - Admin");
            System.out.println("4 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bankMenu();
                    break;
                case 2:
                    atmMenu();
                    break;
                case 3:
                    adminMenu();
                    break;
                case 4:
                    System.out.println("Goodbye");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void bankMenu() {
        System.out.println("\n1 - Submit account request");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                BankAccount account = new BankAccount(0, username, 0);
                requestManager.addRequest(account);
                break;

            case 2:
                System.out.print("Enter username: ");
                String user1 = scanner.nextLine();
                System.out.print("Amount: ");
                double dep = scanner.nextDouble();
                accountManager.deposit(user1, dep);
                transactionManager.addTransaction("Deposit " + dep + " to " + user1);
                break;

            case 3:
                System.out.print("Enter username: ");
                String user2 = scanner.nextLine();
                System.out.print("Amount: ");
                double wit = scanner.nextDouble();
                accountManager.withdraw(user2, wit);
                transactionManager.addTransaction("Withdraw " + wit + " from " + user2);
                break;
        }
    }

    private void atmMenu() {
        System.out.println("\n1 - Check balance");
        System.out.println("2 - Withdraw");

        int choice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        switch (choice) {
            case 1:
                BankAccount acc = accountManager.findByUsername(username);
                if (acc != null) {
                    System.out.println("Balance: " + acc.getBalance());
                } else {
                    System.out.println("Account not found");
                }
                break;

            case 2:
                System.out.print("Amount: ");
                double amount = scanner.nextDouble();
                accountManager.withdraw(username, amount);
                transactionManager.addTransaction("ATM Withdraw " + amount + " from " + username);
                break;
        }
    }

    private void adminMenu() {
        System.out.println("\n1 - View requests");
        System.out.println("2 - Process request");
        System.out.println("3 - View bills");
        System.out.println("4 - Process bill");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                requestManager.displayPendingRequests();
                break;

            case 2:
                requestManager.processNextRequest(accountManager);
                break;

            case 3:
                billQueueManager.displayBills();
                break;

            case 4:
                billQueueManager.processNextBill();
                break;
        }
    }
}