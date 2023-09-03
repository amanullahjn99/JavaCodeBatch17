package class7;

/*
From an array of integer elements find the largest number.
 */
public class HW7ArraysLargerNumber {
    public static void main(String[] args) {

        int[] numbers = {34, 107, 85, 99, 23};
        int largeNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largeNumber) {
                largeNumber = numbers[i];
            }

        }
        System.out.println("THe large NUmber is " + largeNumber);

    }
}