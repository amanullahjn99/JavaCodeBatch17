package class12;
/*Create a method that will take 2 paramters as
 numbers and print which number is larger
 */
public class T1CreatePerameter {
    void printLarger(int num1, int num2){
    if(num1> num2){
            System.out.println("Larger number is "+num1);
        }else{
            System.out.println("Larger number is "+num2);
        }

    }

    public void checkEvenOdd(int num) {
        if(num %2==0){
            System.out.println(num+" is Even Number");

        }else {
            System.out.println(num+" is Odd number");
        }
    }
}