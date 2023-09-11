package class7_Loops;

/*Create an array of chars and store grades into it: A,B,C,D.
Then print a grade B (use 2 different ways of creating an array).
 */
public class HW1Arrays {
    public static void main(String[] args) {
        char[] grades = {'A', 'B', 'C', 'D'};
        System.out.println(grades[1]);

        char[] grades1 = new char[4];

        grades1[0] = 'A';
        grades1[1] = 'B';
        grades1[2] = 'C';
        grades1[3] = 'C';
        System.out.println(grades[1]);
    }
}

