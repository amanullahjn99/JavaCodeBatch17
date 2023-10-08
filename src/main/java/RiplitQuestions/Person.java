package RiplitQuestions;

public class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public String formatBirthday() {
        return birthmonth + "/" + birthday + "/" + birthyear;
    }
}

class Maind {
    public static void main(String[] args) {
        // Instantiate a Person object and provide values
        Person person = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");

        // Use getters to print the values separately
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());
    }
}