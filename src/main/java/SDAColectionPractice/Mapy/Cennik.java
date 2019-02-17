package SDAColectionPractice.Mapy;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Cennik {

    private String nazwa;
    private int cena;

    public Cennik(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cennik cennik = (Cennik) o;
        return cena == cennik.cena &&
                Objects.equals(nazwa, cennik.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public String toString() {
        return "Cennik{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }

    public static void main(String[] args) {
Cennik chleb= new Cennik("chleb", 3);
Cennik maslo= new Cennik("maslo", 5);
Cennik whiskey= new Cennik("whiskey",40);
        Scanner scanner= new Scanner(System.in);
    Map<String,Integer>cennik = new HashMap<>();

    cennik.put(chleb.getNazwa(),chleb.getCena());
    cennik.put(maslo.getNazwa(),maslo.getCena());
    cennik.put(whiskey.getNazwa(),whiskey.getCena());
        String nazwa = "";
        String koniec="koniec";
    do{
        System.out.println("Podaj produkt ktorego cene chcesz poznac");
         nazwa = scanner.nextLine().toLowerCase();
       if(cennik.containsKey(nazwa)){
           System.out.println("Cena to: " +cennik.get(nazwa));
       }else {
           System.out.println("Nie znaleziono produktu");
       }


} while (!nazwa.equalsIgnoreCase(koniec));
    }
}
