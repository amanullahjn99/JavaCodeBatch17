package RiplitQuestions;

public class carObject {
    private String model;
    private double price;
    private int quantity;


    public carObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    public void carStockValue(){
        double stockValue=price*quantity;
        System.out.println(model+" Stock Value "+stockValue);
    }
}
class Main2312{
    public static void main(String[] args) {
        carObject car1=new carObject("Toyota 2019",50000.0,50);
        car1.carStockValue();

        carObject car2=new carObject("BMW 2019",54415.0,12);
        car2.carStockValue();
    }
}
