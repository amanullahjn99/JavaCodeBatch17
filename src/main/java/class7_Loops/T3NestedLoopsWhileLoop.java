package class7_Loops;

public class T3NestedLoopsWhileLoop {
    /*
    1 2  4 5 6
    1 2  4 5 6
    1 2  4 5 6
    1 2  4 5 6
     */
    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            for (int j = 1; j <7 ; j++)
            if(j!=3){
                System.out.print(j+" ");

            }
            System.out.println();

            i++;
        }

    }
    }