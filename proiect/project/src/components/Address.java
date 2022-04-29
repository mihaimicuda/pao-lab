package Components;

public class Address {

    private String country, county, city, street, block;

    private Integer appartmentNumber, streetNumber, floor;

    public Address(String country, String county, String city, String street, String block, Integer appartmentNumber, Integer streetNumber, Integer floor) {
        this.country = country;
        this.county = county;
        this.city = city;
        this.street = street;
        this.block = block;
        this.appartmentNumber = appartmentNumber;
        this.streetNumber = streetNumber;
        this.floor = floor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public Integer getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(Integer appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", block='" + block + '\'' +
                ", appartmentNumber=" + appartmentNumber +
                ", streetNumber=" + streetNumber +
                ", floor=" + floor +
                '}';
    }
}
