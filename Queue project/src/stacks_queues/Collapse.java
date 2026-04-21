package stacks_queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class Collapse {
	public static void main(String[] args) {
		Stack<Integer> george = new Stack<>();
		
		int[] integersToAdd = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        System.out.println("Adding 10 integers to the stack:");
        for (int i = 0; i < integersToAdd.length; i++) {
            george.push(integersToAdd[i]);
            //System.out.println("Added: " + integersToAdd[i]);
        }
		
		collapse(george);
		System.out.print("[");
		for (Integer element : george) {
            System.out.print(" "+element+",");
        }
		System.out.print("]");
	}
	
	public static void collapse(Stack<Integer> stack1) {
		int addend1;
		int addend2;
		Stack<Integer> stack2 = new Stack<>();
		Queue<Integer> q = new LinkedList<Integer>();
		while(!stack1.isEmpty()) {
			q.add(stack1.pop());		
		}
		while(!q.isEmpty()) {
			try {
				addend1 = q.remove();
			}catch (Exception NoSuchElementException) {
				addend1 = 0;
			}
			try {
				addend2 = q.remove();
			}catch (Exception NoSuchElementException) {
				addend2 = 0;
			}
			
			int sum = addend1 + addend2;
			stack2.push(sum);
		}
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
}
