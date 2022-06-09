package ro.unibuc.lab11.diplomas.repository;

import ro.unibuc.lab11.diplomas.model.Diploma;

import java.sql.SQLException;
import java.util.List;

public interface DiplomaRepository {

    void save(Diploma diploma) throws SQLException;

    List<Diploma> getAll();

}
