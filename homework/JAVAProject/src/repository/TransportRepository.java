package repository;

import model.Transport;

import java.util.ArrayList;
import java.util.List;

public class TransportRepository implements RepositoryInterface<Transport> {

    List<Transport> transports = new ArrayList<>();
    @Override
    public void add(Transport entity) {
        transports.add(entity);
    }

    @Override
    public Transport get(int id) {
        return transports.get(id);
    }

    @Override
    public void update(int index, Transport entity) {
        transports.set(index,entity);
    }

    @Override
    public void delete(int index) {
        transports.remove(index);
    }

    @Override
    public int getSize() {
        return transports.size();
    }
}
