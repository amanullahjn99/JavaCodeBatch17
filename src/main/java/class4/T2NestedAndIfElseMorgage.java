package class4;

/*Create a Java program and store values of mortgage rate and mortgage price.
First, program should check if rate is higher than 4.5 user will not buy a house,
otherwise user will consider buying. Once user decides to buy a house, if price of the
 house is larger than 50000 than user will take a loan, otherwise user will pay cash.
 */
public class T2NestedAndIfElseMorgage {
    public static void main(String[] args) {
        double morgageRate = 6.5;
        double morgagePrice = 50000;
        if (morgageRate > 4.5) {
            System.out.println("User will not buy a house");
        } else {
            System.out.println("User will consider buying a house");
            if (morgagePrice > 50000) {

                System.out.println("User take a loan");
            } else {
                System.out.println("User will pay the cash");
            }
        }
    }
}

