//henry B
package homework_8;

import java.util.Set;

public class maxLength {
	public static void main(String[] args) {
	    Set<String> stringSet = Set.of("Object", "oriented", "Programming", "Spring","2024");
	    System.out.println("Length of longest string: " + findLength(stringSet));
	}
	
    public static int findLength(Set<String> stringSet) {
        int maxLength = 0;
        for (String str : stringSet) {
            int currentLength = str.length();
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        return maxLength;
    }
}
