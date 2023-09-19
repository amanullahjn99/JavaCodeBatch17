package FirstGroupProject;
// Write a program to print out duplicate elements from an Array of
//Strings?
public class T10DuplicateElement {
    public static void main(String[] args) {
        String[] strings = {"laptop", "tablet", "smartphone", "laptop", "tablet", "smart watch"};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].equals(strings[j])) {
                    System.out.println(strings[i]);
                }
            }
        }
    }
}
