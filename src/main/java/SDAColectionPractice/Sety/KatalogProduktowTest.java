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
        zbyszek.getListaProduktow().add(okno);
        roman.getListaProduktow().add(panel);
        roman.getListaProduktow().add(deska);
    }

}
