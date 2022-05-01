package ro.proiect.Banca;

import ro.proiect.Enums.AccountTypes;
import ro.proiect.Enums.CashTypes;

public abstract class DateCont implements Comparable<DateCont> {
    protected int _sumaStocata;
    protected AccountTypes _tipCont;
    protected CashTypes _tipValuta;

    public DateCont(int _sumaStocata, AccountTypes _tipCont, CashTypes _tipValuta) {
        this._sumaStocata = _sumaStocata;
        this._tipCont = _tipCont;
        this._tipValuta = _tipValuta;
    }

    public int getSumaStocata() {
        return _sumaStocata;
    }

    public void setSumaStocata(int sumaStocata) {
        this._sumaStocata = sumaStocata;
    }

    public AccountTypes getTipCont() {
        return _tipCont;
    }

    public void setTipCont(AccountTypes tipCont) {
        this._tipCont = tipCont;
    }

    public CashTypes getTipValuta() {
        return _tipValuta;
    }

    public void setTipValuta(CashTypes tipValuta) {
        this._tipValuta = tipValuta;
    }

    public float GetEur() {
        return this._sumaStocata * this._tipValuta.value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DateCont dateCont = (DateCont) o;
        return _sumaStocata == dateCont._sumaStocata && _tipCont == dateCont._tipCont && _tipValuta == dateCont._tipValuta;
    }

}
