package repository;

import model.DeliveryCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CompanyRepository implements RepositoryInterface<DeliveryCompany>{
    private static final List<DeliveryCompany> companies = new ArrayList<DeliveryCompany>();

    @Override
    public void add(DeliveryCompany entity) {
        companies.add(entity);
    }

    @Override
    public DeliveryCompany get(int id) {

        return companies.get(id);
    }

    @Override
    public void update(int index,DeliveryCompany entity) {

        companies.set(index,entity);
    }

    @Override
    public void delete(int index) {
        companies.remove(index);
    }

    @Override
    public int getSize() {
        return companies.size();
    }
}
