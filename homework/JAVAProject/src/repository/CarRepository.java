package repository;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CarRepository implements RepositoryInterface<Car>{
    private static final List<Car> cars = new ArrayList<Car>();

    @Override
    public void add(Car entity) {
        cars.add(entity);
    }

    @Override
    public Car get(int id) {
        return cars.get(id);
    }

    @Override
    public void update(int index, Car entity) {
        cars.set(index,entity);
    }

    @Override
    public void delete(int index) {
        cars.remove(index);
    }

    @Override
    public int getSize() {
        return cars.size();
    }
}
