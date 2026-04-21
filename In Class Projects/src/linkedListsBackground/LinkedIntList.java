package linkedListsBackground;

import java.util.NoSuchElementException;

///////////////////////////////////////////////////////////
// *****some of these methods will be on the final!!!*****
///////////////////////////////////////////////////////////


public class LinkedIntList {
	private ListNode front;
    private int size;
	
	public LinkedIntList() {
		front = null;
	}
	
	public void add(int index, int value) {
		ListNode current = front;
		if(index>size) {
    		throw new IndexOutOfBoundsException();
    	}
		size++;
		if(index==0) {
			//ListNode temp = front;
			//front = new ListNode(value);
			//front.next = temp;
			
			front = new ListNode(value, front);
		}else {
			for(int i=0; i<index-1; i++) {
				current=current.next;
			}		
			ListNode temp = current.next;
			current.next = new ListNode(value);
			current.next.next = temp;
			temp = null;
		}
		
	}
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		}else {
			ListNode current = front;
			while(current.next != null) {
				current = current.next;
				
			}
			current.next = new ListNode(value);
		}
	}
    public String toString() {
    	String str = "[";
    	ListNode current = front;
    	
    	if(current==null) {
    		str+="]";
    	}else {
    		while(current.next != null) {
    			str = str + current.data;
    			if(current != null) {
    				str = str + ", ";
    			}
    		}
    	}
    	return str + "]";
    }
    
    public void add(int value) {
    	if(front == null) {
    		front = new ListNode(value);
    	}
    }
    
    public int get(int index) {
    	if(index>size) {
    		throw new IndexOutOfBoundsException();
    	}
    	ListNode current = front;
    	for(int i=0; i<index; i++) {
    		current = current.next;
    	}
    	return current.data;
    }
    
    public int size() {
    	return size;
    }
    public int remove() {
    	if(front==null) {
    		throw new NoSuchElementException();
    	}else {
	    	int temp = front.data;
	    	front = front.next;
	    	size--;
	    	return temp;
    	}
    }
	
    public void remove(int index) {
    	if(index >= size) {
    		throw new IndexOutOfBoundsException();
    	}
    	if(front==null) {
    		throw new NoSuchElementException();
    	}
    	if(size==1|| front.next==null||index==0) {//all of these condition are valid, only one is needed
    		front=null;
    	}else {
	    	ListNode current = front;
	    	for(int i=0; i<index-1; i++) {
	    	}
	    	//this says the next pointer points to the element after the removed one
	    	current.next=current.next.next;
    	}
    }
}
