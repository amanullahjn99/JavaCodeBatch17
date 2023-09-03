package class10;

public class E11StringDemo {
    public static void main(String[] args) {
        String name = "James";
        String name2 = "John";
        System.out.println(name.equals(name2));// becz both names are not equeal so we get false
        System.out.println(name.equalsIgnoreCase(name2));// it will ignore the uper and lower, but still we get false.
    }
}

