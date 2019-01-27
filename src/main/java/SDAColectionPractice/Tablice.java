package SDAColectionPractice;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {


        Produkt drzwi = new Produkt("Drzwi debowe", 30);
        Produkt okno = new Produkt("okno drewniane", 15);


        Produkt[] produkty = {drzwi, okno};

        System.out.println("");
        System.out.println(produkty);
        System.out.println("");
        System.out.println(Arrays.toString(produkty));


        Produkt panel=new Produkt("Panel debowy",2);
        //produkty[2]=panel;
        produkty= dodajProdukt(produkty,panel);


        System.out.println("");
        System.out.println(Arrays.toString(produkty));

    }

    private static Produkt[] dodajProdukt(Produkt[] produkty,Produkt produkt) {
        int dlugosc= produkty.length;
        Produkt[] nowaTablica=Arrays.copyOf(produkty,dlugosc+1);
        nowaTablica[dlugosc]=produkt;
        return nowaTablica;
    }

}
