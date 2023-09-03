package class15;
/*
Write a java class Students that have constructor which takes students name and 3 subject grades
Inside your class also have a method to Calculate Average Grade.
Test Student class for 2 different students with different marks.
Your program should print an average mark of each student's name.
Note: Please use different names for instance and Local variables
 */
public class T2Student {
    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public T2Student(String sName, double sMarks1, double sMarks2, double sMarks3) {
        name = sName;
        marks1 = sMarks1;
        marks2 = sMarks2;
        marks3 = sMarks3;
    }

    public void printAvg(){

        double avg=(marks1+marks2+marks3)/3;
        System.out.println(name+ " Got "+avg);

    }
    public void printName(){
        System.out.println(name);
    }
}