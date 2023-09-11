package class9_2DArrays;

public class T42DArraysEnhencedAndLoopFor {
    public static void main(String[] args) {

        String[][] cars = {
                {"Ford", "Cadillac", "Jeep", "Tesla"},
                {"BMW", "Audi", "Mercedes", "Volkwagen"},
                {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
                {"Ferrari", "Lamborghini", "Maserati", "Fiat"}
        };
            for (String[] row : cars) {             // enhenced loop
                for (String col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        System.out.println("=====================================");//for loop
        for (int row = 0; row < cars.length; row++) {
            for (int col = 0; col < cars[row].length; col++) {
                System.out.print(cars[row][col]+" ");

            }
            System.out.println();
        }
    }
}
