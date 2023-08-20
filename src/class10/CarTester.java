package class10;

public class CarTester {
    public static void main(String[] args) {
        Car Toyota = new Car();
        Toyota.make = "Toyota";
        Toyota.Model = 2023;
        Toyota.Price = 40000;
        System.out.println(Toyota.make);
        System.out.println(Toyota.Model);
        System.out.println(Toyota.Price);
        Toyota.moveForward();
        Toyota.applyBrakes();
        System.out.println("=========================================");
        Car bmw = new Car();
        bmw.make = "BMW";
        bmw.Model = 2023;
        bmw.Price = 80000;
        System.out.println(bmw.make);
        System.out.println(bmw.Model);
        System.out.println(bmw.Price);
        bmw.moveForward();
        bmw.applyBrakes();

    }
}
