package SDAColectionPractice.Bibliotek;

import java.util.ArrayList;
import java.util.List;

public class Polka {
    private int nrPolki;
    private List<Ksiazka> polka = new ArrayList<>();

    public Polka(int nrPolki) {
        this.nrPolki = nrPolki;
    }



    public int getNrPolki() {
        return nrPolki;
    }

    public void setNrPolki(int nrPolki) {
        this.nrPolki = nrPolki;
    }
    public List<Ksiazka>ksiazki(){
        return polka;
    }


    @Override
    public String toString() {
        return "\n"+ "Polka{" +
                "nrPolki=" + nrPolki +
                ", polka=" + polka +
                '}';
    }
    public  List<Ksiazka> getListaKsiazek(){
        return  polka;
    }
}
