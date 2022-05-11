package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Transport {
    private static int transportNo = 0;
    private Integer idTransport;
    private String typeTransport;
    private Integer idDeliveryCompany;
    private String userClient;
    private Float weight = 0.0F;
    private List<Notes> notes = new ArrayList<>();
    private List<Package> packages = new ArrayList<>();
    
    public Transport(Integer idTransport, String typeTransport,String userClient, Integer idDeliveryCompany, Float weight) {
        transportNo++;
        this.idTransport = transportNo;
        this.typeTransport = typeTransport;
        this.idDeliveryCompany = idDeliveryCompany;
        this.userClient  = userClient;
        this.weight = weight;
    }

    public Transport() {
        transportNo++;
        this.idTransport = transportNo;
    }

    public Transport(Transport transport) {
        this.idTransport = transport.idTransport;
        this.typeTransport = transport.typeTransport;
        this.idDeliveryCompany = transport.idDeliveryCompany;
        this.userClient = transport.userClient;
        this.weight = transport.weight;

    }


    public static int gettransportNo() {
        return transportNo;
    }

    public static void settransportNo(int transportNo) {
        Transport.transportNo = transportNo;
    }

    public Integer getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(Integer idTransport) {
        this.idTransport = idTransport;
    }

    public String gettypeTransport() {
        return typeTransport;
    }

    public void settypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public Integer getidDeliveryCompany() {
        return idDeliveryCompany;
    }

    public void setidDeliveryCompany(Integer idDeliveryCompany) {
        this.idDeliveryCompany = idDeliveryCompany;
    }

    public String getUserClient() {
        return userClient;
    }

    public void setUserClient(String userClient) {
        this.userClient = userClient;
    }

    public Float getweight() {
        return weight;
    }

    public void setweight(Float weight) {
        this.weight = weight;
    }

    public List<Notes> getnotes() {
        return notes;
    }

    public void setnotes(List<Notes> notes) {
        this.notes = notes;
    }

    public List<Package> getpackage() {
        return packages;
    }

    public void setpackage(List<Package> packages) {
        this.packages = packages;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "idTransport=" + idTransport +
                ", typeTransport='" + typeTransport + '\'' +
                ", idDeliveryCompany=" + idDeliveryCompany +
                ", userClient='" + userClient + '\'' +
                ", weight=" + weight +
                ", notes=" + notes +
                ", package=" + packages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(idTransport, transport.idTransport) && Objects.equals(typeTransport, transport.typeTransport) && Objects.equals(idDeliveryCompany, transport.idDeliveryCompany) && Objects.equals(userClient, transport.userClient) && Objects.equals(weight, transport.weight) && Objects.equals(notes, transport.notes) && Objects.equals(packages, transport.packages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTransport, typeTransport, idDeliveryCompany, userClient, weight, notes, packages);
    }
}