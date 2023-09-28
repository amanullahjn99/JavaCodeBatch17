package class26_Maps;
/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
Print each object details.
Example of key is 1 , 2 ,3 etc.
 */
public class HW_Person {
    private String name;
    private String lastName;
    private int age;
    private final double salary;
    public HW_Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void printInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
