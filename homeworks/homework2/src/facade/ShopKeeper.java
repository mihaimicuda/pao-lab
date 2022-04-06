package facade;

public class ShopKeeper {
    private CarShop Ford;
    private CarShop Porsche;
    private CarShop Toyota;
    private CarShop Chevy;

    public ShopKeeper(){
        Ford = new Ford();
        Porsche = new Porsche();
        Toyota = new Toyota();
        Chevy = new Chevy();
    }
    public void FordSale(){
        Ford.name_car();
        Ford.price_car();
    }
    public void PorscheSale(){
        Porsche.name_car();
        Porsche.price_car();
    }
    public void ToyotaSale(){
        Toyota.name_car();
        Toyota.price_car();
    }
    public void ChevySale(){
        Chevy.name_car();
        Chevy.price_car();
    }
}