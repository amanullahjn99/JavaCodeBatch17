package Review3;

import java.util.Scanner;

public class E4SwitchStringFORLoop {
    public static void main(String[] args) {
        for(int i=0; i<=3; i++){    // use of for

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the name of the Fruit");
        String fruit = scanner.next();
        switch (fruit) {
            case "orange":
                System.out.println("It is usually Orange");
                break;
            case "banana":
                System.out.println("Yellow bananas are good");
                break;
            case "Strawberyy":
                System.out.println("I like red Strawberries");
            case "Blue Berry":
                System.out.println("Blue berries are very heart");
                break;
            default:
                System.out.println("I dont lke this fruit");
        }
    }

}}