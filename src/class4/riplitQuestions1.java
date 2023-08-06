package class4;

import java.util.Scanner;

public class riplitQuestions1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 distinct               numbers ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double largestNumber;

        if (num1 > num2) {
            if (num1 > num3) {
                largestNumber = num1;
            } else {
                largestNumber = num3;
            }
        } else {
            if (num2 > num3) {
                largestNumber = num2;
            } else {
                largestNumber = num3;
            }
        }

        System.out.println("The largest number is " +
                largestNumber);

        scanner.close();
    }
}

