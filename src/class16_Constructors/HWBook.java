package class16_Constructors;
/*
Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

public class HWBook{

    private String math;
    private String name;
    private String author;
    private int rating;

    public void printIf(){
        System.out.println("The name of the book: "+name);
        System.out.println("The name of the Author: "+ author );
        System.out.println("The Rating is: "+ rating);
        System.out.println("=================================================================");
    }
    public void printIf2(){
        System.out.println("The name of the book: "+name);
        System.out.println("The name of the author: "+ author);
    }
    public HWBook(String name, String author, int rating){
        this.name=name;
        this.author =author;
        this.rating =rating;
    }
    public HWBook(String name, String author) {
        this.name = name;
        this.author = author;

    }

    public static void main(String[] args) {
        HWBook b1=new HWBook("How to become Billionaire","Martin S. Fridson",177);
        b1.printIf();

        HWBook b2=new HWBook("Studies of Mind and Brain","S.T Grossberg");
        b2.printIf2();
    }

}
