package class11_StringDemoClasses;

public class E8StringMethods {
    public static void main(String[] args) {
        String str="Hi There how are you. I am Good. I am Driving";
       String[] strs= str.split("[.]");
        System.out.println(strs.length);
        System.out.println(strs[0]);
        System.out.println(strs[2]);
        System.out.println(strs[2].trim()); // "Trim" is used to remove the space

    }
}
