package class4;

import java.util.Scanner;

/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
 */
public class HW1BankLoan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please write the amount you want to loan?");
        double loanAmount=scanner.nextDouble();
        if (loanAmount <= 200000) {
            System.out.println("You are eligible for loan");
        } else {
            System.out.println("Sorry! The loan is not approved");
        }


    }
}