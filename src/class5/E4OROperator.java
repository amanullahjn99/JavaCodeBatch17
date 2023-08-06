package class5;

public class E4OROperator {
    public static void main(String[] args) {
        //if one condition is true, all of them will get true
        boolean cond1=true;
        boolean cond2=false;
        boolean cond3=false;
        boolean result=cond1 ||cond2 || cond3;
        System.out.println(result);
    }
}
