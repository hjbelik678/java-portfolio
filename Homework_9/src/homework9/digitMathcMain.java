//henry B
package homework9;

public class digitMathcMain {
	public static void main(String[] args) {
        int number1 = 1233343;
        int number2 = 1233334;
        int compared = compareDigits(number1, number2);
        if (compared > 0) {
            System.out.println("There are " + compared + " corresponding digits");
        } else {
            System.out.println("There are no corresponding digits");
        }
    }

    public static int compareDigits(int num1, int num2) {
        return compareDigitsReal(num1, num2, 0);
    }

    private static int compareDigitsReal(int num1, int num2, int matches) {
        // Base case
        if (num1 == 0 || num2 == 0) {
            return matches;
        }

        int digit1 = num1 % 10;
        int digit2 = num2 % 10;

        // Recursive case
        if (digit1 == digit2) {
            matches++;
        }

        int nextNum1 = num1 / 10;
        int nextNum2 = num2 / 10;

        return compareDigitsReal(nextNum1, nextNum2, matches);
    }
}

