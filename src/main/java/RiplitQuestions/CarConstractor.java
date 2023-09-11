package RiplitQuestions;

public class CarConstractor {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public CarConstractor(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public CarConstractor(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors=4;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public CarConstractor(int numberOfDoors, int topSpeed, double price) {
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public CarConstractor(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}

class Main {
    public static void main(String[] args) {

        CarConstractor obj1 = new CarConstractor("Toyota", "Prius", 4, 120, 30000.0);
        obj1.display();

        CarConstractor obj2 = new CarConstractor("Toyota", "Prius", 4, 120, 30000.0);
        obj2.display();

        CarConstractor obj3 = new CarConstractor(4,120,30000.0);
        obj3.display();

        CarConstractor obj4 = new CarConstractor("Toyota", "Prius", 90,0.0);
        obj4.display();

    }
}

