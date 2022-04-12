package ro.unibuc.lab6.diplome;

public interface DiplomaService {

    void save(Diploma diploma);

    Diploma getByAbsolvent(String absolvent);
}
