package repository;

import model.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DriverRepository implements RepositoryInterface<Driver> {
    private static final List<Driver> drivers = new ArrayList<Driver>();

    @Override
    public void add(Driver entity) {
        drivers.add(entity);
    }

    @Override
    public Driver get(int id) {
        return drivers.get(id);
    }

    @Override
    public void update(int index, Driver entity) {
        drivers.set(index, entity);
    }

    @Override
    public void delete(int index) {
        drivers.remove(index);
    }

    @Override
    public int getSize() {
        return drivers.size();
    }
}
