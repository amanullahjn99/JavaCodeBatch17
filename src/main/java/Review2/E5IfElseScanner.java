package Review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("Please enter your age to see the discount");
        int age=scanner.nextInt();

      //  int age=45;
        /*
        if age is greater than 60 offer 20% discont
        if age is greater than 50 offer 15 discount
        if age is greater than 40 offer 10% discount
        No discounts
         */
        if (age>60){
            System.out.println("You get 20% discount");
        } else if (age>50) {
            System.out.println("You get 15% DISCOUNT");
        } else if (age>40) {
            System.out.println("You get 10% discount");

        } else  {
            System.out.println("No discount for you Please try after 10 years");

        }
    }
}
