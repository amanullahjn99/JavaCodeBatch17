package class9;

/*CCreate a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers..*/
public class HW2_2DArraySumOfTotalIndexOFInt {
    public static void main(String[] args) {
        int[][] numbers = {
                {12, 44, 31, 13},
                {33, 8, 45, 36},
                {45, 2, 4, 77}
        };
        int sum = 0;
        for (int rows = 0; rows < numbers.length; rows++) {
            for (int col = 0; col < numbers[rows].length; col++) {
                sum = sum + numbers[rows][col];
            }
        }
        System.out.print(sum);
    }
}


