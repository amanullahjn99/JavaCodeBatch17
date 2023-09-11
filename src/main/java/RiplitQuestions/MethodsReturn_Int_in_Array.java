package RiplitQuestions;

public class MethodsReturn_Int_in_Array {
    public static int maxValue(int arr[]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null");
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }return maxValue;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
}
