package class10;

public class E9StringDemo {
    public static void main(String[] args) {
      String str="Today is a java class";
        System.out.println(str.startsWith("T"));
        System.out.println(str.startsWith("Today")); // when we want to see the first word start then make true
        System.out.println(str.startsWith("  Today")); // get false becz we give space then make false
        System.out.println(str.endsWith("class")); // get TRUE becz the last word is correct then make true



    }
}

