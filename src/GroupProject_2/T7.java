package GroupProject_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
 */
public class T7 {
    public static List<String> filterAndLowercase(List<String> inputList) {
        List<String> filteredAndLowercased = inputList
                .stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        return filteredAndLowercased;
    }
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Avocado");
        inputList.add("Cherry");
        inputList.add("Kiwi");

        List<String> filteredAndLowercasedList = filterAndLowercase(inputList);

        System.out.println("Filtered and Lowercase List :");
        for (String str : filteredAndLowercasedList) {
            System.out.println(str);
        }
    }
}