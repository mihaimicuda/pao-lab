package ro.unibuc.lab10.diplomas.repository;

import ro.unibuc.lab10.diplomas.model.Diploma;

import java.util.List;

public interface DiplomaRepository {

    void save(Diploma diploma);

    List<Diploma> getAll();

}
