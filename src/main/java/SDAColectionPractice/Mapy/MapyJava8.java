package SDAColectionPractice.Mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyJava8 {
    public static void main(String[] args) {


        Produkt drzwi = new Produkt(1, "Drzwi", 25);
        Produkt okno = new Produkt(2, "Okno", 15);
        Produkt panel = new Produkt(3, "Panel", 5);
        Produkt deska = new Produkt(4, "Deska", 3);
        Produkt domyslny = new Produkt(-1, "Krokwia", 40);


        Map<Integer, Produkt> mapaProdukty = new HashMap<>();
        mapaProdukty.put(drzwi.getId(), drzwi);
        mapaProdukty.put(okno.getId(), okno);
        mapaProdukty.put(panel.getId(), panel);
        mapaProdukty.put(deska.getId(), deska);


        Produkt produkt = mapaProdukty.get(10);
        System.out.println(produkt);
        Produkt produktDomyslny = mapaProdukty.getOrDefault(10, domyslny);
        System.out.println();
        System.out.println(produktDomyslny);
        System.out.println();
        System.out.println(mapaProdukty);
        System.out.println();
        Produkt wynik = mapaProdukty.replace(1, new Produkt(1, "Duze drzwi", 30));
        System.out.println(wynik);
        System.out.println();
        System.out.println(mapaProdukty);
        System.out.println();

        Produkt wynik2 = mapaProdukty.replace(5, new Produkt(1, "Duze drzwi", 40));
        System.out.println(wynik2);
        System.out.println(mapaProdukty.get(5));

        mapaProdukty.replaceAll((id, staryProdukt) -> new Produkt(staryProdukt.getId(), staryProdukt.getNazwa(), staryProdukt.getWaga() + 10));

        System.out.println(mapaProdukty);
        System.out.println();

        Produkt nieobecny = mapaProdukty.computeIfAbsent(10, (id) -> new Produkt(10, "Nowy produkt", 10));
        System.out.println(nieobecny);
        System.out.println();
        System.out.println(mapaProdukty);
        System.out.println();

        Produkt obecny = mapaProdukty.computeIfAbsent(2, (id) -> new Produkt(10, "Nowy", 10));
        System.out.println(obecny);
        System.out.println();
        System.out.println(mapaProdukty);
        System.out.println();

        mapaProdukty.forEach((klucz,wartosc)-> System.out.println(klucz+" "+wartosc));


    }
}
