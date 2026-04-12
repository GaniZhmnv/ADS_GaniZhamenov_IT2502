package structures;
import java.util.Stack;

public class TransactionManager {
    private Stack<String> history = new Stack<>();

    public void addTransaction(String transaction) {
        history.push(transaction);
        System.out.println("Transaction added");
    }

    public void showLastTransaction() {
        if (history.isEmpty()) {
            System.out.println("No transactions found");
            return;
        }
        System.out.println("Last transaction: " + history.peek());
    }

    public void undoLastTransaction() {
        if (history.isEmpty()) {
            System.out.println("No transactions to undo");
            return;
        }
        System.out.println("Undo -> " + history.pop() + " removed");
    }

    public void displayAllTransactions() {
        if (history.isEmpty()) {
            System.out.println("No transactions found");
            return;
        }

        for (String transaction : history) {
            System.out.println(transaction);
        }
    }
}