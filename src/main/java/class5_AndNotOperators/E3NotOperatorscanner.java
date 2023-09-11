package class5_AndNotOperators;

import java.util.Scanner;

public class E3NotOperatorscanner {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the country");
      String country=input.nextLine();

      if(!country.equals("Iran")){
        System.out.println("Wellcome, you are allowed");

    }else {
          System.out.println("Not allowed");
      }
}}
