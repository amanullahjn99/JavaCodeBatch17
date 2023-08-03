package class4;

public class E3NestedIfElse {
    public static void main(String[] args) {
        double accountBalance = 500001;
        if (accountBalance > 28000) {
            System.out.println("We can afford a normal toyota");
            if (accountBalance > 50000) {
                System.out.println("we can afford luxury cars as well");
            }
        } else {
            System.out.println("We need to save more money");
        }
    }
}
