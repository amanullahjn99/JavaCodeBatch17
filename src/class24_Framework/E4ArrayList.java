package class24_Framework;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(25);
        number.add(100);
        number.add(5);
        System.out.println(number);
        int sum = 0;
        for (Integer n : number) {
            if (n > 20) {  // if we want to add those number which are greater than 20
                sum += n;  //sum+sum+n
            }
        }
        System.out.println(sum);
    }
}
