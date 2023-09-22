package GroupProject_1;

/*
Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even
numbers only
 */
public class T3PrintEvenNumbers {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 87, 13, 97, 56,44},
                {33, 53, 66, 85, 43,12}
        };
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {

                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
}