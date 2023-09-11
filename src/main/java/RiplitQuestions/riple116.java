package RiplitQuestions;

public class riple116 {
    static boolean numbers(int num1, int num2) {
        return (num1 % 2 == 0) && (num2 % 2 == 0);
    }

    public static void main(String[] args) {
        int num1 = -1;
        int num2 = 1;
        boolean result = numbers(num1, num2);
        System.out.println(result);
    }
}
