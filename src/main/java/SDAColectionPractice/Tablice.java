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

    }

}
