package facade;

public class Ford implements CarShop {
    @Override
    public void name_car() {
        System.out.println("Ford Mustang");
    }
    @Override
    public void price_car() {
        System.out.println("81240 EUR");
    }
}