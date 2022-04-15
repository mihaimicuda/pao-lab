package ro.unibuc.lab7.diplome;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DiplomaInMemoryService implements DiplomaService {

    List<Diploma> diplome = new ArrayList<>();

    @Override
    public void save(Diploma diploma) {
        diplome.add(diploma);
    }

    @Override
    public Diploma getByAbsolvent(String absolvent) {
        List<Diploma> diplomeAbsolvent = diplome.stream()
                .filter(diploma -> diploma.getAbsolvent().equals(absolvent))
                .collect(Collectors.toList());

        if(diplomeAbsolvent.size() > 1) {
            throw new MultipleDiplomaException(absolvent);
        } else if(diplomeAbsolvent.size() == 0) {
            return null;
        }

        return diplomeAbsolvent.get(0);
    }

    @Override
    public List<Diploma> getAll() {
        return diplome;
    }

    @Override
    public List<Diploma> findDiplomasBetweenYears(int start, int end) {
        return null;
    }

    @Override
    public List<Diploma> findAllByPerfectScore() {
        return null;
    }

    @Override
    public void delete(Diploma diploma) {

    }

    @Override
    public List<Diploma> findByCustomFilter(Predicate<Diploma> filter) {
        return null;
    }
}
