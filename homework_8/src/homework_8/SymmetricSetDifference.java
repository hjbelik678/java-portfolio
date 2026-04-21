package homework_8;

import java.util.HashSet;
import java.util.Set;

public class SymmetricSetDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 7, 10, 12);
        Set<Integer> set2 = Set.of(3, 4, 5, 6, 8, 12, 7);
        Set<Integer> result = symmetricSetDifference(set1, set2);
        System.out.println("Symmetric Set Difference: " + result);
    }

    public static <T> Set<T> symmetricSetDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDifference = new HashSet<>();

        for (T element : set1) {
            if (!set2.contains(element)) {
                symmetricDifference.add(element);
            }
        }

        for (T element : set2) {
            if (!set1.contains(element)) {
                symmetricDifference.add(element);
            }
        }

        return symmetricDifference;
    }
}
