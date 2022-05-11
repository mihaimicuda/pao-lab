package service;

import exceptions.InvalidDataException;
import model.Car;
import repository.CarRepository;
import service.csv.CarCSVServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CarServices {
    CarRepository carRepository = new CarRepository();

    public List<Car> getAllCars(){
        List<Car> masini = new ArrayList<>();
        for( int i = 0;i<carRepository.getSize();i++)
            masini.add(carRepository.get(i));
        return masini;
    }

    public void addNewCar(Car car) throws InvalidDataException {
        if(car == null)
            throw new InvalidDataException("Car nu exista");

        Car newCar = new Car(car);
        carRepository.add(newCar);
    }
    public void addNewCar(Integer idCar, String noRegistration, String brand, String color ) throws InvalidDataException{
        if(idCar == null || idCar.equals("")) throw new InvalidDataException("idCar invalid");
        if(noRegistration== null || noRegistration.equals(""))
            throw new InvalidDataException("noRegistrationinvalid");
        if(brand == null || brand.equals("")) throw new InvalidDataException("brand invalida");

        if(color == null || brand.equals("")) throw new InvalidDataException("Culoare invalida");


        Car newCar = new Car(idCar,noRegistration,brand,color);
        carRepository.add(newCar);
    }
    public void listedFromCSV(){
        CarCSVServices carCSVServices = CarCSVServices.getInstance();
        List<Car> cars = new ArrayList<>(carCSVServices.read());
        for(Car car : cars){
            carRepository.add(car);
        }
    }

    public void listedInCSV(){
        CarCSVServices carCSVServices = CarCSVServices.getInstance();
        CarServices carServices = new CarServices();
        List<Car> cars = new ArrayList<>(carServices.getAllCars());
        for(Car car: cars){
            carCSVServices.write(car);
        }
    }
}
