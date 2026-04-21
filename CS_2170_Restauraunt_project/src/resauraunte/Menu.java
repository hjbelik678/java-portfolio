package resauraunte;
import java.util.ArrayList;
import java.util.List;

//contains many menu items to represent restaurant menu
public class Menu {
    private List<MenuItem> menuItems;

    // Constructor to initialize the menu
    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    // Method to get all menu items in the menu
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (MenuItem item : menuItems) {
        	temp.append(item.getName()).append("\n");
        }
        return temp.toString();
    }
}