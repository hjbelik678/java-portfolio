//Henry Belik

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class clumpMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        try {
            File file = new File("file.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                list.add(word);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        clump(list);
     // Output will vary based on the contents of file.txt
        System.out.println(list); 
    }

    public static void clump(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String pair = "(" + list.get(i) + " " + list.get(i + 1) + ")";
            list.set(i, pair);
            list.remove(i + 1);
        }
    }
}