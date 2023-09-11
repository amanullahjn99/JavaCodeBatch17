package class17_Inheritance;
/*Write program to inherit class Dee that has method printF which is
Static and call or reuse that method into class Eff
 */
public class Dee {
    static String name="Jamel";
    static void printF(){
        System.out.println("f");
    }
}

class Eff extends Dee{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }
}
