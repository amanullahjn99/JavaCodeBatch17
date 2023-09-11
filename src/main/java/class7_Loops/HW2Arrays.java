package class7_Loops;

/*Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array)..
 */
public class HW2Arrays {
    public static void main(String[] args) {
        String[] names = {"Sayed", "Alexis","Ali","Amanullah","Ehab",
                "Mohammad","Hazem","Jasraj","Tahmin","Aziza", "Anzhelika","Unek"};
        System.out.println(names[3]);

        String[] names1 = new String[12];

        names1[0] ="Sayed";
        names1[1] = "Alexis";
        names1[2] = "Ali";
        names1[3] = "Amanullah";
        names1[4] = "Ehab";
        names1[5] = "Mohammad";
        names1[6] = "Hazem";
        names1[7] = "Jasraj";
        names1[8] = "Tahmin";
        names1[9] = "Tahmin";
        names1[10] = "Aziza";
        names1[11] = "Anzhelika";
        names1[2] = "Unek";
        System.out.println(names1[3]);
    }
}
