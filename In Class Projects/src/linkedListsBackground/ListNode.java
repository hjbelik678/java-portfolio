package linkedListsBackground;

public class ListNode {
    int data;
    ListNode next;
    int size;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public int size() {
    	return size;
    }
}
