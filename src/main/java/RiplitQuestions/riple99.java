package RiplitQuestions;

import java.util.Scanner;

public class riple99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
      //  scanner.close();
        String cleanedInput = givenString.replaceAll("\\s+", "").toLowerCase();

        // Initialize pointers for checking palindrome
        int left = 0;
        int right = cleanedInput.length() - 1;
        boolean isPalindrome = true;

        // Check if the string is a palindrome
        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print the result
        System.out.println(isPalindrome);
    }
}
