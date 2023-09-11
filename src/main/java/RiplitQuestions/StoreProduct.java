package RiplitQuestions;

public class StoreProduct {
    private String lable;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    public StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock) {
        this.lable = lable;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String lable, double price, int stock) {
        this.lable = lable;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }

    public StoreProduct(String lable, double price) {
        this.lable = lable;
        this.price = price;
        this.category = null;
        this.hasExpiration = false;
        this.stock = 0;
    }

    public void display() {
        System.out.println(lable + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}
class Main2 {

    public static void main(String[] args) {
        StoreProduct product1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        StoreProduct product2 = new StoreProduct("Paper Towels", 2.0, 24);
        StoreProduct product3 = new StoreProduct("Paper Towels", 2.0);
        product1.display();
        product2.display();
        product3.display();
    }
}
