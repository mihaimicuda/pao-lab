package ro.unibuc.lab.collections;

import java.util.Objects;

public class Angajat {
    int id;
    String nume;

    public Angajat(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angajat angajat = (Angajat) o;
        return id == angajat.id &&
                nume.equals(angajat.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }
}
