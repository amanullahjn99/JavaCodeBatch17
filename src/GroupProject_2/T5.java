package GroupProject_2;
import java.util.Arrays;
/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
public class T5 {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean isAnaGram = Arrays.equals(c1, c2);
        System.out.println(isAnaGram);
    }
}


