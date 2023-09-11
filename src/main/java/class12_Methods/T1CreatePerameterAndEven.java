package class12_Methods;
/*Create a method that will take 2 paramters as
 numbers and print which number is larger
 */
public class T1CreatePerameterAndEven {
    void printLarger(int num1, int num2){
    if(num1> num2){
            System.out.println("Larger number is "+num1);
        }else{
            System.out.println("Larger number is "+num2);
        }

    }
    /*
    Create a method that will take a number and print whether the number is even or ODD
     */
    void checkEvenOdd(int num){
        if(num%2==0){
            System.out.println(num+" is an even number");
        }else {
            System.out.println(num+" is Odd number");
        }
    }

}