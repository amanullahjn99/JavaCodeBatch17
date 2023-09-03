package class16;

public class T1Cat {
    private String name;
    private int age;
    private String color;
    private String breed;
    private String eyeColor;
    private double weight;

public T1Cat(){

}
public T1Cat(String name,int age, String color, String breed, String eyeColor, double weight){
this.name=name;
this.age=age;
this.color=color;
this.breed=breed;
this.weight=weight;
this.eyeColor=eyeColor;

}
    public T1Cat(String name,int age, String color, String breed){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;

    }
    public T1Cat(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void printIf(){
        System.out.println(name+" "+age+" "+color+" "+breed+" "+eyeColor+" "+weight);
    }
}
