package service;

import exceptions.InvalidDataException;
import model.DeliveryCompany;
import model.Driver;
import repository.CompanyRepository;
import repository.DriverRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CompanyServices {
    private CompanyRepository companyRepository = new CompanyRepository();
    private DriverRepository driverRepository = new DriverRepository();

    public static void addNewCompany(String name, String transportType, Driver driver) {
    }

    public List<DeliveryCompany> getAllF(){
        List<DeliveryCompany> companies = new ArrayList<>();
        for(int i = 0; i < companyRepository.getSize(); i++)
            companies.add(companyRepository.get(i));
        return companies;
    }
    public void addNewCompany(DeliveryCompany deliveryCompany) throws InvalidDataException {
        if(deliveryCompany == null)
            throw new InvalidDataException("The company doesn't exist!");

        DeliveryCompany newCompany = new DeliveryCompany(deliveryCompany);
        companyRepository.add(newCompany);

    }

    public void addNewCompany(String name, String transportType, Integer idDriver,Driver driver) throws InvalidDataException{
        if(name == null || name.equals(""))
            throw new InvalidDataException("Invalid");
        DeliveryCompany newdeliveryCompany = new DeliveryCompany(name,transportType,idDriver,driver);
        companyRepository.add(newdeliveryCompany);
    }

}
