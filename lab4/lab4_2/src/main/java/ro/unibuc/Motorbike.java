package ro.unibuc;

public class Motorbike extends TwoWheeler { // Motorbike IS A TwoWheeler -> IS A = INHERITANCE

    private String brand;
    private Engine engine; //Motorbike HAS AN engine -> HAS A = COMPOSITION
    private TyreType tires;

    private Motorbike() {

    }
//
//    public Motorbike(String brand) {
//        //super(); -> implicit
//        this.brand = brand;
//    }
//
//    public Motorbike(String brand, Engine engine, TyreType tyreType) {
//        this.brand = brand;
//        this.engine = engine;
//        this.tires = tyreType;
//    }

    @Override
    public int getPrice() {
        return 1000;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TyreType getTires() {
        return tires;
    }

    public void setTires(TyreType tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "brand='" + brand + '\'' +
                ", engine=" + engine +
                ", tires=" + tires +
                '}';
    }

    public static class Builder {

        private String brand;
        private Engine engine; //Motorbike HAS AN engine -> HAS A = COMPOSITION
        private TyreType tires;

        public Builder() {

        }

        public static Builder newMotorbike() {
            return new Builder();
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder tyreType(TyreType tyreType) {
            this.tires = tyreType;
            return this;
        }

        public Motorbike build() {
            Motorbike bike = new Motorbike();
            bike.setBrand(this.brand);
            bike.setEngine(this.engine);
            bike.setTires(this.tires);
//            return new Motorbike(this.brand, this.engine, this.tires);
            return bike;
        }
    }
}
