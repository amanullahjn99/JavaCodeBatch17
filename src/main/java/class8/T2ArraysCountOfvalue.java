package class8;

public class T2ArraysCountOfvalue {
    //count how many true values are present in arrays
    public static void main(String[] args) {
        boolean[] conds = {true, false, true, false, true, true};

        int count = 0;
        for (int i = 0; i < conds.length; i++) {
            if (conds[i]==true) {
                count++;
            }
        }
        System.out.println(count);

    }
}

