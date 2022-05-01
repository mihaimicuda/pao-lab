package ro.proiect.Banca;

import java.util.ArrayList;
import java.util.Objects;

public class Banca {
    private final ArrayList<Client> _clienti = new ArrayList<Client>();
    private String _nume;

    public Banca(String _nume) {
        this._nume = _nume;
    }

    public String get_nume() {
        return _nume;
    }

    public void set_nume(String _nume) {
        this._nume = _nume;
    }

    @Override
    public String toString() {
        return "Banca{" +
                "_nume='" + _nume + '\'' +
                ", _clienti=" + _clienti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banca banca = (Banca) o;
        return _nume.equals(banca._nume) && _clienti.equals(banca._clienti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_nume);
    }

    public ArrayList<Client> get_clienti() {
        return _clienti;
    }

    public void AddClient(Client client) {
        this._clienti.add(new Client(client));
    }

    public void RemoveClient(Client client) {
        this._clienti.remove(client);
    }
}
