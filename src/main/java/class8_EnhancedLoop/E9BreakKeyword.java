package class8_EnhancedLoop;

import java.util.Scanner;

public class E9BreakKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        while (true) {
            System.out.println("Plseas enter the price of the item or -1 to terminate");
            double price = scanner.nextDouble();
            if (price == -1) {
                break;
            } else {
                total = total + price;

            }
            System.out.println("You total bill is "+total);
        }
    }
}

