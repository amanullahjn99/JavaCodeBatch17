package RiplitQuestions;

/*
Write a program that will print the sum of all elements in 2D array.
 */
public class Riplit82SumOfElementIn2DAray {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int TotalSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                TotalSum = TotalSum + a[i][j];
            }
        }
        System.out.println(TotalSum);
    }
}
