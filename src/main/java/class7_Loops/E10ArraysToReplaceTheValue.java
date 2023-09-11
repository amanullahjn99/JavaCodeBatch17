package class7_Loops;

public class E10ArraysToReplaceTheValue {
    // creting the array and intailizing the arrays
    public static void main(String[] args) {

        String[] fruit = {"Apple", "Orange", "banana", "Kiwi", "Pineapple"};
        fruit[3]="Mango";           // to update the value of array instead of Kiwi Mango wil replace

        for (int i = 0; i < fruit.length; i++) {
            System.out.println(fruit[i]);

        }

    }

}
