import java.io.FileNotFoundException;
import java.util.Scanner;

//recursive coding practice
// cleaner solution on the slides
public class ReverseLines {
	String myFile = "poem.txt";
	Scanner josh = new Scanner(myFile);
	
	public static void reversedLines(Scanner josh) throws FileNotFoundException {
		if(!josh.hasNextLine()) {
			return;
		}else {
			String Line = josh.nextLine();
			reversedLines(josh);
			System.out.println(Line);
		}
	}
}
