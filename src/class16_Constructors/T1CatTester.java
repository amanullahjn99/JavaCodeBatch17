package class16_Constructors;

public class T1CatTester {
    public static void main(String[] args) {


        T1Cat c1 = new T1Cat("Jack", 6, "black", "USA", "Green", 23);
        c1.printIf();

        T1Cat c2 = new T1Cat("Mio", 3, "yellow", "China");
        c2.printIf();

        T1Cat c3=new T1Cat("Nano",23);
        c3.printIf();
    }
}

