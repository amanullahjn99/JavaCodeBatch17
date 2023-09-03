package class8;

public class T1ArraysReverce {
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D', 'E', '#', '@'};

        for (int i = chars.length-1; i>=0; i--) {
            System.out.println(chars[i]);

        }
    }
}
