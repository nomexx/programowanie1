package SDAColectionPractice.Algorytmy;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usprawniena {
    public static void main(String[] args) {
        List<Produkt> produkts = new ArrayList<>();

        Produkt drzwi =new Produkt("Drzwi",40);
        Produkt okno=new Produkt("Okno",20);
        Produkt panel =new Produkt("Panel",5);
        Produkt deska=new Produkt("Deska",10);

        Collections.addAll(produkts,panel,okno,deska,drzwi);

        System.out.println(produkts);
        System.out.println();


        Produkt min =Collections.min(produkts,Produkt.WAGAKOMPARATOR());
        System.out.println(min);



    }
}
