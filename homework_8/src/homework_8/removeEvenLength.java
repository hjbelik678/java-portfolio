//henry B
package homework_8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeEvenLength {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Set.of("Hello", "World", "Java", "Programming"));
        removeEvenLengthStrings(stringSet);
        System.out.println("Set after removing even-length strings: " + stringSet);
    }

    public static void removeEvenLengthStrings(Set<String> stringSet) {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
