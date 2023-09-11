package class7_Loops;

/*
#####
## ##
#####
#####
 */
public class T5NestedLoopsPrintingPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {               // it controll the number of line
            for (int j = 1; j <= 6; j++) {
                if (i == 2 && j == 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");

                }
            }
            System.out.println();
        }
    }
}
