package ro.proiect.Banca;

import ro.proiect.Enums.AccountTypes;
import ro.proiect.Enums.CashTypes;
import ro.proiect.Helpers.Checkers;

import java.util.*;
import java.util.stream.Collectors;

public class Cont extends DateCont {
    private static final int _IBANLength = 10;
    public final ArrayList<Tranzactie> _tranzactii = new ArrayList<Tranzactie>();
    private final String _IBAN;
    private final TreeSet<ExtrasDeCont> _extraseDeCont = new TreeSet<ExtrasDeCont>();
    private final HashSet<Card> _carduri = new HashSet<Card>();

    public Cont(AccountTypes tipCont, CashTypes tipValuta) {
        this(0, tipCont, tipValuta);
    }

    public Cont(Cont cont) {
        super(cont._sumaStocata, cont._tipCont, cont._tipValuta);
        this._IBAN = cont._IBAN;
        for (ExtrasDeCont extrasDeCont : cont._extraseDeCont) {
            this._extraseDeCont.add(new ExtrasDeCont(extrasDeCont));
        }
        for (Tranzactie tranzactie : cont._tranzactii) {
            this._tranzactii.add(new Tranzactie(tranzactie));
        }
        for (Card card : cont._carduri) {
            this._carduri.add(new Card(card));
        }
    }

    public Cont(int sumaStocata, AccountTypes tipCont, CashTypes tipValuta) {
        super(sumaStocata, tipCont, tipValuta);
        this._IBAN = "RO" + genIBAN();
    }

    public Cont(int sumaStocata, AccountTypes tipCont, CashTypes tipValuta, String IBAN) {
        super(sumaStocata, tipCont, tipValuta);
        Checkers.CheckProperty(IBAN, x -> x.length() != 10 && x.startsWith("RO"), "Incorrect IBAN format");
        this._IBAN = IBAN;
    }

    public HashSet<Card> get_carduri() {
        return _carduri;
    }

    public TreeSet<ExtrasDeCont> get_extraseDeCont() {
        return _extraseDeCont;
    }

    public String get_IBAN() {
        return _IBAN;
    }

    private String genIBAN() {
        char[] array = new Random().ints(Cont._IBANLength, '0', '9' + 1)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining())
                .toCharArray();
        return new String(array);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cont cont = (Cont) o;
        return _IBAN.equals(cont._IBAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_IBAN);
    }

    public int compareTo(DateCont o) {
        if (this.GetEur() > o.GetEur())
            return 1;
        else if (this.GetEur() < o.GetEur())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "_IBAN='" + _IBAN + '\'' +
                ", _extraseDeCont=" + _extraseDeCont +
                ", _carduri=" + _carduri +
                ", _sumaStocata=" + _sumaStocata +
                ", _tipCont=" + _tipCont +
                ", _tipValuta=" + _tipValuta +
                '}';
    }

    public void AddCard(Card card) {
        this._carduri.add(card.Clone());
    }

    public void RemoveCard(Card card) {
        this._carduri.remove(card);
    }

    public void AddTranzacite(Tranzactie tranzactie) {
        this._tranzactii.add(new Tranzactie(tranzactie));
    }

    public void RemoveTranzactie(Tranzactie tranzactie) {
        this._tranzactii.remove(tranzactie);
    }

    public void AddExtrasDeCont() {
        this._extraseDeCont.add(new ExtrasDeCont(this._sumaStocata, this._tipCont, this._tipValuta, new Date()));
    }

    public void AddExtrasDeCont(ExtrasDeCont extrasDeCont) {
        this._extraseDeCont.add(new ExtrasDeCont(extrasDeCont));
    }

    public void AddExtraseDeCont(Iterable<ExtrasDeCont> extraseDeCont) {
        for (ExtrasDeCont extrasDeCont : extraseDeCont) {
            this.AddExtrasDeCont(extrasDeCont);
        }
    }

    public void RemoveExtrasDeCont(ExtrasDeCont extrasDeCont) {
        this._extraseDeCont.remove(extrasDeCont);
    }

    public void RemoveExtraseDeCont(Iterable<ExtrasDeCont> extraseDeCont) {
        for (ExtrasDeCont extrasDeCont : extraseDeCont) {
            this.RemoveExtrasDeCont(extrasDeCont);
        }
    }

}
