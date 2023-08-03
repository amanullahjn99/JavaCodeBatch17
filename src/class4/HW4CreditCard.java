package class4;
import java.util.Scanner;
/*Create a Java program that will ask if user has a credit card or not.
If you user does not have a credit card then offer them.
If they do have one ask what is balance on the card? If balance of the card is larger than 1000,
 tell them to pay off immediately, otherwise you can tell them that they can spend more.
  */
public class HW4CreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have credit card Y=Yes OR N=NO");
        char creditCard = scanner.next().charAt(0);
        if (creditCard == 'Y') {
            System.out.println("What is the balance on the card?");
            double creditCardBalance = scanner.nextDouble();
            if (creditCardBalance > 1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("Spend more");
            }
        } else if (creditCard == 'N') {
            System.out.println("We offer you a credit card.");
        }

    }
}

