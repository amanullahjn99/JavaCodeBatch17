package class10;

public class phoneTester {
    public static void main(String[] args) {
        Phone iphoneObj=new Phone();
        iphoneObj.make="Google";
        iphoneObj.model="Pixel7";
        iphoneObj.os="Andriod 13";
        iphoneObj.price=999;
        iphoneObj.calls();
        iphoneObj.message();

        Phone pixelObj=new Phone();
        pixelObj.make="Google";
        pixelObj.model="Pixel 7";
        pixelObj.os="Android 13";
        pixelObj.price=699;
        pixelObj.calls();
        pixelObj.message();

        Phone samsungObj=new Phone();
        samsungObj.make="Samsung";
        samsungObj.model="S23 Ultra";
        samsungObj.os="Androud 13";
        samsungObj.price=1199;
        samsungObj.calls();
        samsungObj.message();

    }
}
