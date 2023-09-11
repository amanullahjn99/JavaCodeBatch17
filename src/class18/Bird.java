package class18;

public class Bird {
    /* Create a Bird class create 4 fields and use the Bird class as parent class and create 2 classes
     Using it one sparrow and one parrot use constructors make fields private and define printInfo
     methods as well create the object of each class and call the methods
     */
    String name;
    int age;
    String breed;
    String color;

    public Bird(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    void printInfo() {
        System.out.println(name + " " + age + " " + breed + " " + color);
    }

}
