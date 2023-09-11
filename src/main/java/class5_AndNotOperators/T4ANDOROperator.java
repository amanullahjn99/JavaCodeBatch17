package class5_AndNotOperators;

import java.util.Scanner;
/*Ask user to enter a number and then define if number is small, medium or large
1- Small number is value between 1  and 10
2-medium number is value between 11 and 100
3-large value number is value between 101 and 1000
 */
public class T4ANDOROperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a number");
        int number=scanner.nextInt();
        if(number>=1 && number<=10) {
            System.out.println("Number is small");
        } else if (number>=11 && number<=100) {
            System.out.println("Medium");
        }else if (number>=101 && number<=1000){
            System.out.println("Large");
        }else {
            System.out.println("Invalid Value");
        }


    }
    }