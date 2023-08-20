package class9;

public class T12DArraysFindEvenNumber {
    public static void main(String[] args) {
// print only even numbers from this array
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {14, 20, 32, 22}};
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {// gives us the complete 1D Array

                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();

        }
    }
}

