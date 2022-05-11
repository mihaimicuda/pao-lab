package repository;

import model.Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PackageRepository implements RepositoryInterface<Package>{
    private static final List<Package> packages = new ArrayList<Package>();

    @Override
    public void add(Package entity){
        packages.add(entity);
    }

    @Override
    public Package get(int id) {
        return packages.get(id);
    }

    @Override
    public void update(int index, Package entity) {
        packages.set(index,entity);
    }

    @Override
    public void delete(int index) {
        packages.remove(index);
    }

    @Override
    public int getSize() {
        return packages.size();
    }
}

