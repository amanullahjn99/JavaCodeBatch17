package RiplitQuestions;

public class Ripit83SumOfEachArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2},
                {3, 1, 2},
                {3, 5, 3},
                {0, 1, 2}
        };
        int rows;
        int col;
        int sumRow;
        rows = a.length;
        col = a[0].length;
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < col; j++) {
                sumRow = sumRow + a[i][j];
            }
            System.out.println(sumRow);
        }

    }
}