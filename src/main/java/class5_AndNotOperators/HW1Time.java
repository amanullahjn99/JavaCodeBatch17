package class5_AndNotOperators;

import java.util.Scanner;

public class HW1Time {
    /*Write a program that will ask user to input inputs the current time (use 24 hour format).
Based on the given time define:
if hour is between 1-11 --> Morning
if hour between 12-15 --> Afternoon
if hour between 16-20 --> Evening
if hour between 21-24 --> Night    */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  current time");
        int currentTime=scanner.nextInt();

        if (currentTime>=1 && currentTime <= 11){
            System.out.println("Its Morning");

        } else if (currentTime>=12 && currentTime<=15) {
            System.out.println("Its Afternoon");

        }else if(currentTime>=16 && currentTime<=20){
            System.out.println("Its Evening");
        } else if (currentTime>=21 && currentTime<=24) {
            System.out.println("Its night");

        }else {
            System.out.println("Invalid time entered");
        }
    }
}
