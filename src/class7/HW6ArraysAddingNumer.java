package class7;

/*Create an array on integers and calculate the sum of all elements in an array
 */
public class HW6ArraysAddingNumer {
    public static void main(String[] args) {

        int[] numbers = {34, 107, 85, 99, 23};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        System.out.println(sum);

    }
}