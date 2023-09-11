package class5_AndNotOperators;

public class E8ANDOperator {
    public static void main(String[] args) {

        boolean goodCredit = true;
        boolean stableJob = true;
        boolean minimAge = false;
        if (goodCredit && stableJob && minimAge) {
            System.out.println("You can have the loan");
        } else {
            System.out.println("You need to fulfill all the requirements");
        }
    }
}
