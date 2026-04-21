//henry B
package homework_8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OneToOneChecker {
    public static boolean is1to1(Map<String, String> map) {
        Set<String> valuesSet = new HashSet<>();
        
        for (String value : map.values()) {
            if (valuesSet.contains(value)) {
                return false;
            }
            
            valuesSet.add(value);
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Map<String, String> exampleMap = new HashMap<>();
        exampleMap.put("Marty", "206-9024");
        exampleMap.put("Smith", "949-0504");
        exampleMap.put("Hawking", "123-4567");
        exampleMap.put("Newton", "555-1234");
        
        System.out.println(is1to1(exampleMap));
        
        exampleMap.put("Euler", "123-4567");
        System.out.println(is1to1(exampleMap));
    }
}
