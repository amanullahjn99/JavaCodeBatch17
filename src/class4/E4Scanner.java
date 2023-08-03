package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the scanner class so that we can reuse the logic from
        //this class which is already written for us by java developers.
        Scanner scanner=new Scanner(System.in);
        //taking an input from the user and storing in int a name varible
        String name = scanner.next();
        if (name.equals("Aman")){
            System.out.println("Java Student");
        }else {
            System.out.println("I dont know you");
        }
        //System.out.println("Hello "+name);

    }
}
