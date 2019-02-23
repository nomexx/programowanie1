package SDAColectionPractice.Algorytmy;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortowanie {

    public static void main(String[] args) {
        List<Produkt> produkts = new ArrayList<>();

        produkts.add(new Produkt("Drzwi",40));
        produkts.add(new Produkt("Okno",20));
        produkts.add(new Produkt("Panel",5));
        produkts.add(new Produkt("Deska",10));

        System.out.println(produkts);
        System.out.println();
       // Collections.sort(produkts,Produkt.WAGAKOMPARATOR());
        System.out.println(produkts);

        produkts.sort(Produkt.WAGAKOMPARATOR());
        System.out.println(produkts);
    }
}
