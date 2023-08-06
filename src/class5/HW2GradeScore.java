package class5;

import java.util.Scanner;

public class HW2GradeScore {
    /*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine
     the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your quiz score");
        double quiz=scanner.nextDouble();
        System.out.println("Enter your midTerm score");
        double midTerm=scanner.nextDouble();
        System.out.println("Enter your final term score");
        double finalTerm=scanner.nextDouble();
        double result=(quiz+midTerm+finalTerm)/3;

        if(result>=90){
            System.out.println("You got grade A");
        } else if (result>=90 && result<90) {
            System.out.println("You got grade B");

        } else if (result>=50 && result<70) {
            System.out.println("You got grade C");

        } else if (result<50) {
            System.out.println("Sorry you are fail, your grade F");

        }else{
            System.out.println("Invalid Entry");
        }


    }
}
