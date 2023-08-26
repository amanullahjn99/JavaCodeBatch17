package class11;

/*Create a String and if the String is not empty perform the following:
1-)if the String has an odd number of characters and has 3 or more charachter,
print the character in the middle of the string.
2-)for exapmple String str=hello=>l
 */
public class T2StringMethodsMeddileLetter {
    public static void main(String[] args) {
        String str = "Hello";

        if (str.length() % 2 != 0 && str.length() >= 3) {  // finding the middle index
            int middle = str.length() / 2;
            System.out.println(str.charAt(middle));
        }

    }

}

