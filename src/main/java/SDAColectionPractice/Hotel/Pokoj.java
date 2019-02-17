package SDAColectionPractice.Hotel;

import java.util.Objects;

public class Pokoj {
    private int numer;
    private Standard standard;

    public Pokoj(int numer, Standard standard) {
        this.numer = numer;
        this.standard = standard;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokoj pokoj = (Pokoj) o;
        return numer == pokoj.numer &&
                standard == pokoj.standard;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numer, standard);
    }

    @Override
    public String toString() {
        return "Pokoj{" +
                "numer=" + numer +
                ", standard=" + standard +
                '}';
    }
}
