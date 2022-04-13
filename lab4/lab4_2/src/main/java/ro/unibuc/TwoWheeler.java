package ro.unibuc;

public class TwoWheeler implements SellableVehicle {

    public void move() {
        System.out.println("Moving two-wheeler");
    }

    public int getPrice() {
        return 0;
    }
}
