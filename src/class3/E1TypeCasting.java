package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        //byte->shrot->int->long->float->double
        long age=12;
      // int myAge=age; //its getting error, becz big can fit in small int.

        //byte myAge=age;
        byte number=10;
        int number2=number; //now we are not getting bcz small is coming to bigbox
        System.out.println(number2);

        float num1=15.6f;
        int num2;
        num2=(int)num1;     //now we are forcing to store float in int, but we lose data
        System.out.println(num2);


    }
}
