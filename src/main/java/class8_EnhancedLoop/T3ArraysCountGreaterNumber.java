package class8_EnhancedLoop;

public class T3ArraysCountGreaterNumber {
    //count how many numbers are greater than 10 in below arrays
    //expected answer 3
    public static void main(String[] args) {
        int[] numbers = {10,20,4,3,8,45,96};

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>10) {
                count++;
            }
        }
        System.out.println(count);

    }
}

