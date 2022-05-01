package ro.proiect.Actions;

import ro.proiect.Banca.*;
import ro.proiect.Enums.CardTypes;
import ro.proiect.Enums.CashTypes;

import java.util.*;
import java.util.stream.Collectors;

public class Get {
    public Iterable<Client> GetClientsByFirstName(Banca banca, String firstName) {
        List<Client> clienti = banca.get_clienti();
        return clienti.stream().filter(x -> x.get_firstName().equals(firstName)).collect(Collectors.toList());
    }

    public Iterable<Client> GetClientsByLastName(Banca banca, String lastName) {
        List<Client> clienti = banca.get_clienti();
        return clienti.stream().filter(x -> x.get_lastName().equals(lastName)).collect(Collectors.toList());
    }

    public Iterable<Client> GetClientsByName(Banca banca, String firstName, String lastName) {
        List<Client> clienti = banca.get_clienti();
        return clienti.stream().filter(x -> x.get_lastName().equals(lastName) && x.get_firstName().equals(firstName)).collect(Collectors.toList());
    }

    public Client GetClientByName(Banca banca, String firstName, String lastName) {
        List<Client> clienti = banca.get_clienti();
        Optional<Client> client = clienti.stream().filter(x -> x.get_lastName().equals(lastName) && x.get_firstName().equals(firstName)).findFirst();
        if (client.isPresent())
            return client.get();
        return null;
    }

    public Iterable<Cont> GetAccountsByCashType(Banca banca, CashTypes tipValuta) {
        List<Client> clienti = banca.get_clienti();
        List<Cont> conturiReturnate = new ArrayList<Cont>();
        for (Client client : clienti) {
            TreeSet<Cont> conturi = client.get_conturi();
            conturiReturnate.addAll(conturi.stream().filter(x -> x.getTipValuta() == tipValuta).collect(Collectors.toList()));
        }
        return conturiReturnate;
    }

    public Iterable<Cont> GetAccountsByStoredCash(Banca banca, int lowerLimit, int upperLimit) {
        List<Client> clienti = banca.get_clienti();
        List<Cont> conturiReturnate = new ArrayList<Cont>();
        for (Client client : clienti) {
            TreeSet<Cont> conturi = client.get_conturi();
            conturiReturnate.addAll(conturi.stream().filter(x -> x.GetEur() >= lowerLimit && x.GetEur() <= upperLimit).collect(Collectors.toList()));
        }
        return conturiReturnate;
    }

    public Cont GetContByIBAN(Client client, String IBAN) {
        TreeSet<Cont> conturi = client.get_conturi();
        Optional<Cont> cont = conturi.stream().filter(x -> x.get_IBAN().equals(IBAN)).findFirst();
        return cont.isPresent() ? cont.get() : null;
    }

    public Client GetClientByIBAN(Banca banca, String IBAN) {
        Optional<Client> client = banca.get_clienti().stream().filter(x -> GetContByIBAN(x, IBAN) != null).findFirst();
        return client.isPresent() ? client.get() : null;
    }

    public Iterable<Card> GetCardByType(Cont cont, CardTypes type) {
        return cont.get_carduri().stream().filter(x -> x.get_tip().equals(type)).collect(Collectors.toList());
    }

    public Iterable<ExtrasDeCont> GetExtrasDeContBeforeDate(Cont cont, Date date) {
        return cont.get_extraseDeCont().stream().filter(x -> x.get_data().before(date)).collect(Collectors.toList());
    }

    public Iterable<ExtrasDeCont> GetExtrasDeContAfterDate(Cont cont, Date date) {
        return cont.get_extraseDeCont().stream().filter(x -> x.get_data().after(date)).collect(Collectors.toList());
    }
}
