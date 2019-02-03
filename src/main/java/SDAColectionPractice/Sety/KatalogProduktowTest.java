package SDAColectionPractice.Sety;

import SDAColectionPractice.Produkt;

public class KatalogProduktowTest {
    public static Produkt drzwi = new Produkt("Drzwi", 30);
    public static Produkt okno = new Produkt("okno", 15);
    public static Produkt panel = new Produkt("panel", 2);
    public static Produkt deska = new Produkt("deska", 1);

    public static Dostawca zbyszek= new Dostawca("Zbysiu");
    public static Dostawca roman= new Dostawca("Romus");

    static {
        zbyszek.getListaProduktow().add(drzwi);
        zbyszek.getListaProduktow().add(drzwi);
        zbyszek.getListaProduktow().add(new Produkt("Drzwi", 30));
        zbyszek.getListaProduktow().add(panel);
        roman.getListaProduktow().add(panel);
        roman.getListaProduktow().add(drzwi);
        roman.getListaProduktow().add(deska);
        zbyszek.getListaProduktow().add(okno);
    }


    public static void main(String[] args) {
        KatalogProduktow katalogProduktow= new KatalogProduktow();
        System.out.println( zbyszek.getListaProduktow());
        katalogProduktow.zapewnianyPrzez(zbyszek);
      //  katalogProduktow.zapewnianyPrzez(roman);
        System.out.println(katalogProduktow.produkty);
        System.out.println(katalogProduktow.malyVan());
        System.out.println(katalogProduktow.duzyVan());
    }

}
