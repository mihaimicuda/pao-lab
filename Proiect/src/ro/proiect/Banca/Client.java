package ro.proiect.Banca;

import ro.proiect.Enums.GenderTypes;

import java.util.Date;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;

public class Client {
    private final Date _dateOfBirth;
    private final UUID _id;
    private String _firstName;
    private String _lastName;
    private GenderTypes _gender;
    private final TreeSet<Cont> _conturi = new TreeSet<Cont>();

    public Client() {
        this("", "", new Date(), GenderTypes.Unspecified);
    }

    public Client(String _firstName, String _lastName) {
        this(_firstName, _lastName, new Date(), GenderTypes.Unspecified);
    }

    public Client(Client client) {
        this._firstName = client._firstName;
        this._lastName = client._lastName;
        this._dateOfBirth = client._dateOfBirth;
        this._gender = client._gender;
        this._id = UUID.randomUUID();
        for (Cont cont : client._conturi) {
            this._conturi.add(new Cont(cont));
        }
    }

    public Client(String _firstName, String _lastName, Date _dateOfBirth, GenderTypes _gender) {
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._dateOfBirth = _dateOfBirth;
        this._gender = _gender;
        this._id = UUID.randomUUID();
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public Date get_dateOfBirth() {
        return _dateOfBirth;
    }

    public GenderTypes get_gender() {
        return _gender;
    }

    public void set_gender(GenderTypes _gender) {
        this._gender = _gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return _id.equals(client._id);
    }

    public TreeSet<Cont> get_conturi() {
        return _conturi;
    }

    @Override
    public String toString() {
        return "Client{" +
                "_firstName='" + _firstName + '\'' +
                ", _lastName='" + _lastName + '\'' +
                ", _dateOfBirth=" + _dateOfBirth +
                ", _gender=" + _gender +
                ", _id=" + _id +
                ", _conturi=" + _conturi +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id);
    }

    public UUID get_id() {
        return _id;
    }

    public void AddCont(Cont cont) {
        this._conturi.add(new Cont(cont));
    }

    public void AddConturi(Iterable<Cont> conturi) {
        for (Cont cont : conturi) {
            this.AddCont(cont);
        }
    }

    public void RemoveConturi(Iterable<Cont> conturi) {
        for (Cont cont : conturi) {
            this.RemoveCont(cont);
        }
    }

    public void RemoveCont(Cont cont) {
        this._conturi.remove(cont);
    }

}
