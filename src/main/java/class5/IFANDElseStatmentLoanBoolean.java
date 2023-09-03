package class5;

import java.util.Scanner;

public class IFANDElseStatmentLoanBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you need a loan? True  or  False");
        boolean question = input.nextBoolean();
        if(question == true) {
            System.out.println("what is your credit score?");
            int creditScore = input.nextInt();
            if(creditScore <600) {
                System.out.println("The eligibility is Not eligible");
            }
            else if(creditScore >600  &&  creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");
            }
            else if(creditScore ==600) {
                System.out.println("The eligibility is Maybe eligible");
            }
            else if(creditScore >700  &&  creditScore<=800) {
                System.out.println("The eligibility is Eligible");
            }
            else if(creditScore >800 ) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }
        else {
            System.out.println("Unknown");
        }
    }

}

