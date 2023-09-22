package GroupProject_2;
/*Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
which should be returning a price of the car. Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice() method in which returned price is
calculated as following: if weight>2000 then returned price car should include 10% discount,otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount */
public class T11_Car {
    private double carPrice;
    private String color;

    public T11_Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}
class Sedan extends T11_Car {
    private double length;
    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }
    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.95;
        } else {
            return super.calculateSalePrice() * 0.90;
        }
    }
}
class Truck extends T11_Car {
    private double weight;
    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }
    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.90;
        } else {
            return super.calculateSalePrice() * 0.80;
        }
    }
}
class Main {
    public static void main(String[] args) {
        T11_Car car1 = new T11_Car(20000, "Red");
        Sedan sedan1 = new Sedan(25000, "Blue", 22);
        Truck truck1 = new Truck(30000, "Green", 2200);
        Sedan sedan2 = new Sedan(18000, "Yellow", 18);

        System.out.println("Car1 Sale Price: $" + car1.calculateSalePrice());
        System.out.println("Sedan1 Sale Price: $" + sedan1.calculateSalePrice());
        System.out.println("Truck1 Sale Price: $" + truck1.calculateSalePrice());
        System.out.println("Sedan2 Sale Price: $" + sedan2.calculateSalePrice());
    }
}