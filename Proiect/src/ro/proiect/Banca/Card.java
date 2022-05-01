package ro.proiect.Banca;

import ro.proiect.Enums.CardTypes;
import ro.proiect.Helpers.Checkers;
import ro.proiect.Interfaces.Icard;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Card implements Icard {

    protected final UUID _id;
    protected final Date _expirationDate;
    protected String _PIN;
    protected CardTypes _tip = CardTypes.Unknown;

    public CardTypes get_tip() {
        return _tip;
    }

    public Card(String PIN, Date expirationDate) {
        Checkers.CheckProperty(PIN, x -> x.length() > 3, "PIN length too short");
        this._PIN = PIN;
        this._id = UUID.randomUUID();
        this._expirationDate = expirationDate;
    }

    public Card(Card card) {
        Checkers.CheckProperty(card._PIN, x -> x.length() > 3, "PIN length too short");
        this._PIN = card._PIN;
        this._id = card._id;
        this._expirationDate = card._expirationDate;
    }

    public void Pay(int value) {

    }

    public int GetAllowance() {
        return -1;
    }

    public void Charge(int value) {

    }

    public String get_PIN() {
        return _PIN;
    }

    public void set_PIN(String _PIN) {
        this._PIN = _PIN;
    }

    public Date get_expirationDate() {
        return _expirationDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "_PIN='" + _PIN + '\'' +
                ", _id=" + _id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return _id.equals(card._id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_id);
    }

    public Card Clone() {
        return new Card(this);
    }

    public UUID get_id() {
        return _id;
    }
}
