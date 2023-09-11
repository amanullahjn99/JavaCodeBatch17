package RiplitQuestions;

public class riple117 {
    static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
             }
             return sum;
        }
        public static void main (String[]args){
            int x1 = 5;
            int result1 = sumEvenToX(x1);
            System.out.println(result1);

            int x2 = 8;
            int result2 = sumEvenToX(x2);
            System.out.println(result2);
        }
    }