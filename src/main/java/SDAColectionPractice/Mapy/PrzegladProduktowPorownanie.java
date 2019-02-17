package SDAColectionPractice.Mapy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PrzegladProduktowPorownanie {

    private static final int ITERACJA=5;
    private static final int LICZBA_PRODUKTOW=20000;

    private static final List<Produkt> produkty= generujProdukty();

    private static List<Produkt> generujProdukty(){
        final List<Produkt> produkts = new ArrayList<>();
        final Random generatorWagi= new Random();

        for (int i=0;i< LICZBA_PRODUKTOW; i++){
            produkts.add(new Produkt(i,"Produkt"+i,generatorWagi.nextInt(10)));
        }
        Collections.shuffle(produkts);
        Collections.shuffle(produkts);
        Collections.shuffle(produkts);

        return produkts;
    }

    public static void uruchomPrzeglad(final PrzegladProduktow przegladProduktow){
        for (int i=0; i<ITERACJA; i++){
            final long czasStart= System.currentTimeMillis();
            for (Produkt produkt: produkty){
                przegladProduktow.dodajProdukt(produkt);
            }

            for (Produkt produkt: produkty){
                final Produkt wynik= przegladProduktow.przejrzyjPoId(produkt.getId());
                if(wynik != produkt){
                    throw new IllegalStateException("Porownanie produktow zwrocilo zly wynik dla: "+ produkt);
                }
            }
            przegladProduktow.wyczysc();
            System.out.println(System.currentTimeMillis()-czasStart + "ms");
        }

    }


    public static void main(String[] args) {
        uruchomPrzeglad(new PrzegladProduktowLista());
        System.out.println("");
        uruchomPrzeglad(new PrzegladProduktowMapa());
    }
}
