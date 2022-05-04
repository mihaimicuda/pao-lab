package Components;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Order {
    private Address addressOfDelivery;
    private Map<Entity<Long>, Integer> productsOrdered;
    private Entity<Long> restaurantId, driverID;
    private LocalDateTime timeOfOrder;

    public Order(Address addressOfDelivery, Map<Entity<Long>, Integer> productsOrdered, long restaurantId) {
        this.addressOfDelivery = addressOfDelivery;
        this.productsOrdered = productsOrdered;
        this.restaurantId = new Entity<Long>(restaurantId);
        this.timeOfOrder = LocalDateTime.now();
        this.driverID = new Entity<Long>(-1L);
    }

    public Address getAddressOfDelivery() {
        return addressOfDelivery;
    }

    public Long getRestaurantId() {
        return restaurantId.getId();
    }

    public Map<Entity<Long>, Integer> getProductsOrdered() {
        return this.productsOrdered;
    }

    public LocalDateTime getDateTime(){
        return this.timeOfOrder;
    }

    public void setDriverID(Long id) {
        this.driverID.id = id;
    }

    public Long getDriverID() {
        return driverID.getId();
    }

    @Override
    public String toString() {

        StringBuilder mapAsString = new StringBuilder("{");

        for (Entity<Long> key : productsOrdered.keySet()) {
            mapAsString.append(key + "=" + productsOrdered.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");

        return "Order{" +
                "addressOfDelivery=" + addressOfDelivery.toString() +
                ", productsOrdered=" + mapAsString +
                ", restaurantId=" + restaurantId.id +
                ", timeOfOrder=" + timeOfOrder.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) +
        '}';
    }
}
