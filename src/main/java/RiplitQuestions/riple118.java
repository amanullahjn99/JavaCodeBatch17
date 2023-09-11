package RiplitQuestions;

public class riple118 {
    static String spaceOut(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            result.append(' ');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input1 = "hello";
        String result1 = spaceOut(input1);
        System.out.println(result1);

        String input2 = "technology";
        String result2 = spaceOut(input2);
        System.out.println(result2);
    }
}

