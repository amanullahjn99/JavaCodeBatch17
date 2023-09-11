package class9_2DArrays;

import java.util.Arrays;

public class E92DArrays {
    public static void main(String[] args) {
        String[][] names = {
                {"Hind", "Miakhil", "Khan moh", "Mamama"},
                {"JOhn", "Bob", "Adam", "Tamim"},
                {"Joke", "Laugh", "JOhn Ahmad", "Aman"},
                {"Gui", "Bacend", "Noor", "MOhammad"}
        };

        for (String[] row : names) {
            for (String v : row) {
                System.out.print(v + " ");
            }

            System.out.println();
        }
        System.out.print(Arrays.deepToString(names)); //for printing 2Darrays

    }

}

