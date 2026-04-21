//waiter will take finished food items out of serve queue when delivered to customer
package resauraunte;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Waiter {
    // Method for taking food orders from customers and adding them to the chef's queue
	// Map to track ordered items and their counts
	private Map<MenuItem, Integer> orderTracker;

    // Constructor to initialize the order tracker
    public Waiter() {
        this.orderTracker = new HashMap<>();
    }

    public void takeOrder(MenuItem menuItem, Queue<MenuItem> chefQueue) {
        System.out.println("Waiter takes order: " + menuItem.getName());
        
        // Add the order to the chef's queue
        chefQueue.add(menuItem); 
        
        // Update order tracker
        orderTracker.put(menuItem, orderTracker.getOrDefault(menuItem, 0) + 1);
    }

    public void deliverOrder(Queue<MenuItem> serverQueue) {
        if (!serverQueue.isEmpty()) {
        	// Retrieve and remove the finished order from the queue
            MenuItem item = serverQueue.poll();
            System.out.println("Waiter delivers order: " + item.getName());
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    // Method to get the order tracker
    public Map<MenuItem, Integer> getOrderTracker() {
        return orderTracker;
    }
}
