package RiplitQuestions;

import java.util.Scanner;
public class riplitForLoopNumerScaner {
    /*int x;
Write a for loop that will print out a series of numbers starting at 0 and ending at
 the x(value must be taken from a user), exclusive.
**Example Output:**
In: 8
0 1 2 3 4 5 6 7
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for x");
        int x=scanner.nextInt();
        for (int num = 0; num < x ; num++) {
            System.out.print(+num+" ");

        }

    }
}
