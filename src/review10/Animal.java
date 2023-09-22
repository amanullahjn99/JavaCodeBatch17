package review10;

public class Animal {
    void speak(){
        System.out.println("Animal can speak");
    }
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Wuff Wuff");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat free Fish from Guilia");
    }
}
