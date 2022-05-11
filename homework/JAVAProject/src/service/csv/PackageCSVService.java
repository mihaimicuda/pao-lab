package service.csv;

import model.Package;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PackageCSVService implements GenericCSV<Package> {
    public static final PackageCSVService INSTANCE = new PackageCSVService();

    public PackageCSVService() {
    }
    public static PackageCSVService getInstance(){ return INSTANCE;}

    @Override
    public void write(Package packages){
        try(FileWriter fileWriter = new FileWriter("files/packages.csv",true)){
            fileWriter.write(packages.gettype()+ "," + packages.getweightColet() + '\n');
            fileWriter.flush();
        }catch (IOException ex){
            System.out.println("Error writing to file");
        }catch (NumberFormatException n ){
            System.out.println("number wrong");
        }
    }

    @Override
    public List<Package> read() {
        List<Package> packages = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/packages.csv"))) {
            String l;
            while ((l = bufferedReader.readLine()) != null) {
                String[] pack = l.split(",");
                Package packag = new Package(pack[0], Float.parseFloat(pack[1]));
                packages.add(packag);
            }
        } catch (IOException | NumberFormatException EX) {
            System.out.println("Error reading from file!");
        }
        return packages;
    }
}
