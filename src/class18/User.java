package class18;
/*Write program: User that has a constructor that initializes instance variable name and mobile number.
Create a subclass/child class  userInfo that will have user address variable
 and it also being initialized through constructor call.
 Print users name, mobile number and address in userDetails method. Test your code.
 */
public class User {
    String name;
    String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}

class UserInfo extends User {
    String address;
    public UserInfo(String name, String phoneNumber,String address) {
        super(name,phoneNumber);
        this.address=address;
    }
    void userDetails(){
        System.out.println("name:"+name+" phone number: "+ phoneNumber +" adress:"+address);
    }

}
class UserTester {
    public static void main(String[] args) {
        UserInfo us1=new UserInfo("Yavuz","+9054214526","Turkey");
        us1.userDetails();
    }
}

