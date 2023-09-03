package RiplitQuestions;

import java.util.Scanner;

public class Riple104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println();
            names[i] = scanner.nextLine();
        }

        for (String name : names) {
            if (name.length() >= 3) {
                System.out.println("**" + name.substring(0, 3) + "**");
            } else {
                System.out.println("Name is too short.");
            }
        }

        scanner.close();
    }
}
