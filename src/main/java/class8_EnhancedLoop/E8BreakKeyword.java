package class8_EnhancedLoop;

public class E8BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("OuterLoop");
            for (int j = 0; j < 5; j++) {

                if (j == 2) {
                    break;
                }
                System.out.println("Inner Loop");
            }

        }
    }
}
