package SecondGroupProject;
import java.util.Arrays;
/*Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
public class T5 {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "USA";
        String str4 = "Canada";

        System.out.println(str1 + " and " + str2 + " are anagrams: " + areAnagrams(str1, str2));
        System.out.println(str3 + " and " + str4 + " are anagrams: " + areAnagrams(str3, str4));
    }
}


