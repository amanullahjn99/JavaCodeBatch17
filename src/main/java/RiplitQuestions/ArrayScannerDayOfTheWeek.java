package RiplitQuestions;

import java.util.Scanner;

public class ArrayScannerDayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            daysOfWeek[i] = scanner.nextLine();
        }

        for (String day : daysOfWeek) {
            System.out.println(day);
        }

    }
}