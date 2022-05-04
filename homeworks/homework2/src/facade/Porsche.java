package facade;

public class Porsche implements CarShop {
    @Override
    public void name_car() {
        System.out.println("Porsche 718 Cayman\n");
    }
    @Override
    public void price_car() {
        System.out.println("135000 EUR");
    }
}