package linkedListsBackground;

public class LinkedLIsts {
	/*public static void main(String[] args) {
        ListNode list = new ListNode();
        list.data = 42;
        list.next = new ListNode();
        list.next.data = -3;
        list.next.next = new ListNode();
        list.next.next.data = 17;
        list.next.next.next = null;
        System.out.println(list.data + " " + list.next.data
                           + " " + list.next.next.data);
        // 42 -3 17*/
	}
	public static void mainModified(String[] args) {
		ListNode list3 = new ListNode(17, null);
		ListNode list2 = new ListNode(-3, list3);
		ListNode list1 = new ListNode(42, list2);
        
        System.out.println(list1.data + " " + list2.next.data
                           + " " + list3.next.next.data);
        // 42 -3 17
    }

}
