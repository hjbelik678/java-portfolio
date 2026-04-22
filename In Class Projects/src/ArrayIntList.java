import java.util.Arrays;

public class ArrayIntList {
    protected final static int DEFAULT_CAPACITY = 10;
    
    private int[] list;
    private int size;
    
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayIntList(int userCapacity) {
        list = new int[userCapacity];
        size = 0;
    }
    
    public void ensureCapacity(int capacity) {
        while (capacity > list.length) {
            list = Arrays.copyOf(list, 2 * list.length);
        }
    }
    
    public void add(int item) {
        // Fix: Check against list.length, not the constant
        if (size == list.length) {
            ensureCapacity(size + 1);
        }
        list[size] = item;
        size++;
    }
    
    public int indexOf(int item) {
        // Fix: Loop to size, return -1 outside loop
        for(int i = 0; i < size; i++) {
            if(list[i] == item) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(int item) {
        // Fix: Loop to size
        for(int i = 0; i < size; i++) {
            if(list[i] == item) {
                return true;
            }
        }
        return false;
    }
    
    public String toString() {
        if (size == 0) return "[]";
        
        String str = "[" + list[0];
        for(int i = 1; i < size; i++) {
            str += ", " + list[i];
        }
        return str + "]";
    }
    
    public void add(int index, int item) {
        if(index < 0 || index > size) { // Changed index > size to allow appending
            throw new ArrayIndexOutOfBoundsException(index);
        }
        // Fix: Check capacity before adding at index
        if (size == list.length) {
            ensureCapacity(size + 1);
        }
        for(int i = size; i > index; i--) {
            list[i] = list[i-1];
        }
        list[index] = item;
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public int get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return list[index];
    }
    
    public void set(int index, int value) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        list[index] = value;
    }
    
    public void remove(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        for(int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
    }
}