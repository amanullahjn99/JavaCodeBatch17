package RiplitQuestions;

/*
Write a program to double the values of every element in the array and print it out.
 */
public class Riplit80DoubleTheValueOF2Darray {
    public static void main(String[] args) {

        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        //Double and print array
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] *= 2;
                System.out.print(a[row][col] + " ");
            }
            System.out.println();
        }
    }
}
