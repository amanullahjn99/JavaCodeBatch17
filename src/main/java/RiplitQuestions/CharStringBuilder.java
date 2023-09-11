package RiplitQuestions;

public class CharStringBuilder {
    public static String mixString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new IllegalArgumentException("s1 and s2 should have equal lengths");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));
            result.append(s2.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }


}

