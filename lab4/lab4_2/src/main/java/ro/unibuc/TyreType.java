package ro.unibuc;

public class TyreType {
    String brand;

    public TyreType(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "TyreType{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
