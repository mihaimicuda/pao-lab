package ro.proiect.Banca;

import ro.proiect.Enums.AccountTypes;
import ro.proiect.Enums.CashTypes;

import java.util.Date;
import java.util.Objects;

public class ExtrasDeCont extends DateCont {

    private final Date _data;

    public ExtrasDeCont(int _sumaStocata, AccountTypes _tipCont, CashTypes _tipValuta, Date data) {
        super(_sumaStocata, _tipCont, _tipValuta);
        this._data = data;
    }

    public ExtrasDeCont(ExtrasDeCont extrasDeCont) {
        super(extrasDeCont._sumaStocata, extrasDeCont._tipCont, extrasDeCont._tipValuta);
        this._data = extrasDeCont._data;
    }

    public Date get_data() {
        return _data;
    }

    @Override
    public String toString() {
        return "ExtrasDeCont{" +
                "_sumaStocata=" + _sumaStocata +
                ", _tipCont=" + _tipCont +
                ", _tipValuta=" + _tipValuta +
                ", _data=" + _data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExtrasDeCont that = (ExtrasDeCont) o;
        return _data.equals(that._data) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_data);
    }

    public int compareTo(DateCont o) {
        try {
            if (this._data.compareTo(((ExtrasDeCont) o)._data) < 0)
                return 1;
            else if (this._data.compareTo(((ExtrasDeCont) o)._data) > 0)
                return -1;
            return 0;
        } catch (ClassCastException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
