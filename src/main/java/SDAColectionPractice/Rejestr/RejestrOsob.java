package SDAColectionPractice.Rejestr;

import SDAColectionPractice.Sety.Osoba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RejestrOsob {
    List<Osoba> listaOsob = new ArrayList<>();

    public void dodajOsobe(Osoba osoba) {
        listaOsob.add(osoba);
    }

    public void usunOsobe(Osoba osoba) {
        listaOsob.remove(osoba);

    }

    public void wypiszOsoby() {
        Iterator<Osoba> iterator = listaOsob.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public Osoba znajdzOsobePoNazwisku(String nazwisko) {
        for (Osoba osoba : listaOsob) {
            if (osoba.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return osoba;

            }
        }
        System.out.println("Nie znaleziono takiej osoby");
        return null;
    }
    public int avg(){
        int wiekSuma=0;
        for (Osoba osoba: listaOsob){
           wiekSuma =wiekSuma+osoba.getWiek();

        }wiekSuma= wiekSuma/listaOsob.size();
        return wiekSuma;
    }

    public Osoba min(){
        Osoba najmlodszy= listaOsob.get(0);
        for(Osoba osoba: listaOsob){
            if(osoba.getWiek()<najmlodszy.getWiek()){
                najmlodszy = osoba;
            }
        }return najmlodszy;
    }
    public Osoba max(){
        Osoba najstarszy= listaOsob.get(0);
        for(Osoba osoba: listaOsob){
            if(osoba.getWiek()>najstarszy.getWiek()){
                najstarszy = osoba;
            }
        }return najstarszy;
    }

    public String toString() {
        return listaOsob.toString();
    }


}

