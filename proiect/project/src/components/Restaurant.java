package Components;

public class Restaurant {
    static long serialRestaurantsNumber = 0;

    private Entity<Long> restaurantId;
    private Address address;
    private String name;
    private Stock restaurantStock;
    private double commissionOfDelivery;

    public Restaurant(Address address, String name, Stock stock, double commissionOfDelivery) {
        this.address = address;
        this.name = name;
        this.restaurantStock = stock;
        this.commissionOfDelivery = commissionOfDelivery;

        serialRestaurantsNumber += 1;

        this.restaurantId.id = serialRestaurantsNumber;
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

    public Entity<Long> getRestaurantId() {
        return restaurantId;
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
                "restaurantId=" + restaurantId +
                ", address=" + address.toString() +
                ", name='" + name + '\'' +
                ", commissionOfDelivery=" + commissionOfDelivery +
                Stock.class.toString() +
                '}';
    }
}
