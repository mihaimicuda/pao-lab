package Components;

import java.util.Map;

public class Restaurant extends Entity<Long> {
    static long serialRestaurantsNumber = 0;

    private Address address;
    private String name;
    private Stock restaurantStock;
    private double commissionOfDelivery;

    public Restaurant(Address address, String name, Stock restaurantStock, double commissionOfDelivery) {
        super(serialRestaurantsNumber);
        serialRestaurantsNumber += 1;

        this.address = address;
        this.name = name;
        this.restaurantStock = restaurantStock;
        this.commissionOfDelivery = commissionOfDelivery;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCommissionOfDelivery() {
        return commissionOfDelivery;
    }

    public void setCommissionOfDelivery(double commissionOfDelivery) {
        this.commissionOfDelivery = commissionOfDelivery;
    }

    public void updateStock(Map<Entity<Long>, Integer> productsOrdered) {
        restaurantStock.updateStock(productsOrdered);
    }

    public Stock getRestaurantStock() {
        return restaurantStock;
    }

    public void setRestaurantStock(Stock restaurantStock) {
        this.restaurantStock = restaurantStock;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + getId()+
                ", address=" + address.toString() +
                ", name='" + name + '\'' +
                ", commissionOfDelivery=" + commissionOfDelivery +
                Stock.class.toString() +
                '}';
    }
}
