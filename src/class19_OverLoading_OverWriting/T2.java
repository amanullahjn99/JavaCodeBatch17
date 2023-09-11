package class19_OverLoading_OverWriting;
/*Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class T2 {

    public static void print(){
        System.out.println("Java is great");
    }
    public static void print(String word) {

        System.out.println("Java is "+word);
    }
    public static void main(String[] args) {
        T2.print();
        T2.print("Amazing");
    }
}
