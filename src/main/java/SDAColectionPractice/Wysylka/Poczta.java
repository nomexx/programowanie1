package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Poczta {

    private List<Produkt> produkts = new ArrayList<>();

    public void dodaj(Produkt produkt) {
        produkts.add(produkt);
    }

    public String toString() {
        return produkts.toString();
    }


    public void zamien(Produkt staryProdukt, Produkt nowyProdukt) {
        final int index = produkts.indexOf(staryProdukt);
        produkts.set(index, nowyProdukt);
    }


}