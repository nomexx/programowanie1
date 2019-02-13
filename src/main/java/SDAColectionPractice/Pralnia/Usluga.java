package SDAColectionPractice.Pralnia;

public class Usluga {
   private final Klient klient;
 private final   Ubranie ubranie;

    public Usluga(Klient klient, Ubranie ubranie) {
        this.klient = klient;
        this.ubranie = ubranie;
    }


    public Klient getKlient() {
        return klient;
    }

    public Ubranie getUbranie() {
        return ubranie;
    }

    @Override
    public String toString() {
        return "Usluga{" +
                "klient=" + klient +
                ", ubranie=" + ubranie +
                '}';
    }
}

