package SDAColectionPractice.Mapy;

import java.util.HashMap;
import java.util.Map;

public class PrzegladProduktowMapa implements PrzegladProduktow {

    Map<Integer,Produkt>mapaProduktow= new HashMap<>();
    @Override
    public void dodajProdukt(Produkt produkt) {
        if (mapaProduktow.containsKey(produkt.getId()))
        { throw new IllegalArgumentException("Nie mozna dodac produktu"+ produkt +" bo to dubel");}
         mapaProduktow.put(produkt.getId(),produkt);
    }

    @Override
    public Produkt przejrzyjPoId(int id) {
     return  mapaProduktow.get(id);
    }

    @Override
    public void wyczysc() {
        mapaProduktow.clear();

    }
}
