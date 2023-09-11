package class19_OverLoading_OverWriting;
/*Create a method to find the minimum of two numbers. Method will be passed two parameters and will
return the minimum number. Method should work with int and double datat Types.
Exp: min(10.5)==>5
min(2.5,3.5)==>2.5
use separate class t test your code.
 */
public class T1 {
    public int min(int num1,int num2){

                             // return num1<num2?num1:num2; // ternary operator
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }

    public double min(double num1,double num2){

                                         // return num1<num2?num1:num2; // ternary operator
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }
}
