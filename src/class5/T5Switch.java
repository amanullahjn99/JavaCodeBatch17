package class5;
/*ask user to enter their coutnry and capture it.
once values are captured print which language user speak.
 */

import java.util.Scanner;

public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Country");
        String country = scanner.nextLine();
        country=country.toLowerCase();

        switch (country) {
            case "usa":
                System.out.println("English");
                break;
            case "afghanistan":
                System.out.println("Pashto");
                break;
            case "pakistan":
                System.out.println("Urdu");
                break;
            case "india":
                System.out.println("Hendi");
                break;
            case "france":
                System.out.println("French");
                break;
            default:
                System.out.println("Country not supported");
        }
    }
}
