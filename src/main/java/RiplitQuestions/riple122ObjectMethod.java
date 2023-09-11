package RiplitQuestions;

public class riple122ObjectMethod {
    private String countryName;
    private String capital;
    private int populationSize;

    public void printIf1() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);
    }

    public void printIf2() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);


    }

    public static void main(String[] args) {

        riple122ObjectMethod value1 = new riple122ObjectMethod();
        value1.countryName = "USA";
        value1.capital = "Washington DC";
        value1.populationSize = 330000000;
        value1.printIf1();

        riple122ObjectMethod value2 = new riple122ObjectMethod();
        value2.countryName = "Kaszakhstan";
        value2.capital = "Astana";
        value2.populationSize = 18500000;
        value2.printIf2();

    }
}

