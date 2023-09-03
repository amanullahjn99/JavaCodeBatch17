package class11;

//write code that will count how many times the letters a has appeared in the String
public class T1StringMethods {
    public static void main(String[] args) {
        String str = "Batch 17 is A great. Just kidding. Please dont take it seriously";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i)=='A') {
                count++;
            }
        }
        System.out.println(count);
    }
}

