package Components;

import java.util.Arrays;
import java.util.List;

public class Product {
    private String nameOfProduct, unityOfMeasurement;
    private List<String> ingredients;
    private double price, quantity;

    public Product(String nameOfProduct, String unityOfMeasurement, List<String> ingredients, double price, double quantity) {
        this.nameOfProduct = nameOfProduct;
        this.unityOfMeasurement = unityOfMeasurement;
        this.ingredients = ingredients;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getUnityOfMeasurement() {
        return unityOfMeasurement;
    }

    public void setUnityOfMeasurement(String unityOfMeasurement) {
        this.unityOfMeasurement = unityOfMeasurement;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", unityOfMeasurement='" + unityOfMeasurement + '\'' +
                ", ingredients=" + Arrays.toString(ingredients.toArray()) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
