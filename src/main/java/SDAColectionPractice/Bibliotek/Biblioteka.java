package SDAColectionPractice.Bibliotek;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private static final int PRODUKT_NIE_ISTNIEJE = -1;

    List<Ksiazka> ksiazka = new ArrayList<>();


    public void dodajKsiazki(Polka polka, Ksiazka ksiazka) {
//        List<Ksiazka> ksiazkaList = polka.ksiazki();  to samo co na dole tylko rozwiniete
//        ksiazkaList.add(ksiazka);

        polka.ksiazki().add(ksiazka);

    }

    public String wypiszZawartosc(Polka polka) {
        return polka.toString();
    }

    public void przelozKsiazke(Polka staraPolka, Ksiazka ksiazkaPrzeloz, Polka nowaPolka) {
        ksiazka = staraPolka.getListaKsiazek();
        ksiazka.remove(ksiazkaPrzeloz);
        ksiazka = nowaPolka.getListaKsiazek();
        ksiazka.add(ksiazkaPrzeloz);
    }

    public void oproznijPolke(Polka polka) {
        polka.getListaKsiazek().clear();

    }

    public int liczbaKsiazeknaPolce(Polka polka) {
        int liczbaKsiazeknaPolce = polka.getListaKsiazek().size();
        return liczbaKsiazeknaPolce;
    }

    public int nrPozycjinaPolce(Ksiazka ksiazka1, Polka polka) {
        ksiazka = polka.getListaKsiazek();
        int miejsceNaPolce = ksiazka.indexOf(ksiazka1);
        return miejsceNaPolce + 1;

    }
    public void usunKilkaKsiazek(Polka polka,int start, int koniec){
        ksiazka= polka.getListaKsiazek();
        List<Ksiazka> usun=ksiazka.subList(start,koniec);
        ksiazka.removeAll(usun);

    }

}

