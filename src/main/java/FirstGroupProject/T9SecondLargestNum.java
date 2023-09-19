package FirstGroupProject;

//Write a java program to find the second largest number in the array?
public class T9SecondLargestNum {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 67, 45, 23, 1, 78, 34, 9, 56};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest value: " + secondLargest);
        }
    }
}
