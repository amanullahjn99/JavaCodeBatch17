package class5;

import java.util.Scanner;

public class HW3CountryGrade {
    /*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
    Allow user to enter grade (A, B, or C etc...) and then provide explanation:
     A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
     At the end your program should print which grade was entered by a user with explanation. */
    public static void main(String[] args) {
        String country, language, grade, gradeExplanation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your country: ");
        country = scanner.nextLine();

        switch (country.toLowerCase()) {
            case "afghanistan":
                language = "Pashto";
                break;
            case "united states":
                language = "English";
                break;
            case "pakistan":
                language = "Urdu";
                break;
            case "iran":
                language = "Farsi";
                break;
            case "india":
                language = "Hendi";
                break;
            default:
                language = "Unknown";
        }

        System.out.println("Please enter your grade (A, B, C, D etc..: ");
        grade = scanner.next().toUpperCase();

        switch (grade) {
            case "A":
                gradeExplanation = "Excellent";
                break;
            case "B":
                gradeExplanation = "Good";
                break;
            case "C":
                gradeExplanation = "Average";
                break;
            case "D":
                gradeExplanation = "Bad";
                break;
            default:
                gradeExplanation = "Not Acceptable";
        }
        System.out.println("You speak " + language + " and your grade is " + grade + " (" + gradeExplanation + ").");

    }
}