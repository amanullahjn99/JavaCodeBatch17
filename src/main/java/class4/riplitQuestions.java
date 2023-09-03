package class4;

import java.util.Scanner;

public class riplitQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        System.out.print("Please enter three distinct numbers");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        num3 = scanner.nextDouble();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(+num1);
            } else {
                System.out.println(+ num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println(+ num2);
            } else {
                System.out.println(+ num3);
            }
        }
    }
}

