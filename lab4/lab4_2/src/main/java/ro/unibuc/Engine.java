package ro.unibuc;

public class Engine {

    int horsePower;
    String fuelType;

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
