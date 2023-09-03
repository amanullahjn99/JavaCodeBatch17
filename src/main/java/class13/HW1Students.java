package class13;
/*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class Set the value for  studentName , studentID and increment
the numberOfStudents for each object Print out  total number of students
 */
public class HW1Students {
    String name;
    int ID;
    static int numberOfStudents;
    public static void main(String[] args) {
        HW1Students students1 = new HW1Students();
        students1.name = "Aman";
        students1.ID = 23;
        numberOfStudents++;

        HW1Students students2 = new HW1Students();
        students2.name = "John";
        students2.ID = 26;
        numberOfStudents++;

        HW1Students students3 = new HW1Students();
        students3.name = "Omar";
        students3.ID = 33;
        numberOfStudents++;

        HW1Students students4 = new HW1Students();
        students4.name = "Ali";
        students4.ID = 32;
        numberOfStudents++;

        System.out.println("The total number of the student are "+numberOfStudents);
       }
}


