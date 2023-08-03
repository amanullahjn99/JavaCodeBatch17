package class4;
import java.util.Scanner;
/* Write a program to ask user to enter numbers of worked years and annual salary.
If user worked for more or equals to 5 years than user is eligible for the bonus,
otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
otherwise bonus=3000.  */
public class HW5NumberOfWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of Worked Years");
        Double numberOfYear=scanner.nextDouble();
        System.out.println("Please enter annual salary.");
        Double annualSalary=scanner.nextDouble();
        if(numberOfYear >= 5){
            System.out.println("You are eligible for bonus");
            if(annualSalary > 50000){
                System.out.println("Congrats! You can get 5000 bonus");
            }else {
                System.out.println("Congrats! you can get 3000 bonus");
            }
        }else {
            System.out.println("Sorry you are not eligible.");
        }

        }
}

