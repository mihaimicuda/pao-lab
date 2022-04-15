package ro.unibuc.lab7.diplome;

import java.util.List;
import java.util.function.Predicate;

public interface DiplomaService {

    void save(Diploma diploma);

    Diploma getByAbsolvent(String absolvent);

    List<Diploma> getAll();

    List<Diploma> findDiplomasBetweenYears(int start, int end);

    List<Diploma> findAllByPerfectScore();

    void delete(Diploma diploma);

    List<Diploma> findByCustomFilter(Predicate<Diploma> filter);
}
