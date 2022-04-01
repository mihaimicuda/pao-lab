
/*
    Abstract class cannot be instantiated
    A class can be abstract with NO abstract methods
    BUT
    A class with even 1 abstract method HAS to be abstract
 */
public abstract class Angajat {

    int id;
    String nume;

    private String secret;

    String jobDesc;

    public Angajat() {
        super(); //toate clasele extind by default Object; se apeleaza implicit constructorul default al Object
    }

    public Angajat(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

//    public static Angajat(int id) {  -> constructor cannot be static
//
//    }

    public int getSalariu() {
        return 0;
    }

    public abstract String getJobDesc();

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
