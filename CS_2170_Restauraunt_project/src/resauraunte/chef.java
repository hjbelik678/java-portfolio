//chefs takes item out of orders queue and will add it to serve queue when finished cooking
package resauraunte;

import java.util.Queue;

public class chef {
	public static void makeFood(Queue<MenuItem> chefQueue, Queue<MenuItem> serverQueue) {
        while (!chefQueue.isEmpty()) {
        	// Retrieve and remove the head of the chef's queue
            MenuItem item = chefQueue.poll();
            System.out.println("Chef is cooking: " + item.getName());
            // Once cooked, add the item to the server's queue
            serverQueue.add(item);
        }
    }
}
