package class26_Maps;

import java.util.LinkedHashMap;

/*Create a map of countries(5) with its capital that will store countries in alphabetical order.
Only rit those countries which contain more than 5 letters in their country name
and the letter 'a' in there capital names
 */
public class Task3 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("USA", "WashingtonDC");
        countries.put("UK", "London");
        countries.put("Afghanistan", "Kabul");
        countries.put("Pakistan", "Islamabad");
        countries.put("India", "NewDeli");


       countries.forEach((k,v)->{
           if(k.length()>5 && v.contains("a")){
               System.out.println(k+" "+v);
           }
       });
    }
}
