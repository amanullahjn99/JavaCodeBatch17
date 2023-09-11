package class12_Methods;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {
        takeUserInput();
        System.out.println("Please enter the details again");
        takeUserInput();


    }
        static void takeUserInput(){        // created by us a method, so next time no need to call for all these code
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your name");
            String name = scanner.nextLine();
            System.out.println("Please Enter your age");
            int age = scanner.nextInt();
            System.out.println("Your name is " + name + " and you are " + age + " years old");
        }
    }
