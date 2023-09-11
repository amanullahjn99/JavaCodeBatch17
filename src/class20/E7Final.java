package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE=10;
       // AGE=20;         we cant change the value bcz we final it. and good to be capital.
        System.out.println(AGE);
    }
}
final class Parent{

    final String color="Red";
    final void marry(){
        System.out.println("take our permission first");
    }

}
/*class Child extends Parent{
 *//*  @Override
    void marry(){
        System.out.println("I want to marry someone else");
    }*//*
}*/
