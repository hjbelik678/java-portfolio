//Henry Belik

import java.util.ArrayList;
import java.util.Random;

public class filterRangeMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < 14; i++) {
            int randomNumber = random.nextInt(10) + 1; 
            list.add(randomNumber);
        }
        System.out.println(list);
        int min = 5;
        int max = 7;
        filterRange(list, min, max);
        System.out.println(list); 
    }
    
    public static void filterRange(ArrayList<Integer> list, int min, int max) {
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (value >= min && value <= max) {
                list.remove(i);
                // Decrement i to adjust for removed element
                i--; 
            }
        }
    }
}