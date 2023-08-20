package class9;
import java.util.Arrays;
/*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops */
public class HW1_2DArraysGroceryList {
    public static void main(String[] args) {
        String[][] grocery = {
                {"Tomatoes", "Spanch", "Lemon", "okra"},
                {"Apples", "Mangos", "Banana", "Grape"},
                {"Yogurt", "Eggs", "Creams", "Milk"},
                {"Cookies", "Cakes", "Chocolate", "Candy"}
        };
        for (String[] rows : grocery) {
            for (String col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(grocery));
    }
}