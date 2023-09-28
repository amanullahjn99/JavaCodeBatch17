package GroupProject_2;
/*Create Registration Class in which you would have variables as email, userName and password
that have an access scope only within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values to set users email, username and password.
Requirements:A. Valid email consider to be only yahoo B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also, valid password cannot contain userName. */
public class T12_Registration {
    private String email;
    private String userName;
    private String password;
    public T12_Registration() {
    }
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format. Only Yahoo email addresses are allowed.");
        }
    }
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It cannot be empty and should be at least 7 characters long.");
        }
    }
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It cannot be empty, should be at least 7 characters long, and should not contain the userName.");
        }
    }
    private boolean isValidEmail(String email) {

        return email != null && email.toLowerCase().endsWith("@yahoo.com");
    }

    private boolean isValidUserName(String userName) {
        return userName != null && !userName.isEmpty() && userName.length() >= 7;
    }

    private boolean isValidPassword(String password) {
        return password != null && !password.isEmpty() && password.length() >= 7 && !password.contains(userName);
    }

    public static void main(String[] args) {
        T12_Registration registration = new T12_Registration();

        registration.setEmail("user@yahoo.com");
        registration.setUserName("username123");
        registration.setPassword("password123");

        registration.setEmail("user@gmail.com");
        registration.setUserName("");
        registration.setPassword("username123");
    }
}