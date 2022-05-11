package service.csv;

import model.Car;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarCSVServices implements  GenericCSV<Car>{
    public static final CarCSVServices INSTANCE = new CarCSVServices();

    private CarCSVServices(){

    }
    public static CarCSVServices getInstance(){
        return INSTANCE;
    }

    @Override
    public List<Car> read(){
        List<Car> cars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/cars.csv"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                Car car = new Car(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3]);
                cars.add(car);
            }
        } catch (IOException ex) {
            System.out.println("Error reading from file!");
        }
        return cars;
    }
    @Override
    public void write(Car car){
        try(FileWriter fileWriter = new FileWriter("files/cars.csv",true)){
            fileWriter.write(car.getIdCar() + "," + car.getNoRegistration() + ","
            + car.getBrand()+ "," + car.getColor() + '\n');
            fileWriter.flush();

        }catch(IOException ex){
            System.out.println("Error writing to file!");
        }

    }
}
