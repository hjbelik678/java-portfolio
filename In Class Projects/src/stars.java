
public class stars {
	
	public static void main(String[] args) {
		printStars(8);
	}
	
	// Prints a line containing the given number of stars.
	// Precondition: n >= 0
	public static void printStars(int n) {
		if(n>0) {
			printStars(n-1);
		}
	    for (int i = 0; i < n; i++) {
	        System.out.print("*");
	    }
	    System.out.println();   // end the line of output
	}

}
