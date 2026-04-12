package structures;
import assignment2.BankAccount;

import java.util.LinkedList;
import java.util.Queue;

public class AccountRequestManager {
    private Queue<BankAccount> accountRequests = new LinkedList<>();

    public void addRequest(BankAccount account) {
        accountRequests.offer(account);
        System.out.println("Account request added");
    }

    public void processNextRequest(AccountManager accountManager) {
        if (accountRequests.isEmpty()) {
            System.out.println("No account requests");
            return;
        }

        BankAccount account = accountRequests.poll();
        accountManager.addAccount(account);
        System.out.println("Request processed for: " + account.getUsername());
    }

    public void displayPendingRequests() {
        if (accountRequests.isEmpty()) {
            System.out.println("No pending requests");
            return;
        }

        System.out.println("Pending account requests:");
        for (BankAccount account : accountRequests) {
            System.out.println(account);
        }
    }
}
