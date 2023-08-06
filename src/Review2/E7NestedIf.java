package Review2;

public class E7NestedIf {
    public static void main(String[] args) {
        String day="Saturday";
        double accountBalance=5000;
        // == equals()      !=!equals()
        if(day.equals("Sunday")){
            if(accountBalance>2000){
                System.out.println("we can buy this");
            }else {
                System.out.println("Its too expensive");
            }
        } else if ((day.equals("Saturday"))) {
            System.out.println("Its Saturday Lets go for dinner");

        } else{
            System.out.println("Lets wait for sunday");
        }
    }


}
