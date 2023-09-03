package RiplitQuestions;

/*
Write a program that prints the highest value in the array.
 */
public class Riplit81HighesValueInArray {
    public static void main(String[] args) {
        int[] value = {5, 4, 8};
        int highestValue = 0;
        for (int i = 0; i < value.length; i++) {

            if (value[i] > highestValue) {
                highestValue = value[i];
            }
        }
        System.out.println(highestValue);
    }
}
