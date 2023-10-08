package RiplitQuestions;

import java.util.HashMap;
import java.util.Map;

public class Riple209 {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        // Call the removeValues method to remove values greater than 15
        Map<String, Integer> filteredMap = removeValues(map);

        // Display the original map
        System.out.println("Original Map: " + map);

        // Display the filtered map
        System.out.println("Filtered Map (values greater than 15 removed): " + filteredMap);
    }

    public static Map<String, Integer> removeValues(Map<String, Integer> inputMap) {
        // Create a new map to store the filtered entries
        Map<String, Integer> filteredMap = new HashMap<>();

        // Iterate through the input map and add entries with values less than or equal to 15
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() <= 15) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }

        return filteredMap;
    }
}