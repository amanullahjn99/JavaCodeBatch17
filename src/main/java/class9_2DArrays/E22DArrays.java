package class9_2DArrays;

public class E22DArrays {
    public static void main(String[] args) {
        String[][] names = {
                {"Hind", "Miakhil", "Khan moh", "Mamama"},
                {"JOhn", "Bob", "Adam", "Tamim"},
                {"Joke", "Laugh", "JOhn Ahmad", "Aman"},
                {"Gui", "Bacend", "Noor", "MOhammad"}

        };
        String[] row=names[2];
       // System.out.println(Arrays.toString(row));//[Hind, Miakhil, Khan moh, Mamama]
        for(String name:row){
            System.out.println(name);
        }

    }
}

