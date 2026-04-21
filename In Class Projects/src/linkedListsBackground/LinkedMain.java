package linkedListsBackground;

public class LinkedMain {
	public static void main(String[] args) {
		LinkedIntList myList = new LinkedIntList();
		myList.add(5);
		myList.add(6);
		myList.add(8);
		myList.add(5);
		myList.add(9);
		
		System.out.println(myList);
		
		myList.add(2, 10);
		
		System.out.println(myList);
		
		myList.remove(2);
		
		System.out.println(myList);

		System.out.println(myList);

	}
}
