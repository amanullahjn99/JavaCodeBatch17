package class24_Framework;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Cofee");
        drink.add("tea");
        drink.add("cola");
        drink.add("sprite");

        for (int i = 0; i < drink.size(); i++) {
            if (drink.contains("a") || drink.contains("e")) {
                drink.set(i, "Water");
            }
                System.out.println(drink);
            }
        }

}
