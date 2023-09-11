package class7_Loops;

public class T6ArraysOddNUmber {
    /* just to print the even number from below arrays (20, 48, 60)

     */
    public static void main(String[] args) {

        int[] numbers = {20, 24, 48, 69, 60};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                System.out.print(numbers[i] + " ");
        }


    }

}


