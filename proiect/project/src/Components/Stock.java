package Components;

import java.time.LocalDateTime;
import java.util.Map;

public class Stock {
    private Map<Product, Long> products;
    private LocalDateTime dateLastSupply;

    public Stock(Map<Product, Long> products, LocalDateTime dateLastSupply) {
        this.products = products;
        this.dateLastSupply = dateLastSupply;
    }

    public Map<Product, Long> getProducts() {
        return products;
    }

    public void setProducts(Map<Product, Long> products) {
        this.products = products;
    }

    public LocalDateTime getDateLastSupply() {
        return dateLastSupply;
    }

    public void setDateLastSupply(LocalDateTime dateLastSupply) {
        this.dateLastSupply = dateLastSupply;
    }

    @Override
    public String toString() {
        StringBuilder mapAsString = new StringBuilder("{");

        for (Product key : products.keySet()) {
            mapAsString.append(key + "=" + products.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");

        return "Stock{" +
                "products=" + mapAsString +
                ", dateLastSupply=" + dateLastSupply +
                '}';
    }
}
