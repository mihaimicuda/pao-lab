package Components;

import java.util.Arrays;
import java.util.List;

public class Restaurant {
    static long serialRestaurantsNumber = 0;

    private Entity<Long> restaurantId;
    private Address address;
    private String name;
    private List<Product> productsAvailable;
    private double commissionOfDelivery;

    public Restaurant(Address address, String name, List<Product> productsAvailable, double commissionOfDelivery) {
        this.address = address;
        this.name = name;
        this.productsAvailable = productsAvailable;
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

    public List<Product> getProductsAvailable() {
        return productsAvailable;
    }

    public void setProductsAvailable(List<Product> productsAvailable) {
        this.productsAvailable = productsAvailable;
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

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", address=" + address.toString() +
                ", name='" + name + '\'' +
                ", productsAvailable=" + Arrays.toString(productsAvailable.toArray()) +
                ", commissionOfDelivery=" + commissionOfDelivery +
                '}';
    }
}
