package ro.unibuc.collections;

public class Pisica implements Comparable<Pisica>{

    String nume;
    int varsta;
    int greutate;

    public Pisica(String nume, int varsta, int greutate) {
        this.nume = nume;
        this.varsta = varsta;
        this.greutate = greutate;
    }

    @Override
    public int compareTo(Pisica o) {
//        return this.varsta - o.varsta;
        if(this.nume.compareTo(o.nume) == 0) {
            return this.varsta - o.varsta;
        }

        return this.nume.compareTo(o.nume);
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", greutate=" + greutate +
                '}';
    }
}
