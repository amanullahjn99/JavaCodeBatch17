package class19_OverLoading_OverWriting;

public class T1Tester {
    public static void main(String[] args) {
        T1 t1=new T1();

        System.out.println(t1.min(10,5));
    }
    public static void main(String args) {  // we can have two main method but diff parameter
        T1 t1=new T1();

        System.out.println(t1.min(10,5));
    }
}