package class10_StringDemoClasses;

public class Student {
    //below is properties/attributes
    String name;
    int age;
    String id;

    // below is called method/functions/behaviours
    void study() {
        System.out.println("Studying 16 hours a day......");

    }

    public static void main(String[] args) {
        //we are creating an actual student by using the Student class
        Student ehabobj = new Student();
        ehabobj.name = "Ehab";
        ehabobj.age = 23;
        ehabobj.id = "abc123";
        ehabobj.study();// its scanner.nextInt();

        Student habibobj = new Student();
        habibobj.name = "Habib";
        habibobj.age = 20;
        habibobj.id = "abc123";
        habibobj.study();


    }
}
