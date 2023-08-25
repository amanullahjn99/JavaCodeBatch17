package GroupTasks;
/*
Create a 2D array of integers. Develop a program which will calculate
the sum of even and odd numbers for that array.

 */
public class T4SumOfOddAndEven {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 87, 13, 97, 56, 44},
                {33, 53, 66, 85, 43, 12}
        };
        int sumEven = 0;
        int sumOdd = 0;
        for (int[] i : numbers) {

            for (int result : i) {
                if (result % 2 == 0) {
                    sumEven = sumEven + result;

                } else if (result % 2 != 0) {
                    sumOdd = sumOdd + result;
                }
            }
        }
        System.out.println("The total Even number is " + sumEven);
        System.out.println("The total Odd number is " + sumOdd);

    }

}