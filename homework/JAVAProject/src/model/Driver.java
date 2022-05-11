package model;

public class Driver extends Person{
    private Integer idDriver = 0;
    private Car car;

    public Driver() {
    }

    public Driver(String lastName, String firstName, String phoneNo, Integer idDriver, Car car) {
        super(lastName, firstName, phoneNo);
        this.idDriver = idDriver;
        this.car = car;
    }

    public Driver(Driver driver) {
        super(driver);
        this.idDriver = driver.idDriver;
        this.car = driver.car;
    }

    public Integer getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(Integer idDriver) {
        this.idDriver = idDriver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "idDriver=" + idDriver +
                ", car=" + car +
                '}';
    }
}
