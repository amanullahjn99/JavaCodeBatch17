package class3;

import java.util.Scanner;

public class ripExam {
    /*   Write a program that asks the user's age: "Enter your age  "
Then display it by adding 10 (i.e age + 10) in your final output.  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        String gender = scanner.next();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        if (age > 25) {
            if (gender.equalsIgnoreCase("F")) {

                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }
        }
        if (age < 25) {
            if (gender.equalsIgnoreCase("F")) {
                ;
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }
    }
}






