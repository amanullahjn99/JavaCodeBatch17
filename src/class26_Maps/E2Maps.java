package class26_Maps;

import java.util.LinkedHashMap;

public class E2Maps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();
        students.put(10,"Adam");
        students.put(20,"Ehab");
        students.put(300,"Marta");
        students.put(45,"Ahmed");
        System.out.println(students);
        students.remove(300);
        System.out.println(students);
        students.replace(20,"Aman");
        System.out.println(students);


    }
}
