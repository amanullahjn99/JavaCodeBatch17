package Review3;

public class E2ORLogicalOperators {
    public static void main(String[] args) {
        boolean isMeat = true;
        boolean isEgg = false;
        boolean isFish = false;
        boolean milk = true;
        boolean Vegetables = true;

        boolean isProtein = isEgg || isFish || isMeat;
        boolean isGoodDiet = (isEgg || isMeat || isFish) && milk && Vegetables;
        System.out.println(isProtein);
        System.out.println(isGoodDiet);
    }
}
