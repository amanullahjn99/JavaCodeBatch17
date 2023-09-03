package class5;
import java.util.Scanner;

public class HW5calculator {
    /* Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
    Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        double number1 = scanner.nextDouble();
        System.out.println("choose and Enter the operator (+,-,*,/)");
        char operator = scanner.next().charAt(0);
        System.out.println("Please enter the second number");
        double number2 = scanner.nextDouble();
        double result;
        if (operator == '+') {
            result = number1 + number2;
            System.out.println("THe result of addition is " + result);

        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println("The result of subtraction is " + result);

        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println("The result of multiplication is " + result);

        } else if (operator == '/') {
            result = number1 / number2;
            System.out.println("The result of division is " + result);

        } else {
            System.out.println("Wrong operator enterd");
        }
    }
}