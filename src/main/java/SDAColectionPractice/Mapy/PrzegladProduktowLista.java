package SDAColectionPractice.Mapy;

import java.util.ArrayList;
import java.util.List;

public class PrzegladProduktowLista implements PrzegladProduktow {


    List<Produkt>listaProduktow= new ArrayList<>();
    @Override
    public void dodajProdukt(Produkt produkt) {
        for(Produkt produkty : listaProduktow){
            if (produkty.getId() == produkt.getId()){
                throw new  IllegalArgumentException("Nie mozna dodac produktu"+ produkt+ " bo to duplikat");
            }
        }
        listaProduktow.add(produkt);
    }

    @Override
    public Produkt przejrzyjPoId(int id) {
        for (Produkt produkt : listaProduktow){
            if( produkt.getId() == id){
                return produkt;

            }

        }
      return null;
    }

    @Override
    public void wyczysc() {
        listaProduktow.clear();

    }}
