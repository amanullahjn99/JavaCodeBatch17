package RiplitQuestions;

interface MyInterface {
    void method1(); // Undefined method 1
    void method2(); // Undefined method 2
}

// Main class implementing MyInterface
public class Main1 implements MyInterface {
    // Implement method1
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    // Implement method2
    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        // Create an instance of the Main class
        Main1 mainObj = new Main1();

        // Execute both methods
        mainObj.method1();
        mainObj.method2();
    }
}