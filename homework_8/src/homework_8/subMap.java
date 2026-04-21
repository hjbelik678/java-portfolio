package homework_8;

import java.util.HashMap;
import java.util.Map;

public class subMap {
    public static boolean isEveryKeyContained(Map<String, Integer> map1, Map<String, Integer> map2) {
        for (Object key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        map1.put("Marty", 1249);
        map1.put("Lawson", 4587);
        map1.put("Euler", 4638);
        map1.put("Curie", 7816);
        
        map2.put("Lawson", 4587);
        map2.put("Curie", 7816);
        
        System.out.println("Is map2 a submap of map1? " + isEveryKeyContained(map2, map1));
    }
}