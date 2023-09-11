package RiplitQuestions;

public class Riple119 {
    static String censorLetter(String input, char letter) {
        String result = input.replace(letter, '*');
        return result;
    }

    public static void main(String[] args) {
        String input1 = "computer science";
        char letter1 = 'e';
        String result1 = censorLetter(input1, letter1);
        System.out.println(result1);

        String input2 = "trick or treat";
        char letter2 = 't';
        String result2 = censorLetter(input2, letter2);
        System.out.println(result2);
    }
}
