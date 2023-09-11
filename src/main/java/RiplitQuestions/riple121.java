package RiplitQuestions;

public class riple121 {

    private int value1;
    private double doubleValue;
    private char ch;

    public static void main(String[] args) {
        riple121 instance1 = new riple121();
        instance1.value1 = 10;
        instance1.doubleValue = 10.23;
        instance1.ch = 'a';

        System.out.println(instance1.value1);
        System.out.println(instance1.doubleValue);
        System.out.println(instance1.ch);

        riple121 instance2 = new riple121();
        instance2.value1 = 100;
        instance2.doubleValue = 100.23;
        instance2.ch = 's';

        System.out.println(instance2.value1);
        System.out.println(instance2.doubleValue);
        System.out.println(instance2.ch);
    }


}
