package Components;

import java.util.*;

public class Order {
    private Address addressOfDelivery, addressOfTake;
    private Map<Product, Integer> productsOrdered;
    private long restaurantId;

    public Order(Address addressOfDelivery, Address addressOfTake, Map<Product, Integer> productsOrdered, long restaurantId) {
        this.addressOfDelivery = addressOfDelivery;
        this.addressOfTake = addressOfTake;
        this.productsOrdered = productsOrdered;
        this.restaurantId = restaurantId;
    }

    public Address getAddressOfDelivery() {
        return addressOfDelivery;
    }

    public void setAddressOfDelivery(Address addressOfDelivery) {
        this.addressOfDelivery = addressOfDelivery;
    }

    public Address getAddressOfTake() {
        return addressOfTake;
    }

    public void setAddressOfTake(Address addressOfTake) {
        this.addressOfTake = addressOfTake;
    }

    public Map<Product, Integer> getProductsOrdered() {
        return productsOrdered;
    }

    public void setProductsOrdered(Map<Product, Integer> productsOrdered) {
        this.productsOrdered = productsOrdered;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }
}
