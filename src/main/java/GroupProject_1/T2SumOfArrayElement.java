package GroupProject_1;

/*
Create an array of integer values. After the array is created, calculate
the sum of all stored elements in that array.
 */
public class T2SumOfArrayElement {
    public static void main(String[] args) {
        int[] numbers = {100, 87, 97, 56, 98, 88};
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println("The Sum of total index value is "+result);
    }
}