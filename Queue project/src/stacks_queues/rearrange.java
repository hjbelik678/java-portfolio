package stacks_queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class rearrange {
	public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Add some elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original queue: " + queue);

        // Test the Rearrange method
        Rearrange(queue);

        // Print the rearranged queue
        System.out.println("Rearranged queue: " + queue);
    }
	
	public static void Rearrange(Queue<Integer> q) {
		Stack<Integer> temp = new Stack<>();
		int size = q.size();
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j<size; j++) {
				int value = q.peek();
				if(value % 2==0) {
					//puts evens to the back of the queue
					int num = q.remove();
					q.add(num);
				}else {
					//moves odds to intermediete stack
					temp.add(q.remove());
				}
			}	
			//adds the odds to the queue
			while(!temp.isEmpty()) {
				q.add(temp.pop());
			}
		}
		
	}
}
