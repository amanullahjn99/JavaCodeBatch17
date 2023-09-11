package class9_2DArrays;

/*Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.*/
public class HW3_2DArrayFindingEvenNumber {
    public static void main(String[] args) {
        int[][] numbers = {
                {12, 44, 31,13},
                {33, 8, 45, 36},
                {45, 2, 4, 77}
        };
        for (int rows = 0; rows < numbers.length; rows++) {
            for (int col = 0; col < numbers[rows].length; col++) {
                if (numbers[rows][col] % 2 == 0) {

                   System.out.print(numbers[rows][col] + " ");
                }
            }
            System.out.println();
        }

    }
}
