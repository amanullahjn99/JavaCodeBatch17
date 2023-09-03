package class4;

import java.util.Scanner;

/*Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ” */
public class HW3Temperature {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter city name.");
        String city=scanner.next();
        System.out.println("Please enter the temperature in Fahrenheit");
        double temperature=scanner.nextDouble();
        double fahrenheit=(temperature-32)*5.0/9.0;
        System.out.println("The temperature in the city of "+city+ " is "+fahrenheit);

    }
}