package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Poczta {
    public static final int PRODUKT_NIE_ISTNIEJE= -1;

    private List<Produkt> produkts = new ArrayList<>();

    public void dodaj(Produkt produkt) {
        produkts.add(produkt);
    }

    public String toString() {
        return produkts.toString();
    }


    public void zamien(Produkt staryProdukt, Produkt nowyProdukt) {
        final int index = produkts.indexOf(staryProdukt);
        if (index != PRODUKT_NIE_ISTNIEJE) {
            produkts.set(index, nowyProdukt);
        } else {
            System.out.println("\n"+"Nie ma takiego produktu");
        }
    }

}