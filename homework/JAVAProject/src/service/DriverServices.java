package service;

import exceptions.InvalidDataException;
import model.Car;
import model.Driver;
import model.Package;
import repository.CarRepository;
import repository.DriverRepository;
import service.csv.DriverCSVServices;
import service.csv.PackageCSVService;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DriverServices {
    private DriverRepository driverRepository = new DriverRepository();
    private CarRepository carRepository = new CarRepository();

    public List<Driver> getAllDrivers(){
        List<Driver> drivers = new ArrayList<>();
        for(int i = 0; i < driverRepository.getSize(); i++)
            drivers.add(driverRepository.get(i));
        return drivers;
    }

    public void addNewDrivers(Driver driver) throws InvalidDataException {
        if(driver == null)
            throw new InvalidDataException("Soferul nu exista");

        Driver newDriver = new Driver(driver);
        driverRepository.add(newDriver);

    }

    public void addNewDrivers(String lastName, String firstName, String phoneNo, Integer idDriver, Car car)throws InvalidDataException{
        if(idDriver == null) throw new InvalidDataException("id invalid");
        Driver newDriver = new Driver(lastName,firstName,phoneNo,idDriver,car);
        driverRepository.add(newDriver);
    }

    public boolean updateCar(int drIndex, int idCar){
        if(drIndex < 0 || drIndex >= driverRepository.getSize())
            return false;

        Driver prevDriver = new Driver(driverRepository.get(drIndex));
        Driver newDriver = new Driver(prevDriver);
        newDriver.setCar(carRepository.get(idCar));
        driverRepository.delete(drIndex);

        driverRepository.add(newDriver);
        return true;
    }
    public boolean deleteDriver(int id){
        if(id>=0 && id < driverRepository.getSize()){
            driverRepository.delete(id);
            return true;
        }
        return false;
    }
    public void listedFromCSV(){
        DriverCSVServices driverCSVServices = DriverCSVServices.getInstance();
        List<Driver> drivers = new ArrayList<>(driverCSVServices.read());
        for(Driver driver: drivers){
            driverRepository.add(driver);
        }
    }
    public void listedInCSV(){
        DriverCSVServices driverCSVServices = DriverCSVServices.getInstance();
        DriverServices driverServices = new DriverServices();
        List<Driver> dr = new ArrayList<>(driverServices.getAllDrivers());
        for( Driver driver : dr){
            driverCSVServices.write(driver);
        }
    }
}
