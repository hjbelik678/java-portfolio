package resauraunte;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private int tableNumber;
    private int capacity;
    private boolean isOccupied;
    private List<MenuItem> orderedItems;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isOccupied = false; // Initialize as not occupied
        this.orderedItems = new ArrayList<>(); // Initialize the list of ordered items
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void addOrderedItem(MenuItem menuItem) {
        orderedItems.add(menuItem);
    }
    public void itemsOrdered() {
    	for(MenuItem item: orderedItems) {
    		System.out.println(item.toString());
    	}
    }
}