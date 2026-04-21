import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetSearch {
	Scanner myScanner = new Scanner(new File("bible.txt"));
	
	//check on this type
	HashMap<String> words = new HashMap<>();
	
	while(myScanner.hasNext()) {
		words.add(myScanner.next());
	}
	
	
	Iterator<String> itr = words.keySet().iterator();
	
	while(its.hasNext()) {
		String word = itr.next();
		if(word.endsWith("s")||word.equals(word.toUpperCase()) {
			itr.remove();
		}
	}
}
