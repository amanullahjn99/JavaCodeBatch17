package class10;

public class E10StringDemo {
    public static void main(String[] args) {
      String str="Today is a java class";
        System.out.println(str.contains("java"));// becz java is present in double code. so ture
        System.out.println(str.contains("Python"));// becz Phyton is not present in double code. so false
        System.out.println(str.contains("a"));// becz "a" is present in double code. so true
        System.out.println(str.contains("b"));// becz "b" is not present in double code. so false


    }
}

