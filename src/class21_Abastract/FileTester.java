package class21_Abastract;

public class FileTester {

    public static void main(String[] args) {
        File[] arr = {new JavaFile("JavaFile.java", 5000), new WordFile("Word.doc", 500), new PDFFile("New.pdf", 1000)};

        for (File f : arr) {
            f.open();
            f.edit();
            f.close();
        }
    }
}