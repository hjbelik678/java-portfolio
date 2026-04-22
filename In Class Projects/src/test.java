
public class Test {
	public static void main(String[] args) {

		ArrayIntList mylist = new ArrayIntList();
		mylist.add(4);
		mylist.add(5);
		mylist.add(3);
		mylist.add(7);
		
		mylist.add(1, 2);
		mylist.add(3, -47);
		System.out.println("array list: " + mylist);
		
		System.out.println("element 3: " + mylist.get(3));
		mylist.set(0,  -4);
		System.out.println("set element 0: " + mylist);
		
		mylist.remove(0);
		System.out.println("removed element 0: "+mylist);
		
		mylist.add(4);
		mylist.add(5);
		mylist.add(3);
		mylist.add(7);
		mylist.add(4);
		System.out.println("array list: " + mylist);
		mylist.add(5);
		System.out.println("array list: " + mylist);
		mylist.add(3);
		System.out.println("array list: " + mylist);
		mylist.add(7);
	}
}
