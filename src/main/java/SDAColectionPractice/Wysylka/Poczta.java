package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Poczta {
    private static final int PRODUKT_NIE_ISTNIEJE = -1;
    private static final int MAX_WAGA_MALY_BUS = 10;

    private List<Produkt> malyBusProdukty;
    private List<Produkt> duzyBusProdukty;

    private List<Produkt> produkts = new ArrayList<>();

    public List<Produkt> getMalyBusProdukty() {
        return malyBusProdukty;
    }

    public List<Produkt> getDuzyBusProdukty() {
        return duzyBusProdukty;
    }

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
            System.out.println("\n" + "Nie ma takiego produktu");
        }
    }

    public void przygotujPrzesylke() {
        // posortowac po wadze
        produkts.sort(Produkt.WAGAKOMPARATOR());
        //znalesc index od ktorego w duzym
        int indexPodzialu = podzial();
        // przypisac do busow
        malyBusProdukty= produkts.subList(0,indexPodzialu);
        duzyBusProdukty=produkts.subList(indexPodzialu,produkts.size());


    }

    private int podzial() {
        for (int i = 0; i < produkts.size(); i++) {
            if (produkts.get(i).getWaga() > MAX_WAGA_MALY_BUS) {
                return i;
            }
        }
        return 0;
    }

}