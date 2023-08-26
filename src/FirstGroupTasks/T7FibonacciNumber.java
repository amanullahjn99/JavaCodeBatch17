package FirstGroupTasks;
/*
Write a Java Program to print the first 10 numbers of Fibonacci series
 */
public class T7FibonacciNumber {
    public static void main(String[] args) {
        int max = 10;
        int first = 0;
        int next = 1;
        System.out.print("Fibonacci Series of " + max + " numbers:");
        for (int i = 1; i <= max; ++i) {
            System.out.print(first + " ");

            int sum = first + next;
            first = next;
            next = sum;

        }
    }
}
