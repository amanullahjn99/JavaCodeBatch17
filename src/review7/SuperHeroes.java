package review7;

public class SuperHeroes {
    String name, power;
    int age;
    char gender;

    SuperHeroes(String name, String power){
        this.name=name;
        this.power=power;
    }

    SuperHeroes(String name, String power, int age){
        this(name, power); // this() ->making a call to the CURRENT class constructor
        this.age=age; // this. ->accessing CURRENT class instance variables
    }

    public static void main(String[] args) {
        SuperHeroes hero1=new SuperHeroes("Superman", "Fly");

        SuperHeroes hero2=new SuperHeroes("Batman", "Money",27);
    }
}
