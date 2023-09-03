package RiplitQuestions;

import java.util.Scanner;

public class Riplit97 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the browser name");

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Chrome")) {
            System.out.println("Proceed with Chrome browser");

        } else if (input.equalsIgnoreCase("firefox")) {
            System.out.println("Proceed with fireFox browser");
        } else if (input.equalsIgnoreCase("IE")) {
            System.out.println("Proceed with iE browser");
        } else {
            System.out.println("Invalid browser");
        }
    }
}

