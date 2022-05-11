package model;

public class Package {
    private String type;
    private Float weightColet;

    public Package() {
    }

    public Package(String type, Float weightColet) {
        this.type = type;
        this.weightColet = weightColet;
    }
    public Package(Package packages){
        this.type = packages.type;
        this.weightColet = packages.weightColet;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public Float getweightColet() {
        return weightColet;
    }

    public void setweightColet(Float weightColet) {
        this.weightColet = weightColet;
    }

    @Override
    public String toString() {
        return "Package{" +
                "type='" + type + '\'' +
                ", weightColet=" + weightColet +
                '}';
    }
}
