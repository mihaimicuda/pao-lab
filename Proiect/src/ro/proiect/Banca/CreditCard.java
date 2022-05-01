package ro.proiect.Banca;

import ro.proiect.Enums.CardTypes;
import ro.proiect.Helpers.Checkers;

import java.util.Date;

public class CreditCard extends Card {
    private final static int _creditLimit = 500;
    private int _credit;

    public CreditCard(String PIN, Date expirationDate, int _credit) {
        super(PIN, expirationDate);
        this._credit = _credit;
        this._tip = CardTypes.CreditCard;
    }

    public CreditCard(String PIN, Date expirationDate) {
        this(PIN, expirationDate, 0);
    }

    public CreditCard(CreditCard card) {
        super(card);
        this._credit = card._credit;
        this._tip = CardTypes.CreditCard;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "_PIN='" + _PIN + '\'' +
                ", _id=" + _id +
                ", _expirationDate=" + _expirationDate +
                ", _credit=" + _credit +
                '}';
    }

    @Override
    public void Pay(int value) {
        Checkers.CheckProperty(CreditCard._creditLimit - this._credit, value, (x, y) -> x >= y, "Surpassing credit limit");
        this._credit += value;
    }

    @Override
    public void Charge(int value) {
        this._credit -= value;
    }

    @Override
    public int GetAllowance() {
        return CreditCard._creditLimit - this._credit;
    }

    @Override
    public Card Clone() {
        return new CreditCard(this);
    }
}
