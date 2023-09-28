package class26_Maps;

import java.util.LinkedHashSet;
import java.util.Set;
/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection. */
public class HW3 {
    public static void main(String[] args) {
        Set<String> unique = new LinkedHashSet<>();

        unique.add("Aman");
        unique.add("Ahmad");
        unique.add("Student");
        unique.add("of");
        unique.add("of");
        unique.add("Syntax");

        StringBuilder concatenatedSTR = new StringBuilder();
        for (String str : unique) {
            concatenatedSTR.append(str);
        }
        System.out.println("Concatenated String is : " + concatenatedSTR);
    }
}
