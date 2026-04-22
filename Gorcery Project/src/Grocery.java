
public class Grocery {
        public static void main(String[] args) {
            // Create grocery items
            GroceryItemOrder item1 = new GroceryItemOrder("Apples", 2, 1.50);
            GroceryItemOrder item2 = new GroceryItemOrder("Bananas", 3, 0.75);
            GroceryItemOrder item3 = new GroceryItemOrder("Milk", 1, 2.00);
    
            // Create a grocery list
            GroceryList groceryList = new GroceryList();
    
            groceryList.add(item1);
            groceryList.add(item2);
            groceryList.add(item3);
    
            System.out.println("Total cost of grocery items: $" + groceryList.getTotalCost());

            item1.setQuantity(3);
    
            // Display total cost after updating quantit
            System.out.println("Updated total cost of grocery items: $" + groceryList.getTotalCost());
        }
}