package RiplitQuestions;

public class A {
        public final void methodWithParameter(boolean value) {
            System.out.println("Final method with boolean parameter");
        }

        public final void methodWithParameter(String value) {
            System.out.println("Final method with String parameter");
        }

        public static void main(String[] args) {
            A example = new A();

            example.methodWithParameter(true);
            example.methodWithParameter("Hello, Overloading!");
        }
    }