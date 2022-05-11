package model;

public class Car {
    private Integer idCar;
    private String noRegistration;
    private String brand;
    private String color;

    //To construct an object with default values.


    public Car() {
    }

    public Car(Integer idCar, String noRegistration, String brand, String color) {
        this.idCar = idCar;
        this.noRegistration = noRegistration;
        this.brand = brand;
        this.color = color;
    }
    public Car( Car car){
        this.idCar = car.idCar;
        this.noRegistration = car.noRegistration;
        this.brand = car.brand;
        this.color = car.color;
    }


    public Integer getIdCar() {
        return idCar;
    }

    public void setIdCar(Integer idCar) {
        this.idCar = idCar;
    }

    public String getNoRegistration() {
        return noRegistration;
    }

    public void setNoRegistration(String noRegistration) {
        this.noRegistration = noRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", noRegistration='" + noRegistration + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
