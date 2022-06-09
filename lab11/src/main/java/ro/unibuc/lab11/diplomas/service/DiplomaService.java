package ro.unibuc.lab11.diplomas.service;

import ro.unibuc.lab11.diplomas.model.Diploma;
import ro.unibuc.lab11.diplomas.repository.DiplomaDbRepository;
import ro.unibuc.lab11.diplomas.repository.DiplomaInMemoryRepository;
import ro.unibuc.lab11.diplomas.repository.DiplomaRepository;

import java.sql.SQLException;
import java.util.List;

public class DiplomaService {
    private DiplomaRepository diplomaRepository = new DiplomaDbRepository();

    public void save(Diploma diploma) throws SQLException {
        diplomaRepository.save(diploma);
    }

    public List<Diploma> getAll() {
        return diplomaRepository.getAll();
    }
}
