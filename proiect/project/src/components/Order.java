package Components;

import java.util.*;

public class Order {
    private Address addressOfDelivery, addressOfTake;
    private Map<Product, Integer> productsOrdered;
    private Entity<Long> restaurantId;

    public Order(Address addressOfDelivery, Address addressOfTake, Map<Product, Integer> productsOrdered, long restaurantId) {
        this.addressOfDelivery = addressOfDelivery;
        this.addressOfTake = addressOfTake;
        this.productsOrdered = productsOrdered;
        this.restaurantId.id = restaurantId;
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

    @Override
    public String toString() {

        StringBuilder mapAsString = new StringBuilder("{");

        for (Product key : productsOrdered.keySet()) {
            mapAsString.append(key + "=" + productsOrdered.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");

        return "Order{" +
                "addressOfDelivery=" + addressOfDelivery.toString() +
                ", addressOfTake=" + addressOfTake.toString() +
                ", productsOrdered=" + mapAsString +
                ", restaurantId=" + restaurantId.id +
                '}';
    }
}
