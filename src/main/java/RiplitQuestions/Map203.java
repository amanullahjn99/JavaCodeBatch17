package RiplitQuestions;

import java.util.HashMap;
import java.util.Map;

/*Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
 map.put("mango", 40);
retrieve all keys and values in the format below: using for each
**Expected Output:**
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
 */
public class Map203 {
        public static void main(String[] args) {
            // Create a HashMap
            Map<String, Integer> map = new HashMap<>();

            // Add key-value pairs to the map
            map.put("mango", 10);
            map.put("apple", 30);
            map.put("orange", 20);
            map.put("mango", 40); // This overwrites the previous "mango" value of 10
            map.put("mango", 40); // This has no effect since it's the same value

            // Retrieve and print all keys and values
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();
                System.out.println("Key = " + key + " and value = " + value);
            }
        }
    }
