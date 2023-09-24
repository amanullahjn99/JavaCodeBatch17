package class26_Maps;

import java.util.LinkedHashMap;

/*Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all value from a country map using for eah loop or Lambda.
 */
public class Task2 {
    public static void main(String[] args) {

        LinkedHashMap<String,String> countries= new LinkedHashMap<>();
        countries.put("USA","WashingtonDC");
        countries.put("UK","London");
        countries.put("Afghanistan","Kabul");
        countries.put("Pakistan","Islamabad");
        countries.put("India","NewDeli");

        countries.forEach((k,v)-> System.out.println(k+" "+v));  // lambda way
        System.out.println("=========================================");
        countries.forEach((k,v)-> System.out.println(v));  // lambda way

    }
}
