package class5;

import java.util.Scanner;

public class T2ANDOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your height in inches");//prompt user
      double heights=scanner.nextDouble();//to enter person heights in inches
        if (heights<60){
            System.out.println("You are short");
        } else if (heights>=60 && heights<=72) {
            System.out.println("You are Medium");

        }else{
            System.out.println("You are tall");
        }
        }
    }