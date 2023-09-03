package class7;

public class T1NestedLoopsForAndWhile {
    /*
    1 2 3 4 5 6
    1 2 3 4 5 6
    1 2 3 4 5 6
    1 2 3 4 5 6
     */
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) {
            for (int j = 1; j <7 ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
        int y=1;
        while(y<=4){
            int x=1;
            while (x<=6){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();;
            y++;
        }
    }
}