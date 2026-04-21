package homework_8;
//repeated value should show two values on the reversed
import java.util.HashMap;
import java.util.Map;

public class Reverse {
    public static Map<String, String> reverse(Map<String, String> originalMap) {
        Map<String, String> reversedMap = new HashMap<>();
        
        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        
        return reversedMap;
    }
    
    public static void main(String[] args) {
        Map<String, String> originalMap = new HashMap<>();
        originalMap.put("Marty", "206-9024");
        originalMap.put("Smith", "206-9024");
        originalMap.put("Newton", "555-1234");
        originalMap.put("Euler", "879-7524");
        
        Map<String, String> reversedMap = reverse(originalMap);
        
        //print original map
        for (Map.Entry<String, String> entry : originalMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        //Print the reversed map
        System.out.println("Reversed Map:");
        for (Map.Entry<String, String> entry1 : reversedMap.entrySet()) {
            System.out.println(entry1.getKey() + " -> " + entry1.getValue());
        }
    }
}
