package class11_StringDemoClasses;

public class E10StringMethodSplit {
    public static void main(String[] args) {
        //String str = "Hi#There#how#are#you";
        String str = "Hi There how are you";
        String [] strArr=str.split(" ");
        System.out.println(strArr.length);
        System.out.println(strArr[1]);


    }
}
