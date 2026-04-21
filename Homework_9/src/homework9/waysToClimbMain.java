package homework9;

import java.util.ArrayList;
import java.util.List;

public class waysToClimbMain {
	public static void main(String[] args) {
        int n = 12;
        countCombinationsHelper(n);
    }
    
	public static void countCombinationsHelper(int n) {
	    List<String> path = new ArrayList<>();
	    List<String> combinations = countCombinations(n, path);
	    int counter = 0;
	    for (String combo : combinations) {
	        System.out.println("[" + combo+ "]");
	        counter++;
	    }
	    System.out.println("There are " + counter + " different combinations");
	}
    
    public static List<String> countCombinations(int n, List<String> path) {
        List<String> result = new ArrayList<>();
        
        // Base case
        if (n == 0) {
            result.add(String.join(",", path));
            return result;
        } else if (n == 1) {
            path.add("1");
            result.add(String.join(",", path));
            return result;
        }
        
        // Recursive cases
        List<String> path1 = new ArrayList<>(path); //
        path1.add("1");
        result.addAll(countCombinations(n - 1, path1));
        
        if (n >= 2) {
            List<String> path2 = new ArrayList<>(path);
            path2.add("2");
            result.addAll(countCombinations(n - 2, path2));
        }
        
        return result;
    }
}
