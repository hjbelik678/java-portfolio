package linkedListsBackground;

public class Problem3 {
	public static void main(String[] args) {
		//problem from slides
		//chapter 15 slide 19
		ListNode list1 = ListNode(10, ListNode(20));
		ListNode list2 = ListNode(30, ListNode(40));
		listNode temp = list1.next;
		list1.next = list2;
		list2=list2.next
		list1.next.next=temp
		temp=null;
	}
}
