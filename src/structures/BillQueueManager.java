package structures;
import java.util.LinkedList;
import java.util.Queue;

public class BillQueueManager {
    private Queue<String> billQueue = new LinkedList<>();

    public void addBill(String bill) {
        billQueue.offer(bill);
        System.out.println("Added: " + bill);
    }

    public void processNextBill() {
        if (billQueue.isEmpty()) {
            System.out.println("No bills in queue");
            return;
        }
        System.out.println("Processing: " + billQueue.poll());
    }

    public void displayBills() {
        if (billQueue.isEmpty()) {
            System.out.println("No bills in queue");
            return;
        }

        System.out.println("Bill Queue:");
        for (String bill : billQueue) {
            System.out.println(bill);
        }
    }
}