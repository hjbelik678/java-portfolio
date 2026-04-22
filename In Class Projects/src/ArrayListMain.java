import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ArrayListMain {

    public static void main(String[] args) throws FileNotFoundException {
        // Moved all executable code inside main
        Scanner myScanner = new Scanner(new File("file"));
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0.0;
        
        // Handle empty file case
        if (!myScanner.hasNext()) {
            System.out.println("File is empty.");
            return;
        }

        double firstNum = myScanner.nextDouble();
        double high = firstNum;
        double low = firstNum;
        
        // Add the first number found
        list.add(firstNum);
        sum += firstNum;

        while (myScanner.hasNextDouble()) {
            double num = myScanner.nextDouble();
            list.add(num);
            sum += num;
            if (num > high) high = num;
            if (num < low) low = num;
        }
        
        System.out.println(list);
        System.out.println("High: " + high + " Low: " + low);
        System.out.println("Average: " + (sum / list.size()));
        
        // Test intersect
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));
        
        System.out.println(intersect(list1, list2));
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            // Fixed missing parenthesis here
            if (list2.contains(list1.get(i))) {
                list3.add(list1.get(i));
            }
        }
        return list3; // Fixed missing return
    }

    public static void removeEven(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    
    // ... (rest of your helper methods go here)
}