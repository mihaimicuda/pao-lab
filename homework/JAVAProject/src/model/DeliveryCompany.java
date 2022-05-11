package model;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class DeliveryCompany {
    private static Integer countDeliveryCompany = 0;
    private String name;
    private String transportType;
    private Integer idDriver;
    private SortedSet<Driver> drivers = new TreeSet<>();
    public DeliveryCompany(){
        countDeliveryCompany++;
        idDriver =countDeliveryCompany;
    }

    public DeliveryCompany(String name, String transportType, Integer idDriver, Driver driver) {
        this.name = name;
        this.transportType = transportType;
        countDeliveryCompany++;
        idDriver =countDeliveryCompany;
        this.idDriver = idDriver;
    }

    public DeliveryCompany(DeliveryCompany DeliveryCompany) {
        if(DeliveryCompany!=null){
            this.name = DeliveryCompany.name;
            this.transportType = DeliveryCompany.transportType;
            this.idDriver = DeliveryCompany.idDriver;
            this.drivers = DeliveryCompany.drivers;
        }
    }

    public String getname() {
        return name;
    }

    public String gettransportType() {
        return transportType;
    }

    public Integer getidDriver() {
        return idDriver;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void settransportType(String transportType) {
        this.transportType = transportType;
    }

    public void addDriver(Driver s) {

    }

    public SortedSet<Driver> getdrivers() {
        return drivers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeliveryCompany that = (DeliveryCompany) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(transportType, that.transportType) &&
                Objects.equals(idDriver, that.idDriver) && Objects.equals(drivers, that.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transportType, idDriver, drivers);
    }
}

