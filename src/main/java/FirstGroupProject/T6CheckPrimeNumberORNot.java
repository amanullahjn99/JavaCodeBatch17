package FirstGroupProject;

import java.util.Scanner;
public class T6CheckPrimeNumberORNot {
    /*
    Write a java program to check whether a given number is prime or not?
     */
    public static void main(String[] args) {
        //6. Write a java program to check whether a given number is prime or not?
        Scanner n=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 100");
        int num,b,c;
        num =n.nextInt();
        b=1;
        c=0;
        while(b<= num)
        {
            if((num%b)==0)
                c=c+1;
            b++;
        }
        if(c==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}
