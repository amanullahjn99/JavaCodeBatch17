package RiplitQuestions;

public class Methods_Returns {
    private String privateMethod() {
    return "private";
}

    String defaultMethod() {
        return "default";
    }

    protected String protectedMethod() {
        return "protected";
    }

    public String publicMethod() {
        return "public";
    }

    public static void main(String[] args) {
        Methods_Returns another = new Methods_Returns();

        // Accessing and printing the return values of each method
       //System.out.println(another.privateMethod);
        System.out.println(another.defaultMethod());
        System.out.println(another.protectedMethod());
        System.out.println(another.publicMethod());
    }
}