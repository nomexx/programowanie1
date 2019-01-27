package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Poczta {

    private List<Produkt> produkts= new ArrayList<>();

    public void dodaj(Produkt produkt) {
        produkts.add(produkt);
    }
}