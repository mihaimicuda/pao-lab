package ro.proiect;

import ro.proiect.Actions.Get;
import ro.proiect.Banca.*;
import ro.proiect.Enums.AccountTypes;
import ro.proiect.Enums.CardTypes;
import ro.proiect.Enums.CashTypes;
import ro.proiect.Helpers.Function;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Get SystemOperations = new Get();
        Banca BCR = new Banca("BCR");
        Client client1 = new Client("Mihnea-Valentin", "Popescu");
        Cont cont1 = new Cont(300, AccountTypes.Standard, CashTypes.EUR);
        Cont cont2 = new Cont(150, AccountTypes.Student, CashTypes.EUR);
        cont1.AddExtrasDeCont();
        TimeUnit.SECONDS.sleep(1);
        cont1.AddExtrasDeCont();
        client1.AddConturi(new ArrayList<Cont>(List.of(cont1, cont2)));

        Client client2 = new Client("Razvan-Florin", "Potcoveanu");
        cont1 = new Cont(300, AccountTypes.Standard, CashTypes.EUR, "RO1821378725");
        cont1.AddCard(new CreditCard("04312", new Date(Function.DateYear(2025), 5, 1)));
        cont1.AddCard(new DebitCard("5431", new Date(Function.DateYear(2024), 11, 25)));
        cont1.AddExtrasDeCont();
        cont2 = new Cont(15000, AccountTypes.Student, CashTypes.RON);
        client2.AddConturi(new ArrayList<Cont>(List.of(cont1, cont2)));
        BCR.AddClient(client1);
        BCR.AddClient(client2);
        System.out.println(BCR);
        System.out.println(SystemOperations.GetAccountsByCashType(BCR, CashTypes.RON));
        System.out.println(SystemOperations.GetAccountsByStoredCash(BCR, 0, 300));
        System.out.println(SystemOperations.GetClientByName(BCR, "Razvan-Florin", "Potcoveanu"));
        System.out.println(SystemOperations.GetContByIBAN(SystemOperations.GetClientByName(BCR, "Razvan-Florin", "Potcoveanu"), "RO1821378725"));
        System.out.println(SystemOperations.GetClientByIBAN(BCR, "RO1821378723"));
        System.out.println(SystemOperations.GetCardByType(cont1, CardTypes.CreditCard));
        System.out.println(SystemOperations.GetExtrasDeContBeforeDate(cont1, new Date(Function.DateYear(2023), 1, 1)));
    }
}
