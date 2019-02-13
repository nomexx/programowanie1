package SDAColectionPractice.Pralnia;

import java.util.*;

public class Pralnia {
    public static final Comparator<Usluga> PO_MATERIALE = new Comparator<Usluga>() {

        @Override
        public int compare(Usluga o1, Usluga o2) {
            return o1.getUbranie().getMaterial().compareTo(o2.getUbranie().getMaterial());
        }
    };


    List<Usluga> uslugi = new ArrayList<>();
    PriorityQueue<Usluga> kolejkaUslug = new PriorityQueue<Usluga>(PO_MATERIALE);
  private static   Klient klient1 = new Klient("Jan", "Kowalski");
    private static Klient klient2 = new Klient("Dodzia", "Elektrodzia");
    private static  Ubranie ubranie1= new Ubranie(Material.BAWELNA, "Spodnie", "Bez");
    private static  Ubranie ubranie2= new Ubranie(Material.POLIESTER,"Koszula","Roz");
    private static    Ubranie ubranie3 = new Ubranie(Material.JEDWAB, "Stringi","Czarny");

    private static Usluga usluga1= new Usluga(klient1,ubranie1);
    private static Usluga usluga2= new Usluga(klient1,ubranie2);
    private static Usluga usluga3=new Usluga(klient1,ubranie3);
    private static Usluga usluga4=new Usluga(klient2,ubranie3);

    public void dodajUsluge(Usluga usluga) {
        uslugi.add(usluga);
        kolejkaUslug.offer(usluga);

    }

    public void wykonanoUsluge(Usluga usluga) {
        uslugi.remove(usluga);
        while (kolejkaUslug.poll() != null) {

            kolejkaUslug.remove(usluga);
        }

    }

    public void znajdzUslugeDlaKlienta(Ubranie ubranie) {
        for (Usluga usluga : uslugi) {
            if (usluga.getUbranie().equals(ubranie)) {
                System.out.println("Znaleziono usluge: " + usluga);
                break;
            } else {
                System.out.println("Nie znaleziono uslugi");
            }

        }

    }

    public void znajdzUslugeZMaterialem(Material material) {
        for (Usluga usluga : uslugi) {
            if (usluga.getUbranie().getMaterial().equals(material)) {
                System.out.println("Znaleziono usluge: " + usluga);
            }


        }
    }

    public void wykonajWszystkieUslugi(){
        for (Usluga usluga: kolejkaUslug){
            System.out.println("Wykonano: "+ usluga);
wykonanoUsluge(usluga);
    }
    }

    @Override
    public String toString() {
        return "Pralnia{" +
                "usluga=" + uslugi +
                '}';
    }

    public static void main(String[] args) {
        Pralnia pralnia= new Pralnia();

        pralnia.dodajUsluge(usluga1);
        pralnia.dodajUsluge(usluga2);
        pralnia.dodajUsluge(usluga3);
        pralnia.dodajUsluge(usluga4);
        System.out.println(pralnia);
        System.out.println("");
        pralnia.wykonanoUsluge(usluga3);
        System.out.println(pralnia);
        System.out.println("");
        pralnia.znajdzUslugeDlaKlienta(ubranie1);
        System.out.println("");

        pralnia.znajdzUslugeZMaterialem(Material.POLIESTER);

        System.out.println("");

        System.out.println(pralnia);

        pralnia.wykonajWszystkieUslugi();
        System.out.println("");

        System.out.println(pralnia);
    }}