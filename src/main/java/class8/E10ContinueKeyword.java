package class8;

public class E10ContinueKeyword {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Batch17 is greatest of all time");
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("I just kidding");
        }

    }
}
