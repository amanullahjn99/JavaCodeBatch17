package class9;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 200, 303},
                {100, 200, 303, 400}};
        int[] row=numbers[0];      // this return us a complete 1D array
        int number = numbers[0][1];      //this return us one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1]));// will print entire row index

    }
}

