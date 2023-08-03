package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner sccaner=new Scanner(System.in);
        System.out.println("Please enter your full name ");
        String name=sccaner.nextLine(); // Line mean if you want multiline or complete name first and last name
        System.out.println("Your full name is"+name);
    }
}

