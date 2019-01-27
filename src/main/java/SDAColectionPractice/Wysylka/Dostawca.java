package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Dostawca {
    private String nazwa;
    private List<Produkt>produkts= new ArrayList<>();

    public Dostawca(String nazwa){
        this.nazwa=nazwa;
    }
    public void setNazwa(){
        this.nazwa=nazwa;
    }
    public String getNazwa(){
        return nazwa;
    }
    public List<Produkt> produkts(){
        return produkts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dostawca{");
        sb.append("nazwa='").append(nazwa).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
