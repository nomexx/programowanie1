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
    /* Metoda z klasycznym for
     for(int i=0;i<produkty.size();i++){
            if (((ArrayList<Produkt>)produkty).get(i).getWaga()>=15){
                System.out.println(((ArrayList<Produkt>)produkty).get(i));
            }else {
                produkty.remove(i);
            }

        }   */
        System.out.println(produkty.size());
        System.out.println(produkty.isEmpty());
        System.out.println(produkty.contains(panel));
        System.out.println(produkty.contains(drzwi));

        Collection<Produkt> nowaListe= new ArrayList<>();
        nowaListe.add(okno);
        nowaListe.add(drzwi);


        produkty.removeAll(nowaListe);
        System.out.println(produkty);
        System.out.println(produkty.isEmpty());


    }
}