package review10;

public abstract class Animal_Abs {
    abstract void speak();
    abstract void eat();

}

class Dog1 extends Animal_Abs{
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}

class Cat1 extends Animal_Abs{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to Eat free Fish from Giulia");
    }
}