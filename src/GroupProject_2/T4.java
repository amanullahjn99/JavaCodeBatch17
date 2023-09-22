package GroupProject_2;
/*Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.
 */
public class T4 {
    public static int countWords(String input) {

        String[] words = input.split("[\\s\\p{Punct}]+");

        return words.length;
    }
    public static void main(String[] args) {
        String text = "Hello, world: This is Java Class";

        System.out.println("Total numbr of the world is: "+countWords(text));
    }
}