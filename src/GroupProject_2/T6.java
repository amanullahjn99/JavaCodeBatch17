package GroupProject_2;
/*Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'
 */
public class T6 {
    public static char FirstNonRepeating(String str) {
        int[] charCount = new int[256]; // from assci table

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';
    }
    public static void main(String[] args) {
        String input = "afghanistan";

        char firstNonRepeating = FirstNonRepeating(input);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character in \"" + input + "\" is: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating character found in \"" + input + "\".");
        }
    }
}