package class12_Methods;

public class E4StringVsStringBuilder {
    public static void main(String[] args) {
        String name1,name2, name3, name4;
        name1="United States of America";
        name2="United States of America";
        name3="United States of America";
        name4="United States of America";

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
        System.out.println(sb);
        System.out.println(sf);

    }
}
