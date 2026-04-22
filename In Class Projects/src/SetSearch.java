import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetSearch {
    public static void main(String[] args) throws FileNotFoundException {
        // Use a TreeSet to keep the words sorted
        TreeSet<String> words = new TreeSet<>();
        
        // Pass the file object to the Scanner
        Scanner myScanner = new Scanner(new File("bible.txt"));
        
        // Populate the set
        while (myScanner.hasNext()) {
            words.add(myScanner.next());
        }
        myScanner.close(); // Good practice to close the scanner
        
        // Use an iterator to remove items safely
        Iterator<String> itr = words.iterator();
        
        while (itr.hasNext()) {
            String word = itr.next();
            // Fixed: Added closing parenthesis
            if (word.endsWith("s") || word.equals(word.toUpperCase())) {
                itr.remove();
            }
        }
        
        System.out.println(words);
    }
}