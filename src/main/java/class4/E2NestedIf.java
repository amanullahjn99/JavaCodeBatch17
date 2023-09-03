package class4;

public class E2NestedIf {
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor="blue";

        if (winter==true) {     //ذغه اصلی کاندیشن ده که تغیر یی کرو بیا دوهم else استفاده کیری
            System.out.println("Its very cold");
            if(jacketColor.equals("red")){
                System.out.println("let go with blue Nike shoes");
            } else {
                System.out.println("lets go with blue ones");
            }

        }else {
            System.out.println("No need to wear jackets");
        }
    }
}
