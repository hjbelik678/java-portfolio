package resauraunte;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create menu items
        MenuItem burger = new MenuItem("Burger");
        MenuItem pizzaWhole = new MenuItem("Whole Pizza");
        MenuItem calzone = new MenuItem("Calzone");
        MenuItem salad = new MenuItem("Salad");
        MenuItem pizzaSlice = new MenuItem("Pizza Slice");
        MenuItem pulledPork = new MenuItem("Pulled Pork");
        MenuItem coke = new MenuItem("Coke");
        MenuItem pepsi = new MenuItem("Pepsi");
        MenuItem lemonade = new MenuItem("Lemonade");
        MenuItem water = new MenuItem("Water");

        // Initialize the menu
        Menu menu = new Menu();
        menu.addMenuItem(burger);
        menu.addMenuItem(pizzaWhole);
        menu.addMenuItem(calzone);
        menu.addMenuItem(salad);
        menu.addMenuItem(pizzaSlice);
        menu.addMenuItem(pulledPork);
        menu.addMenuItem(coke);
        menu.addMenuItem(pepsi);
        menu.addMenuItem(lemonade);
        menu.addMenuItem(water);

        // Show complete menu
        System.out.println("Welcome to Godfathers");
        System.out.println("=====================");
        System.out.println(menu);
        System.out.println("=====================");
        System.out.println();
        System.out.println();


        // Manage table occupancy
        TableManager tableManager = new TableManager();
        // Add tables with numbers and capacities
        tableManager.addTable(1, 4);
        tableManager.addTable(2, 6);
        tableManager.addTable(3, 2);
        System.out.println();


        // Mark some tables as occupied
        tableManager.markTableOccupied(1);
        tableManager.markTableOccupied(2);
        System.out.println();


        // Print the status of all tables
        tableManager.printTableStatus();
        System.out.println();

        // Initialize waiter
        Waiter waiter = new Waiter();

        // Initialize chef & waiter queue
        Queue<MenuItem> chefQueue = new LinkedList<>();
        Queue<MenuItem> serverQueue = new LinkedList<>();

        // Add orders to chef queue and specify ordered items for each table
        waiter.takeOrder(burger, chefQueue);
        waiter.takeOrder(pizzaSlice, chefQueue);
        waiter.takeOrder(lemonade, chefQueue);
        waiter.takeOrder(calzone, chefQueue);
        waiter.takeOrder(coke, chefQueue);
        
        Table table1 = tableManager.getTable(1);
            waiter.takeOrder(burger, chefQueue);
            waiter.takeOrder(pizzaSlice, chefQueue);
            table1.addOrderedItem(burger);
            table1.addOrderedItem(pizzaSlice);
        

        Table table2 = tableManager.getTable(2);
            waiter.takeOrder(lemonade, chefQueue);
            waiter.takeOrder(calzone, chefQueue);
            table2.addOrderedItem(lemonade);
            table2.addOrderedItem(calzone);
        


        // Create a Chef instance
        chef Chef = new chef();

        // Chef processes the queue and adds finished items to the server's queue
        chef.makeFood(chefQueue, serverQueue);
        System.out.println();


        // Print the items in the server's queue
        System.out.println("Items ready to serve:");
        while (!serverQueue.isEmpty()) {
            waiter.deliverOrder(serverQueue);
        }
        System.out.println();

        // Mark tables as available
        tableManager.markTableAvailable(1);
        tableManager.markTableAvailable(2);
        System.out.println();


        // Print the updated table status
        tableManager.printTableStatus();
        System.out.println();
        System.out.println();

        // Print ordered items for each table
        System.out.println("table 1");
        table1.itemsOrdered();
        System.out.println("table 2");
        table2.itemsOrdered();
    }
}