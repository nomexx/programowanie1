package SDAColectionPractice.Wysylka;

import SDAColectionPractice.Produkt;

public class PocztaTest {

    Produkt drzwi = new Produkt("Drzwi", 30);
    Produkt okno = new Produkt("okno", 15);
    Produkt panel = new Produkt("panel", 2);
    Produkt deska = new Produkt("deska", 1);

    private Poczta poczta = new Poczta();

    public void dodajProdukt() {
        poczta.dodaj(okno);
        poczta.dodaj(drzwi);
        System.out.println("I test/ " + "\n" + poczta);
    }

    public void zamianaProduktu() {
        poczta.zamien(okno, panel);
        System.out.println("II test: " + "\n" + poczta);

    }

    public void zamianaBrakujacegoProduktu() {
        poczta.zamien(deska, okno);
        System.out.println("III test: " + "\n" + poczta);
    }

    public void podzialNaAuta(){
        Poczta pocztaBusy= new Poczta();
        pocztaBusy.dodaj(okno);
        pocztaBusy.dodaj(deska);
        pocztaBusy.dodaj(panel);
        pocztaBusy.dodaj(drzwi);


        pocztaBusy.przygotujPrzesylke();

        System.out.println("IV test: "+"\n"+"zawartosc malego busa"+ pocztaBusy.getMalyBusProdukty());
        System.out.println("zawartosc duzego busa"+pocztaBusy.getDuzyBusProdukty());
    }

    public static void main(String[] args) {
        PocztaTest pocztaTest = new PocztaTest();
        pocztaTest.dodajProdukt();
        pocztaTest.zamianaProduktu();
        pocztaTest.zamianaBrakujacegoProduktu();
        pocztaTest.podzialNaAuta();
    }

}
