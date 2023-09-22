package GroupProject_1;

/*
5. Write a program to swap 2 numbers without a temporary variable?
 */
public class T5Swap2Number {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The value of num1 is " + num1 + " and the value of num2 is " + num2);
    }
}
