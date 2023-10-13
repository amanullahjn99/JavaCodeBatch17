package RiplitQuestions;

import java.io.FileNotFoundException;

public class Riplit212 {

    static class Main {

        public static void printException() throws FileNotFoundException {

            throw new FileNotFoundException("No such file or directory");
        }

        public static void main(String[] args) {
            try {
                printException();
            } catch (Exception e) {
                System.out.println(e.getClass().getName() + ": " + e.getMessage());
            }
        }
    }
}