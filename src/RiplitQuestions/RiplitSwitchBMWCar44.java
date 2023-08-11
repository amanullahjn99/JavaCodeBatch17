package RiplitQuestions;

import java.util.Scanner;

public class RiplitSwitchBMWCar44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your favorite car make: ");
        String carOrigin = scanner.nextLine();

        switch (carOrigin){
            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");

        }
    }
}

