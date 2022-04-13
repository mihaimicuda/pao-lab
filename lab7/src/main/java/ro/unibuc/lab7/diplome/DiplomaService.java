package ro.unibuc.lab7.diplome;

import java.util.List;

public interface DiplomaService {

    void save(Diploma diploma);

    Diploma getByAbsolvent(String absolvent);

    List<Diploma> getAll();

    List<Diploma> findDiplomasBetweenYears(int start, int end);

    List<Diploma> findAllByPerfectScore();
}
