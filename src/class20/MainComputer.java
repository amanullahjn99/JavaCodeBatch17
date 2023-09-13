package class20;

public class MainComputer {
    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Apple("Macbook Pro");
        computers[1] = new Lenovo("ThinkPad X1 Carbon");
        computers[2] = new HP("Pavilion");
        computers[3] = new Dell("XPS");

        for (Computer computer : computers) {
            computer.turnOn();
            computer.commonMethod();

            if (computer instanceof Apple) {
                ((Apple) computer).useTouchID();
            } else if (computer instanceof Lenovo) {
                ((Lenovo) computer).useTrackPoint();
            } else if (computer instanceof HP) {
                ((HP) computer).useFingerprintScanner();
            } else if (computer instanceof Dell) {
                ((Dell) computer).useStylus();
            }

            computer.turnOff();
            System.out.println();
        }
    }
}
