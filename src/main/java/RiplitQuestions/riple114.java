package RiplitQuestions;

public class riple114 {
    static int addition(int a, int b) {
        return a + b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }


    static int subtraction(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        int resultAddition = addition(10, 20);
        System.out.println("Addition " + resultAddition);

        int resultMultiplication = multiplication(3, 10);
        System.out.println("Multiplication " + resultMultiplication);

        int resultSubtraction = subtraction(30, 10);
        System.out.println("Subtraction " + resultSubtraction);
    }
}

