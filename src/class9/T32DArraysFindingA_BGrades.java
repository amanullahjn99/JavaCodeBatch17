package class9;

public class T32DArraysFindingA_BGrades {
    public static void main(String[] args) {

        String[][] studnets = {
                {"Aysha", "Giulia", "John", "Deepali"},
                {"A", "A+", "C", "B"},

        };
        for (int i = 0; i < 4; i++) {
            if (studnets[1][i].equals("A") || studnets[1][i].equals("B")) {
                System.out.println(studnets[0][i] + " ");
            }

        }
    }

}