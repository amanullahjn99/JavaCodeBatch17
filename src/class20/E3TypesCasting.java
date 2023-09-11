package class20;

public class E3TypesCasting {
    public static void main(String[] args) {
       Student s1=new Student("Aslan","A123");
       Student s2=new Student("Aman","A1343");
        Student[] arr={new Student("Aslan","A123"),new Student("Aman","A1343")};
        // arr[1].printInfo();

        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];
            s.printInfo();
        }
        int num=(int)12.5; //int is small datatype compare to Double, so we push it
        System.out.println(num);
        double age=10;

        Animal a=new Dog();
        Dog d=(Dog)new Animal(); //when we want to write big class in smal, so we have to implicit the dog
    }
}
