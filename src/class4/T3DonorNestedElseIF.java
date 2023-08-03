package class4;

/*Create a Java program and call it a Donor.
In order to be eligible to donate your blood you have to be 18 years old.
Also once you identify age eligibility then we have to see if person matches weight requirements.
If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient..
 */
public class T3DonorNestedElseIF {
    public static void main(String[] args) {
        int age=18;
        double weight=109;
        if (age>=18){
            System.out.println("Age identified");
            if(weight>110){
                System.out.println("You can give blood");
            }else {
                System.out.println("We cannot accept such a patient");
            }
        }
    }
    }
