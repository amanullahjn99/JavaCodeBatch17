package RiplitQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTestUsingScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            int[] nums = new int[4];
            System.out.println("ENter the value for arrays");

            for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
            }
            System.out.println("you have enterd this arrays");
            System.out.println(Arrays.toString(nums));
        }
    }
}

