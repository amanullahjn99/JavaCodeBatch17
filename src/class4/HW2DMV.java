package class4;

import java.util.Scanner;
/*You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them,
otherwise you will offer them to get a learners permit. */
public class HW2DMV {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age.");
        int age=scanner.nextInt();
        if (age >= 18) {
            System.out.println("We will be issuing you deriving license");
        } else {
            System.out.println("sorry, you are not 18, so  you can only get learning permit");
        }


    }
}