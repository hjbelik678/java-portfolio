//henry B
package homework_8;

import java.util.Set;

public class hasOdd {
	public static void main(String[] args) {
        Set<Integer> integerSet1 = Set.of(2, 4, 6, 8);
        System.out.println("This set contains odd number: " + Odd(integerSet1));

        Set<Integer> integerSet2 = Set.of(2, 3, 6, 8);
        System.out.println("This set contains odd number: " + Odd(integerSet2));
    }
	
	public static boolean Odd(Set<Integer> integerSet) {
        for (int num : integerSet) {
            if (num % 2 != 0) {
                return true; 
            }
        }
        return false; 
    }

}
