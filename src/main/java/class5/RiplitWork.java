package class5;

import java.util.Scanner;

public class RiplitWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan?");

        char loan = scanner.next().charAt(0);
        if (loan == 'y') {
            System.out.println("What is your credit score?");
            double score = scanner.nextDouble();
            if (score < 600)
                System.out.println("The eligibility is Not eligible");
            if (score >= 600 && score <= 700)
                System.out.println("The eligibility is Maybe eligible");
            if (score >= 701 && score <= 800)
                System.out.println("The eligibility is Eligible");
            if (score > 800)
                System.out.println("The eligibility is Definitely eligible");
        } else {
            System.out.println("Unknown");
        }

    }
}

