package SDAColectionPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void main(String[] args) {


        Produkt drzwi = new Produkt("Drzwi debowe", 30);
        Produkt okno = new Produkt("okno drewniane", 15);
        Produkt panel = new Produkt("Panel debowy", 2);

        Collection<Produkt> produkty = new ArrayList<>();
        produkty.add(drzwi);
        produkty.add(okno);
        produkty.add(panel);

        Iterator<Produkt> iterator= produkty.iterator();

        while (iterator.hasNext()){
            Produkt produkt= iterator.next();

            if (produkt.getWaga() >= 15) {
                System.out.println(produkt);
            } else {
                iterator.remove();
            }
        }



    }
}