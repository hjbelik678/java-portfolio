package resauraunte;
import java.util.HashMap;
import java.util.Map;

// Define a class to manage tables in the restaurant
public class TableManager {
    private Map<Integer, Table> tableMap;

    public TableManager() {
        this.tableMap = new HashMap<>();
    }

    // Method to add a table to the table map
    public void addTable(int tableNumber, int capacity) {
        tableMap.put(tableNumber, new Table(tableNumber, capacity));
    }

    // Method to mark a table as occupied
    public void markTableOccupied(int tableNumber) {
        Table table = tableMap.get(tableNumber);
        if (table != null) {
            table.setOccupied(true);
            System.out.println("Table " + tableNumber + " is now occupied.");
        } else {
            System.out.println("Table " + tableNumber + " does not exist.");
        }
    }

    public void markTableAvailable(int tableNumber) {
        Table table = tableMap.get(tableNumber);
        if (table != null) {
            table.setOccupied(false);
            System.out.println("Table " + tableNumber + " is now available.");
        } else {
            System.out.println("Table " + tableNumber + " does not exist.");
        }
    }

    public boolean isTableOccupied(int tableNumber) {
        Table table = tableMap.get(tableNumber);
        return table != null && table.isOccupied();
    }

    public int getTableCapacity(int tableNumber) {
        Table table = tableMap.get(tableNumber);
        return table != null ? table.getCapacity() : -1; // Return -1 if table not found
    }

    public void printTableStatus() {
        System.out.println("Table Status:");
        for (Map.Entry<Integer, Table> entry : tableMap.entrySet()) {
            int tableNumber = entry.getKey();
            Table table = entry.getValue();
            String status = table.isOccupied() ? "Occupied" : "Available";
            System.out.println("Table " + tableNumber + ": " + status);
        }
    }
    public Table getTable(int tableNumber) {
        return tableMap.get(tableNumber);
    }
}
