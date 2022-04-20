package ro.unibuc.lab7.diplome;

public class MultipleDiplomaException extends RuntimeException {
    public MultipleDiplomaException(String absolvent) {
        super(absolvent + " has multiple diplomas");
    }
}
