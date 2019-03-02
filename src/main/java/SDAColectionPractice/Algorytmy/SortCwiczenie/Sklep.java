package SDAColectionPractice.Algorytmy.SortCwiczenie;

import java.util.*;

public class Sklep {
    Comparator<Produkt> BY_CENA = new Comparator<Produkt>() {
        @Override
        public int compare(Produkt o1, Produkt o2) {
            if (o1.getCena() < o2.getCena()) {
                return -1;
            }
            if (o1.getCena() == o2.getCena()) {
                return 0;
            } else {
                return 1;
            }
        }
    };

    public Sklep() {
    }
   static   Sklep  sklep1=new Sklep("Katowice");
   static Sklep sklep2=new Sklep("Krakow");
   static Sklep sklep= new Sklep("Czestochowa");


    String miasto;
   private final Queue<Produkt> kolejkaProduktow = new PriorityQueue<Produkt>(BY_CENA);
  private   Map<GatunekProduktu, List<Produkt>> mapaSklepu = new HashMap<>();

    public void dodajProduktDoSklepu(Produkt produkt) {
        if (!mapaSklepu.containsKey(produkt.getGatunekProduktu())) {
            List<Produkt> listaProduktow = new ArrayList<>();
            listaProduktow.add(produkt);
            mapaSklepu.put(produkt.getGatunekProduktu(), listaProduktow);
        } else {
            List<Produkt> listIstniejacychProduktow = mapaSklepu.get(produkt.getGatunekProduktu());
            listIstniejacychProduktow.add(produkt);
            // mapaSklepu.put(produkt.getGatunekProduktu(),listIstniejacychProduktow);
        }
        kolejkaProduktow.offer(produkt);
    }

    public void usunProduktZeSklepu(Produkt produkt) {
        if (mapaSklepu.containsKey(produkt.getGatunekProduktu())) {
            List<Produkt> listaproduktow = mapaSklepu.get(produkt.getGatunekProduktu());
            listaproduktow.remove(produkt);
        }
        if (kolejkaProduktow != null && kolejkaProduktow.contains(produkt)) {
            kolejkaProduktow.remove(produkt);

        }

    }

    public List<Produkt> zwrocWszystkieDostepneProduktyDanegoProducenta(Producent producent) {

        List<Produkt> listaProducenta = new ArrayList<>();
        for (Map.Entry<GatunekProduktu,List<Produkt>>wpis: mapaSklepu.entrySet()){
            for (Produkt produkt: wpis.getValue()){
                if (produkt.getProducent().equals(producent)){
                    listaProducenta.add(produkt);
                }
            }
        }
        return listaProducenta;
    }

    public Map<GatunekProduktu, List<Produkt>> getMapaSklepu(Sklep sklep) {
        return mapaSklepu;
    }

    public List<Produkt> zwrocWszystkieProduktyDanegoGatunku(GatunekProduktu gatunekProduktu) {
        if (mapaSklepu.containsKey(gatunekProduktu)) {
            return mapaSklepu.get(gatunekProduktu);
        } else {
            return null;
        }
    }

    public List<Produkt> zwrocWszystkieProduktyDanegoGatunkuDoDanejCeny(GatunekProduktu gatunekProduktu, int cena) {
        List<Produkt> doceny = new ArrayList<>();
        if (mapaSklepu.containsKey(gatunekProduktu)) {
            for (Produkt produkt : mapaSklepu.get(gatunekProduktu)) {
                if (produkt.getCena() <= cena) {
                    doceny.add(produkt);
                }
            }
            return doceny;
        }
        else {
            return null;
        }



    }
    public Produkt wypiszWszystkieProduktyWgCeny(){
        while (kolejkaProduktow.iterator().hasNext()){
            System.out.println( kolejkaProduktow.poll());
        }return null;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "BY_CENA=" + BY_CENA +
                ", miasto='" + miasto + '\'' +
                ", kolejkaProduktow=" + kolejkaProduktow +
                ", mapaSklepu=" + mapaSklepu +
                '}';
    }

    public Sklep(String miasto) {
        this.miasto = miasto;
    }

    public static void main(String[] args) {
        Produkt umywalka = new Produkt(GatunekProduktu.CERAMIKA,"umywalka",Producent.TOPEX,329.99);
        Produkt wanna = new Produkt(GatunekProduktu.CERAMIKA,"wanna",Producent.PREMIUMPRODUCTS,499.99);
        Produkt mlotek = new Produkt(GatunekProduktu.NARZEDZIA,"mlotek",Producent.TOPEX,29.99);
        Produkt lepszymlotek = new Produkt(GatunekProduktu.NARZEDZIA,"Lepszy mlotek",Producent.STALEX,39.99);
        Produkt gwozdz = new Produkt(GatunekProduktu.METALOWE,"gwozdz",Producent.PREMIUMPRODUCTS,0.99);
        Produkt sruba = new Produkt(GatunekProduktu.METALOWE,"sruba",Producent.STALEX,1.49);
        Produkt firanka = new Produkt(GatunekProduktu.TEKSTYLIA,"firanka",Producent.PREMIUMPRODUCTS,89);



        sklep.dodajProduktDoSklepu(umywalka);
        sklep.dodajProduktDoSklepu(wanna);
        sklep.dodajProduktDoSklepu(mlotek);
        sklep.dodajProduktDoSklepu(lepszymlotek);
        sklep.dodajProduktDoSklepu(gwozdz);
        sklep.dodajProduktDoSklepu(sruba);
        sklep.dodajProduktDoSklepu(firanka);
        System.out.println();
        sklep.usunProduktZeSklepu(new Produkt(GatunekProduktu.METALOWE,"Nowy",Producent.STALEX,1));
        sklep.usunProduktZeSklepu(gwozdz);
        System.out.println(sklep.zwrocWszystkieDostepneProduktyDanegoProducenta(Producent.STALEX));
        System.out.println();
        System.out.println( sklep.zwrocWszystkieProduktyDanegoGatunkuDoDanejCeny(GatunekProduktu.CERAMIKA,450));
        System.out.println();
        System.out.println(sklep.zwrocWszystkieProduktyDanegoGatunku(GatunekProduktu.NARZEDZIA));
        System.out.println();
        System.out.println("Produkty:" +sklep.wypiszWszystkieProduktyWgCeny());



        sklep1.dodajProduktDoSklepu(umywalka);
        sklep1.dodajProduktDoSklepu(wanna);
        sklep1.dodajProduktDoSklepu(mlotek);
        sklep2.dodajProduktDoSklepu(lepszymlotek);
        sklep2.dodajProduktDoSklepu(gwozdz);
        sklep2.dodajProduktDoSklepu(sruba);
        sklep2.dodajProduktDoSklepu(firanka);




    }
}
