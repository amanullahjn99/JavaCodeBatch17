package Review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str = "This is a Java Class";
        boolean start = str.startsWith("T");
        int num='a';

        System.out.println(start);
        System.out.println(str.endsWith("Class"));
        System.out.println(str.contains("java"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf(97));

       char c= str.charAt(8);
        System.out.println(c);

    }
}
