package class11;
/*Create a String that will hold a sentence. Write a program to get a new String without any spaces.

 */
public class T3StringMethod {
    public static void main(String[] args) {
        String str="Hello Dear Friends, I hope all is well";
        System.out.println(str.replaceAll(" ", ""));

    }
}
