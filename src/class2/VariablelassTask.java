package class2;

public class VariablelassTask {
    public static void main(String[] args) {
        String StudentName="Aman";
        String StudentLastName="Ahmadzai";
        String City="VA";
        String State="USA";
        int PhoneNumber=348273623;

        System.out.println("My First Name is "+StudentName+" and My last Name is "+StudentLastName);
        System.out.println("I Live in city "+City+"and state "+State);
        //no i want to wirte i moveed to different state
        City="NY";
        State="NoState";
        PhoneNumber=349392828;
        System.out.println("My Name is "+StudentName+" and i Moved to "+City+" and new State"+ State);
        System.out.println("My New Phone Number is "+PhoneNumber);



    }
}
