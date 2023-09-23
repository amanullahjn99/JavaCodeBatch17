package class25_CollectionFramWork;

import java.util.LinkedList;

public class E4ArrayListVsLinkedList {
    public static void main(String[] args) {
      /*  ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(0,10);
        numbers.add(0,20);
        // numbers.add(0,10);
        System.out.println(numbers);
       */
        long startingTime = System.currentTimeMillis();

        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0, i);
        }

        long endTime = System.currentTimeMillis();
        long timeTook = (endTime - startingTime);
        System.out.println(timeTook);


    }
}
