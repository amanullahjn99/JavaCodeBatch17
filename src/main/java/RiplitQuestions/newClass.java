package RiplitQuestions;

public class newClass {
    public static boolean alphabetical(char c1, char c2) {
        return c1 < c2;
    }
    public static void main(String[] args) {

        System.out.println(alphabetical('a', 'b'));
        System.out.println(alphabetical('d', 'z'));
        System.out.println(alphabetical('z', 'x'));
    }
}
