package class5_AndNotOperators;

import java.util.Scanner;

public class T1OROperator {
    /*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month you born ");
        String BirthMonth = scanner.nextLine();
        if (BirthMonth.equalsIgnoreCase("March") || BirthMonth.equalsIgnoreCase("April")
                || BirthMonth.equalsIgnoreCase("May")) {
            System.out.println("You were born is season Spring");
        } else if (BirthMonth.equalsIgnoreCase("June") || BirthMonth.equalsIgnoreCase("July")
                || BirthMonth.equalsIgnoreCase("August")) {
            System.out.println("You were born is season Summer");
        } else if (BirthMonth.equalsIgnoreCase("September") ||
                BirthMonth.equalsIgnoreCase("October") ||
                BirthMonth.equalsIgnoreCase("November")) {
            System.out.println("You were born is season Fall");
        } else if (BirthMonth.equalsIgnoreCase("December") ||
                BirthMonth.equalsIgnoreCase("January") ||
                BirthMonth.equalsIgnoreCase("Febuary")) {
            System.out.println("You were born is season Winter");
        } else {
            System.out.println("Invalid Month");
        }

    }


}
