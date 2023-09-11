package class7_Loops;

public class E4NestedLoops {
    public static void main(String[] args) {
        int y=1;
        while(y<=3){
            int x=1;
            while (x<=20){
                System.out.print("=");
                x++;
            }
            System.out.println();;
            y++;
        }
    }
}