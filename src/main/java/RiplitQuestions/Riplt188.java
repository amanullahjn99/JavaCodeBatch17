package RiplitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Riplt188 {
    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> list = new ArrayList<>();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 5 integer values
        System.out.println("Enter 5 integer values:");

        for (int i = 0; i < 5; i++) {
            int input = scanner.nextInt();
            list.add(input);
        }

        // Close the Scanner when you're done with it
        scanner.close();

        // Print all the elements in the ArrayList on a single line
        for (Integer value : list) {
            System.out.print(value + " ");
        }
    }
}