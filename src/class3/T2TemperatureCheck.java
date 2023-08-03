package class3;

public class T2TemperatureCheck {
    public static void main(String[] args) {
        double temperature = 33;
        if (temperature < 32) {
            System.out.println("Water will Freeze with temperature " + temperature);
        } else {
            System.out.println("Water will not freeze with temperature " + temperature);
        }
    }
}