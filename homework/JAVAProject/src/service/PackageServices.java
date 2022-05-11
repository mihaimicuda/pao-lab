package service;

import exceptions.InvalidDataException;
import model.Package;
import repository.PackageRepository;
import service.csv.PackageCSVService;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PackageServices {
    private PackageRepository packageRepository = new PackageRepository();

    //  private Package aPackage = new Package();
    public List<Package> getAllPackages() {
        List<Package> packages = new ArrayList<>();
        for (int i = 0; i < packageRepository.getSize(); i++)
            packages.add(packageRepository.get(i));
        return packages;
    }

    public void addNewPackages(Package packages) throws InvalidDataException {
        if (packages == null)
            throw new InvalidDataException("Coletul nu exista");

        Package newColet = new Package(packages);
        packageRepository.add(newColet);
    }

    public void addNewPackages(String type, Float weightColet) throws InvalidDataException {
        if (type == null || type.equals(""))
            throw new InvalidDataException("tipColet invalid");

        if (weightColet < 0) throw new InvalidDataException("Cantitate invalida!");
        Package newPackage = new Package(type, weightColet);
        packageRepository.add(newPackage);
    }

    public void listedFromCSV() {
        PackageCSVService packageCSVService = PackageCSVService.getInstance();
        List<Package> packages = new ArrayList<>(packageCSVService.read());
        for (Package pack : packages) {
            packageRepository.add(pack);
        }
    }

    public void listedInCSV() {
        PackageCSVService csvService = PackageCSVService.getInstance();
        PackageServices packageServices = new PackageServices();
        List<Package> packages = new ArrayList<>(packageServices.getAllPackages());
        for(Package pack: packages){
            csvService.write(pack);
        }
    }
}
