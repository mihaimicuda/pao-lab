package repository;

import model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements RepositoryInterface<Client> {
    List<Client> clienti = new ArrayList<>();

    @Override
    public void add(Client entity) {
        clienti.add(entity);
    }

    @Override
    public Client get(int id) {
        return clienti.get(id);
    }

    @Override
    public void delete(int index) {
        clienti.remove(index);
    }

    @Override
    public int getSize() {
        return clienti.size();
    }

    @Override
    public void update(int index, Client entity) {
        clienti.set(index, entity);
    }
}
