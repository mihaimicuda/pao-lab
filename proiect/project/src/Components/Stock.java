package Components;

import java.time.LocalDate;
import java.util.Map;

public class Stock {
    private Map<Product, Integer> products;
    private LocalDate dateLastSupply;

    public Stock(Map<Product, Integer> products) {
        this.products = products;
        this.dateLastSupply = LocalDate.now();
    }

    public LocalDate getDateLastSupply() {
        return dateLastSupply;
    }

    @Override
    public String toString() {
        StringBuilder mapAsString = new StringBuilder("{");

        for (Product key : products.keySet()) {
            mapAsString.append(key + " x " + products.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");

        return "Stock{" +
                "products=" + mapAsString +
                ", dateLastSupply=" + dateLastSupply +
                '}';
    }
}
