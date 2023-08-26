package class11;

/*create a String a print it in reverse oder(Sunday---> yadnus)
 */
public class T2StringMethodsReverseOrder {
    public static void main(String[] args) {
        String str = "Sunday";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
           // System.out.print(str.charAt(i));                  // this is also posible
        }
        System.out.println(reversed);
    }

}



