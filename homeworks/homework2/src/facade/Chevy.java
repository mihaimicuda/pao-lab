package facade;

public class Chevy implements CarShop {
    @Override
    public void name_car() {
        System.out.println("Chevy Camaro");
    }
    @Override
    public void price_car() {
        System.out.println("92500 EUR");
    }
}