package facade;

public class Toyota implements CarShop {
    @Override
    public void name_car() {
        System.out.println("Toyota Supra");
    }
    @Override
    public void price_car() {
        System.out.println("96000 EUR");
    }
}