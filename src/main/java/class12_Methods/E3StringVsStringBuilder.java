package class12_Methods;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {
        String name="Babar";
        name.toLowerCase();
        System.out.println(name);


        StringBuilder sb=new StringBuilder("Sunday");
        sb.reverse();
        System.out.println(sb);
    }
}
