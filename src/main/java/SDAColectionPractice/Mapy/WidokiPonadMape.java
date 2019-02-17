package SDAColectionPractice.Mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WidokiPonadMape {
    public static void main(String[] args) {


        Produkt drzwi = new Produkt(1, "Drzwi", 25);
        Produkt okno = new Produkt(2, "Okno", 15);
        Produkt panel = new Produkt(3, "Panel", 5);
        Produkt deska = new Produkt(4, "Deska", 3);
        Produkt krokwia = new Produkt(5, "Krokwia", 40);

        Map<Integer, Produkt> mapaProduktow = new HashMap<>();
        mapaProduktow.put(drzwi.getId(), drzwi);
        mapaProduktow.put(okno.getId(), okno);
        mapaProduktow.put(panel.getId(), panel);
        mapaProduktow.put(deska.getId(), deska);
        mapaProduktow.put(krokwia.getId(), krokwia);

        System.out.println(mapaProduktow);
        System.out.println();


        Set<Integer> ids = mapaProduktow.keySet();
        System.out.println(ids);

        ids.remove(1);
        System.out.println(ids);

        System.out.println(mapaProduktow);
        System.out.println();

        // ids.add(4); ----> tu jest blad
        // System.out.println(mapaProduktow);

        Set<Map.Entry<Integer, Produkt>> wpisy = mapaProduktow.entrySet();
        for (Map.Entry<Integer, Produkt> wpis : wpisy) {
            System.out.println(wpis.getKey() + "-->" + wpis.getValue());
        }
        System.out.println();

        //     for (Map.Entry<Integer,Produkt>wpis : wpisy){
        //        wpis.setValue(drzwi);
        //      System.out.println(wpis.getKey()+ "-->"+ wpis.getValue());
        //  }

        System.out.println();




    }


}


