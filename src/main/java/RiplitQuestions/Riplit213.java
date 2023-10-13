package RiplitQuestions;

public class Riplit213 {
    public static void temperatureCheck(int temperature) {
        if (temperature < 32) {
            throw new RuntimeException("It is freezing");
        }
    }
    public static void main(String[] args) {
        try {
            int temperature = 28;
            temperatureCheck(temperature);
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}