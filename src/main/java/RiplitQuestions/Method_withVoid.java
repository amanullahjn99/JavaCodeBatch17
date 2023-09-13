package RiplitQuestions;

public class Method_withVoid {
    private static void privateMethod() {

        System.out.println("This is Private Method");
    }

    static void defualtMethod () {

        System.out.println("This is Default Method");
    }
    protected static void protectedMethod(){

        System.out.println("This is Protected Method");
    }
    public static void publicMethod (){

        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Method_withVoid obj= new Method_withVoid();
        obj.privateMethod();
        obj.defualtMethod();
        obj.privateMethod();
        obj.publicMethod();
    }

}
