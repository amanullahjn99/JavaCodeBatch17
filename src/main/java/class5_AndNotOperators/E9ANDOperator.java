package class5_AndNotOperators;

public class E9ANDOperator {
    public static void main(String[] args) {
        double math = 92;
        double physics = 95;
        double chemistry = 90;
        if (math > 90 && physics > 90 && chemistry > 90) {
            System.out.println("You are doing great");
        } else {
            System.out.println("You need to work harder");
        }
    }
}
