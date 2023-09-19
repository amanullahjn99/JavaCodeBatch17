package review9;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        // int s=  c.add(10,20);
        int result=c.add(10,20,30);
        System.out.println(c.add(10,20,30,40,50));
    }
}