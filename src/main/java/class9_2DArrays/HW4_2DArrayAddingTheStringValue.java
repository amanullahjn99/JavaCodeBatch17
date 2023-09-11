package class9_2DArrays;
/*Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries. Then print all values from that array using
2 different loops and calculate how many total countries been stored.*/
public class HW4_2DArrayAddingTheStringValue {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Mexico", "Costa Rica", "Panama", " Guatemala"},
                {"Argentina", "Brazil", "Chile", "Peru", "Venezuela", "Bolivia"},
                {"Germany", "Greece", "UK", "Malta", "Norway", "Spain"},
                {"Afghanistan", "Pakistan", "India", "Sarilunka", "Dubia", "Iran"},
                {"Mali", "Togo", "Libya", "Nigeria", "Sudan", "Tanzania"}
        };
        for (String[] rows : countries) {
            for (String col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int totalCountries=0;
        for (int i = 0; i < countries.length; i++) {
            totalCountries+=countries[i].length;
        }
                System.out.println("Total Countries are = "+totalCountries);

    }
}


