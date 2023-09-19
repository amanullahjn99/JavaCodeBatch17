package SecondGroupProject;
/*Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */
public class T3 {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println(word);

        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
    }
}