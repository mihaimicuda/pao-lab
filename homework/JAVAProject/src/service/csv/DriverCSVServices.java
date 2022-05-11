package service.csv;

import model.Car;
import model.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DriverCSVServices implements GenericCSV<Driver> {
    public static final DriverCSVServices INSTANCE = new DriverCSVServices();

    private DriverCSVServices(){
    }
    public static DriverCSVServices getInstance(){return INSTANCE;}


    @Override
    public void write(Driver driver){
        try(FileWriter fileWriter = new FileWriter("files/drivers.csv",true)){
            fileWriter.write(driver.getIdDriver() + "," + driver.getCar() + " , " + '\n');
            fileWriter.flush();
        }catch (IOException EX){
            System.out.println("Error writing to file!");
        }

    }

    @Override
    public List<Driver> read(){
        List<Driver> drivers = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("files/drivers.csv"))){
            String l;
            while((l=bufferedReader.readLine())!=null){
                String[] drv = l.split(",");
                Car car = new Car(Integer.parseInt(drv[4]), drv[5],drv[6],drv[7]);
                Driver driver = new Driver(drv[0],drv[1],drv[2],Integer.parseInt(drv[3]),car);
                drivers.add(driver);
            }
        }catch (IOException  | ArrayIndexOutOfBoundsException a) {
            System.out.println("Error reading to file");
        }

        return drivers;
    }
}
