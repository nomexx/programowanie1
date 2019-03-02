package SDAColectionPractice.Algorytmy.SortCwiczenie;

import java.util.*;

public class SiecSklepow {
    Map<String, Map<GatunekProduktu, List<Produkt>>>mapasklepow= new HashMap<>();

    public SiecSklepow(Map<String, Map<GatunekProduktu, List<Produkt>>> mapasklepow) {
        this.mapasklepow = mapasklepow;
    }

    public List<Produkt> znajdzProduktyKonkretnegoGatunkuKonkretnegoProducentaWDanymMiescie(GatunekProduktu gatunekProduktu, Producent producent, String miasto ){
        List<Produkt>listaTegoGowna= new ArrayList<>();
        List<Produkt> listaTegoGowna2= new ArrayList<>();
       if( mapasklepow.containsKey(miasto)){
           for  (Map.Entry<GatunekProduktu,List<Produkt>>wpis:mapasklepow.get(miasto).entrySet())
           listaTegoGowna.addAll(wpis.getValue());
           for (Produkt produkt: listaTegoGowna){
               if (produkt.getProducent().equals(producent)&& produkt.getGatunekProduktu().equals(gatunekProduktu))
               {
                   listaTegoGowna2.add(produkt);
               }
           }
       }return listaTegoGowna2;
    }
    public Set<Producent> znjadzProducentowDostepnychWDanymMiescie( String miasto){
        List<Produkt>listaTegoGowna= new ArrayList<>();
        Set<Producent>listaTegoGowna2= new HashSet<>();

        if (mapasklepow.containsKey(miasto)){
            for (Map.Entry<GatunekProduktu,List<Produkt>>wpis:mapasklepow.get(miasto).entrySet()){
            listaTegoGowna.addAll(wpis.getValue());
            for (Produkt produkt: listaTegoGowna){
                {
                    listaTegoGowna2.add(produkt.getProducent());
                }
            }
            }
        }return listaTegoGowna2;
    }
    public Set<String> znajdzSklepyWKtorychJestDanyProdukt(Produkt produkt) {
        Set<String> sklepy = new HashSet<>();
        for (Map.Entry<String, Map<GatunekProduktu, List<Produkt>>> wpis : mapasklepow.entrySet()) {
            for (Map.Entry<GatunekProduktu, List<Produkt>> wpis2 : wpis.getValue().entrySet()) {
                for (Produkt produkt1 : wpis2.getValue()) {
                    if (produkt1.equals(produkt)) {
                        sklepy.add(wpis.getKey());

                    }


                }
            }

        }return sklepy;
    }
    public static void main(String[] args) {
        Map<String,Map<GatunekProduktu,List<Produkt>>>mapasklepow=new HashMap<>();
        Sklep sklep = Sklep.sklep;
        Sklep sklep1= Sklep.sklep1;
        Sklep sklep2=Sklep.sklep2;
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
        sklep1.dodajProduktDoSklepu(umywalka);
        sklep1.dodajProduktDoSklepu(wanna);
        sklep1.dodajProduktDoSklepu(mlotek);
       // sklep2.dodajProduktDoSklepu(lepszymlotek);
        sklep2.dodajProduktDoSklepu(gwozdz);
        sklep2.dodajProduktDoSklepu(sruba);
        sklep2.dodajProduktDoSklepu(firanka);

        mapasklepow.put("Czestochowa",sklep.getMapaSklepu(sklep));
        mapasklepow.put("Katowice", sklep1.getMapaSklepu(sklep1));
        mapasklepow.put("Krakow",sklep2.getMapaSklepu(sklep2));
        SiecSklepow siecSklepow= new SiecSklepow(mapasklepow);
        System.out.println( siecSklepow.znajdzProduktyKonkretnegoGatunkuKonkretnegoProducentaWDanymMiescie(GatunekProduktu.METALOWE,Producent.PREMIUMPRODUCTS,"Czestochowa"));
        System.out.println();
        System.out.println(siecSklepow.znjadzProducentowDostepnychWDanymMiescie("Krakow"));
        System.out.println();

        System.out.println(siecSklepow.znajdzSklepyWKtorychJestDanyProdukt(mlotek));
}}
