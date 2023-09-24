package class26_Maps;

import java.util.HashMap;
import java.util.Map;

/*Create a map of Best Buy store. Place item id and item name into it.
Example(7664847=Printer, 7879885= TV etc)
Retrieve all keys and values from a Best buy map using EntrySet.
 */
public class Task4 {
    public static void main(String[] args) {
        // Create a map to store Best Buy store items (item ID => item name)
    Map<Integer, String> bestBuyMap = new HashMap<>();

    // Add items to the map
        bestBuyMap.put(7664847, "Printer");
        bestBuyMap.put(7879885, "TV");
        bestBuyMap.put(1234567, "Laptop");
        bestBuyMap.put(9876543, "Headphones");
        bestBuyMap.put(5555555, "Smartphone");

    // Retrieve and print all keys and values using EntrySet
        for (Map.Entry<Integer, String> entry : bestBuyMap.entrySet()) {
        int itemId = entry.getKey();
        String itemName = entry.getValue();
        System.out.println("Item ID: " + itemId + ", Item Name: " + itemName);
    }
}
}
