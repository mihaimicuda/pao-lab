package ro.unibuc.lab10.diplomas.repository;

import ro.unibuc.lab10.diplomas.model.Diploma;

import java.util.ArrayList;
import java.util.List;

public class DiplomaInMemoryRepository implements DiplomaRepository {

    private List<Diploma> diplomas = new ArrayList<>();

    @Override
    public void save(Diploma diploma) {
        diplomas.add(diploma);
    }

    @Override
    public List<Diploma> getAll() {
        return diplomas;
    }
}
