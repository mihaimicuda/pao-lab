package ro.proiect.Banca;

import ro.proiect.Enums.CashTypes;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Tranzactie {
    private final String _IBANDestinatar;
    private final Date _data;
    private final int _suma;
    private final CashTypes _tipValuta;
    private final UUID _id;

    public Tranzactie(String IBANDestinatar, Date data, int suma, CashTypes tipValuta) {
        this._IBANDestinatar = IBANDestinatar;
        this._data = data;
        this._suma = suma;
        this._tipValuta = tipValuta;
        this._id = UUID.randomUUID();
    }

    public Tranzactie(String IBANDestinatar, int suma, CashTypes tipValuta) {
        this(IBANDestinatar, new Date(), suma, tipValuta);
    }

    public Tranzactie(Tranzactie tranzactie) {
        this._IBANDestinatar = tranzactie._IBANDestinatar;
        this._data = tranzactie._data;
        this._suma = tranzactie._suma;
        this._tipValuta = tranzactie._tipValuta;
        this._id = tranzactie._id;
    }

    public UUID get_id() {
        return _id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tranzactie that = (Tranzactie) o;
        return _id.equals(that._id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id);
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "_IBAN='" + _IBANDestinatar + '\'' +
                ", _data=" + _data +
                ", _suma=" + _suma +
                ", _tipValuta=" + _tipValuta +
                ", _id=" + _id +
                '}';
    }

    public String get_IBANDestinatar() {
        return _IBANDestinatar;
    }

    public Date get_data() {
        return _data;
    }

    public int get_suma() {
        return _suma;
    }

    public CashTypes get_tipValuta() {
        return _tipValuta;
    }
}
