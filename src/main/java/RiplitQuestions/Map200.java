package RiplitQuestions;

import java.util.HashMap;
import java.util.Map;

public class Map200 {
    public static void main(String[] args) {

        Map<String, String> mapSize = new HashMap<>();

        mapSize.put("Street", "Patrick ST");
        mapSize.put("Suite", "265");
        mapSize.put("City", "Vienna");
        mapSize.put("Zip", "22180");
        mapSize.put("Country", "United State");

        System.out.println(mapSize.size());

       // int initialSize = MapAdd.size();
       // System.out.println(initialSize);


        mapSize.clear();
        System.out.println(mapSize.size());

       // int newSize = MapAdd.size();
      //  System.out.println(newSize);
    }
}
