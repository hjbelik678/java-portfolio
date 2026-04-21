import java.util.Arrays;

public class ArrayIntList {
	protected final static int CAPACITY = 10;
	
	private int[] list;
	private int size;
	
	ArrayIntList(){
		list = new int[CAPACITY];
		size = 0;
	}
	
	ArrayIntList(int UserCapacity) {
		this(CAPACITY);
	}
	
	public void ensureCapacity(int capacity) {
		// Makes sure that this list's internal array is large
		// enough to store the given number of elements.
		// Postcondition: elementData.length >= capacity
	    // double in size until large enough
	    while (capacity > list.length) {
	        list = Arrays.copyOf(list,2 * list.length);
	    }
	}

	
	public void add(int item) {
		if(size == CAPACITY) {
			ensureCapacity(CAPACITY*2);
		}
			
		list[size] = item;
		size++;
		
	}
	
	public int indexOf(int item) {
		for(int i = 0; i<list.length; i++) {
			if(list[i] == item) {
				return i;
			}
			return -1;
		}
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
	}

	public boolean contains(int item) {
		for(int i=0; i<list.length; i++) {
			if(list[i] == item) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String str = "[";
		if(size>1) {
			str+= list[0];
		}
		
		for(int i=1; i<size; i++) {
			str+=", "+list[i];
		}
		str+= "]";
		return str;
	}
	
	public void add(int index, int item) {
		// adds the element at the given index.
		// Precondition: 0 <= index < size
			if(index<0 ||  index >= size) {
				throw new ArrayIndexOutOfBoundsException(index);
			}
		for(int i=size; i>index; i--) {
			list[i]=list[i-1];
		}
		list[index] = item;
		//necessary otherwise last elements of list gets cutoff
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		// Returns the element at the given index.
		// Precondition: 0 <= index < size
		if(index<0 ||  index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return list[index];
	}
	
	public void set(int index, int value) {
		// Defines the element at the given index.
		// Precondition: 0 <= index < size
		if(index<0 ||  index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		list[index] = value;
	}
	
	public void remove(int index) {
		// Removes the element at the given index.
		// Precondition: 0 <= index < size
		if(index<0 ||  index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		for(int i=index;i<size-1; i++) {
			list[i] = list[i+1];
		}
		size--;
	}
	
}
