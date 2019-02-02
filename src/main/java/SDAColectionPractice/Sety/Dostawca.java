package SDAColectionPractice.Sety;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Dostawca {
    private String nazwa;
    private List<Produkt> listaProduktow= new ArrayList<>();

    public Dostawca(String nazwa){
        this.nazwa= nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public List<Produkt> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(List<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Dostawca{" +
                "nazwa='" + nazwa + '\'' +
                ", listaProduktow=" + listaProduktow +
                '}';
    }

}
