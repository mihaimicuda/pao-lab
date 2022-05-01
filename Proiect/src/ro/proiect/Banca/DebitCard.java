package ro.proiect.Banca;

import ro.proiect.Enums.CardTypes;
import ro.proiect.Helpers.Checkers;

import java.util.Date;

public class DebitCard extends Card {
    private int _debit;

    public DebitCard(String PIN, Date expirationDate, int _debit) {
        super(PIN, expirationDate);
        this._debit = _debit;
        this._tip = CardTypes.DebitCard;
    }

    public DebitCard(String PIN, Date expirationDate) {
        this(PIN, expirationDate, 0);
    }

    public DebitCard(DebitCard card) {
        super(card);
        this._debit = card._debit;
        this._tip = CardTypes.DebitCard;
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "_PIN='" + _PIN + '\'' +
                ", _id=" + _id +
                ", _expirationDate=" + _expirationDate +
                ", _debit=" + _debit +
                '}';
    }

    @Override
    public void Pay(int value) {
        Checkers.CheckProperty(_debit, value, (x, y) -> x >= y, "Insufficient funds");
        this._debit -= value;
    }

    @Override
    public void Charge(int value) {
        this._debit += value;
    }

    @Override
    public int GetAllowance() {
        return this._debit;
    }

    @Override
    public Card Clone() {
        return new DebitCard(this);
    }
}
