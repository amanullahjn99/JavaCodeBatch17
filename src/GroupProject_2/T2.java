package GroupProject_2;
/*Reverse a String: Write a function to reverse a given string. For
 example, given the input "Hello", the output should be "olleH". */
public class T2 {
    public static void main(String[] args) {
        String word = "Hello";

        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
    }
}
