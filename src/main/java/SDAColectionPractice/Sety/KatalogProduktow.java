package SDAColectionPractice.Sety;

import SDAColectionPractice.Produkt;

import java.util.*;

public class KatalogProduktow {


    public final SortedSet<Produkt> produkty = new TreeSet<>(Produkt.WAGAKOMPARATOR());

    public void zapewnianyPrzez(Dostawca dostawca) {
        produkty.addAll(dostawca.getListaProduktow());
    }
public Set<Produkt> malyVan(){
        Produkt najciezszyWMalymVanie = najciezszyWMalymVanie();
        return produkty.headSet(najciezszyWMalymVanie);

}
public Set<Produkt> duzyVan(){
        return produkty.tailSet(najciezszyWMalymVanie());
}

    private Produkt najciezszyWMalymVanie() {
        for(Produkt produkt: produkty){
            if (produkt.getWaga()>20){
                return produkt;
            }

        }return produkty.last();

    }

}
