package class16;

public class PersonTester {

    public static void main(String[] args) {
        Person p1=new Person("Aman", 30,160,'M');
        p1.printInfo();

        Person p2=new Person("Ahmad",22, 120,'M',25000,"Black");
       p2.printInfo();

        Person p3=new Person();
        p3.printInfo();



    }

}
