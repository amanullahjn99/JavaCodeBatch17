package class5_AndNotOperators;
/*
Write a program that will print whether it is a weekend or weekday.
if any day from 1-5 -->output" its is a weekday", anyday from 6-7 -->output"It is a weekend",
any other day -->output "Invailid day"
 */
public class T3ANDOROperator {
    public static void main(String[] args) {
       int day=5;
       if(day>=1 && day<=5){
           System.out.println("It is a weekday");
       }else if(day==6 || day==7){
           System.out.println("It is a weekend");
       }

        }
    }