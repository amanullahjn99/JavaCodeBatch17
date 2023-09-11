package class16_Constructors;

public class T2Student {
    private String name;
    private String address;


    public T2Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void printIf() {
        System.out.println(name + " " + address);
    }

}
