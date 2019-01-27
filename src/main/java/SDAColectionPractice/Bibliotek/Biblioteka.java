package SDAColectionPractice.Bibliotek;

import java.util.List;

public class Biblioteka {

    public void dodajKsiazki(Polka polka, Ksiazka ksiazka) {
//        List<Ksiazka> ksiazkaList = polka.ksiazki();  to samo co na dole tylko rozwiniete
//        ksiazkaList.add(ksiazka);

       polka.ksiazki().add(ksiazka);

    }
    public String wypiszZawartosc(Polka polka){
        return polka.toString();
    }



}

