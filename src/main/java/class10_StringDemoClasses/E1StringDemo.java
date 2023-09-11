package class10_StringDemoClasses;

public class E1StringDemo {
    public static void main(String[] args) {
        //We have created an object from the String class and have stored Cat inside it.

        String obj=new String("Cat");
        // shortcut to creat onjs from String class
        String obj2="My Dog"; //String obj2=new String("Dog")

        int len=obj.length();
        System.out.println(len);
        int len2=obj2.length();   // calling the length method/function/action/ behaviour
        System.out.println(len2);
    }
}
