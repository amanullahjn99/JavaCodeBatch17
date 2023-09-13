package class20;

public class Computer {

    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turning on.");
    }

    public void turnOff() {
        System.out.println(brand + " " + model + " is turning off.");
    }

    public void commonMethod() {
        System.out.println("This is a common method for all computers.");
    }
}

class Apple extends Computer {
    public Apple(String model) {
        super("Apple", model);
    }

    @Override
    public void turnOn() {
        System.out.println("Starting up the Apple Macbook ");
    }

    public void useTouchID() {
        System.out.println("Using Touch ID on the Apple Macbook.");
    }
}

class Lenovo extends Computer {
    public Lenovo(String model) {
        super("Lenovo", model);
    }

    @Override
    public void commonMethod() {
        System.out.println("This is a Lenovo-specific implementation of the common method.");
    }

    public void useTrackPoint() {
        System.out.println("Using the TrackPoint on the Lenovo laptop.");
    }
}

class HP extends Computer {
    public HP(String model) {
        super("HP", model);
    }

    public void useFingerprintScanner() {
        System.out.println("Using the fingerprint scanner on the HP laptop.");
    }
}

class Dell extends Computer {
    public Dell(String model) {
        super("Dell", model);
    }

    public void useStylus() {
        System.out.println("Using the stylus on the Dell laptop.");
    }
}

