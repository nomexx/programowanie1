package SDAColectionPractice.KolejkiPraktyka;

import java.util.ArrayList;
import java.util.List;

public class Komis {
    Myjnia myjnia = new Myjnia();
    public void umyjAuta(){
        myjnia.UmyjWszystkieAuta(samochodList);
    }

    Samochod auto1 = new Samochod("VW", "Passat", 2002, 9000);
    Samochod auto2 = new Samochod("Peugeot", "207", 1999, 4000);
    Samochod auto3 = new Samochod("Mercedes", "SLK", 2012, 49000);
    Samochod auto4 = new Samochod("Honda", "Civic", 2015, 100000);
    Samochod auto5 = new Samochod("Opel", "Corsa", 1998, 2500);

    List<Samochod> samochodList = new ArrayList<>();

    public static void main(String[] args) {
        Komis komis = new Komis();
        komis.dodajAuta();
        komis.listaAut();
        System.out.println("");
        komis.znajdzDoOkreslonejKwoty(10000);
        System.out.println("");
        komis.znajdzDoOkreslonejMarki("VW");
        System.out.println("");
        komis.znajdzDoOkreslonejMarkiIModelu("Mercedes", "KlassA");
        System.out.println("");
        komis.kupionoAuto();
        komis.listaAut();
        System.out.println("");
        komis.szukajPrzedzial(5000,50000);
        System.out.println("");
        komis.umyjAuta();
    }

    public void dodajAuta() {
        samochodList.add(auto1);
        samochodList.add(auto2);
        samochodList.add(auto3);
        samochodList.add(auto4);
        samochodList.add(auto5);

    }

    public void znajdzDoOkreslonejKwoty(int cena) {
        System.out.println("Sukaj cena ");
        for (Samochod auto : samochodList) {
            if (auto.getCena() < cena) {
                System.out.println(auto);
            }
        }
    }

    public void znajdzDoOkreslonejMarki(String marka) {
        System.out.println("Sukaj marka ");
        for (Samochod auto : samochodList) {
            if (auto.getMarka().equalsIgnoreCase(marka)) {
                System.out.println(auto);
            }
        }
    }

    public void znajdzDoOkreslonejMarkiIModelu(String marka, String model) {
        System.out.println("Sukaj marka i model");
        for (Samochod auto : samochodList) {
            if (auto.getMarka().equalsIgnoreCase(marka) && auto.getModel().equalsIgnoreCase(model)) {
                System.out.println(auto);
            }
            }
        }

    public void kupionoAuto() {
        samochodList.remove(auto2);

    }

    public void listaAut() {
        for (Samochod auto : samochodList) {
            System.out.println(auto);
        }
    }
    public void szukajPrzedzial(int cenaMin, int cenaMax){
        for (Samochod auto : samochodList){
            if (auto.getCena()>cenaMin && auto.getCena()<cenaMax){
                System.out.println(auto);
            }
        }
    }
}
