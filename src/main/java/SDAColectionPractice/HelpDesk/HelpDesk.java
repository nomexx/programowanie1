package SDAColectionPractice.HelpDesk;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HelpDesk {

    public static final Comparator<Zgloszenie> WG_KATEGORII = new Comparator<Zgloszenie>() {
        @Override
        public int compare(Zgloszenie o1, Zgloszenie o2) {
            return o1.getKategoria().compareTo(o2.getKategoria());
        }
    };
    private final Queue<Zgloszenie> zgloszenia = new PriorityQueue<>(WG_KATEGORII);


    //   private final Queue<Zgloszenie> zgloszenia = new ArrayDeque<>();

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.zgloszenie(Klient.AGATA, Kategoria.KOMPUTER);
        helpDesk.zgloszenie(Klient.JACEK, Kategoria.TELEFON);
        helpDesk.zgloszenie(Klient.AGNIESZKA, Kategoria.DRUKARKA);

//        helpDesk.procesujZgloszeniaDrukarek();
//        helpDesk.procesujZgloszeniaGeneralne();
//        helpDesk.procesujZgloszeniaGeneralne();
//        helpDesk.procesujZgloszeniaDrukarek();
//        helpDesk.procesujZgloszeniaDrukarek();
        helpDesk.procesujWszystkieeZgloszenia();
    }

    public void zgloszenie(final Klient klient, final Kategoria kategoria) {
        zgloszenia.offer(new Zgloszenie(klient, kategoria));
    }

//    public void procesujZgloszeniaDrukarek() {
//        final Zgloszenie zgloszenie = zgloszenia.peek();
//        if (zgloszenie != null && zgloszenie.getKategoria() == Kategoria.DRUKARKA) {
//            zgloszenia.remove();
//            zgloszenie.getKlient().odpowiedz("Czy nie skonczyl sie papier");
//
//        } else {
//            System.out.println("Nie ma zgloszen");
//        }
//    }


//    public void procesujZgloszeniaGeneralne() {
//        final Zgloszenie zgloszenie = zgloszenia.peek();
//        if (zgloszenie != null && zgloszenie.getKategoria() != Kategoria.DRUKARKA) {
//            zgloszenia.remove();
//            zgloszenie.getKlient().odpowiedz("Czy probowales wlaczyc i wylaczyc?");
//
//        } else {
//            System.out.println("Nie ma zgloszen");
//        }
//    }

    public void procesujWszystkieeZgloszenia() {
        Zgloszenie zgloszenie;
        while ((zgloszenie = zgloszenia.poll()) != null) {
            if (zgloszenie.getKlient().getPlec().equalsIgnoreCase("M"))
                zgloszenie.getKlient().odpowiedz("Czy probowales wlaczyc i wylaczyc?");
            else {
                zgloszenie.getKlient().odpowiedz("Czy probowalas wlaczyc i wylaczyc?");

            }

        }
    }

}
