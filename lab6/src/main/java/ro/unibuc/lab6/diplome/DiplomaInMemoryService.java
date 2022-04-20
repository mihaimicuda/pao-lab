package ro.unibuc.lab6.diplome;

import java.util.ArrayList;
import java.util.List;
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
}
