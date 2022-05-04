package Components;

import java.time.LocalDate;
import java.util.Map;

public class Stock {
    private Map<Entity<Long>, Integer> products;
    private LocalDate dateLastSupply;

    public Stock(Map<Entity<Long>, Integer> products) {
        this.products = products;
        this.dateLastSupply = LocalDate.now();
    }

    public LocalDate getDateLastSupply() {
        return dateLastSupply;
    }

    public void updateStock(Map<Entity<Long>, Integer> productsOrdered) {
        for (var produs : productsOrdered.keySet()) {

            if (products.containsKey(produs)) {

                products.put(produs, products.get(produs) - productsOrdered.get(produs)); // I decreased the stock

                if (products.get(produs) < 0) { // if we don't have enough stocks
                    dateLastSupply = LocalDate.now();
                    products.put(produs, products.get(produs) + 100); // add 100 products
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder mapAsString = new StringBuilder("{");

        for (var key : products.keySet()) {
            mapAsString.append(key + " x " + products.get(key) + ", ");
        }
        mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");

        return "Stock{" +
                "products=" + mapAsString +
                ", dateLastSupply=" + dateLastSupply +
                '}';
    }
}
