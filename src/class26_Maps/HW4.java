package class26_Maps;

import java.util.ArrayList;
import java.util.List;

/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
 */
public class HW4 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(5);
        list.add(5);
        list.add(1);
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        System.out.println("The total of all Interger "+sum);
    }
}
