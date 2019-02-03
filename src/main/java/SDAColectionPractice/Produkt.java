package SDAColectionPractice;

import java.util.Comparator;
import java.util.Objects;

public class Produkt {
    private String nazwa;
    private int waga;

    public Produkt(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return waga == produkt.waga &&
                Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, waga);
    }

    //   public Comparator<Produkt>WZGLEDEM_WAGI = new Comparator<Produkt>() {
//        @Override
//        public int compare(Produkt p1, Produkt p2) {
//            return p1.getWaga()<p2.getWaga()? -1:1;
//        }
//    };
    public static final Comparator<Produkt> WAGAKOMPARATOR() {
        return Comparator.comparing(Produkt::getWaga);
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWaga(
    ) {
        return waga;

    }

    public void setNazwa() {
        this.nazwa = nazwa;
    }

    public void setWaga() {
        this.waga = waga;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produkt{");
        sb.append("nazwa='").append(nazwa).append('\'');
        sb.append(", waga=").append(waga);
        sb.append('}');
        return sb.toString();
    }
}
