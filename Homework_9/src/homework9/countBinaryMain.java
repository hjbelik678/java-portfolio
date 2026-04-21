//henry B
package homework9;

public class countBinaryMain {
	public static void main(String[] args) {
        int n = 2; 
        printBinaryCombinations(n);
    }
	
	public static void printBinaryCombinations(int n) {
        printBinaryCombinationsHelper("", n);
    }

    private static void printBinaryCombinationsHelper(String prefix, int remainingDigits) {
        if (remainingDigits == 0) {
            System.out.println(prefix);
        } else {
            printBinaryCombinationsHelper(prefix + "0", remainingDigits - 1);
            printBinaryCombinationsHelper(prefix + "1", remainingDigits - 1);
        }
    }
}
