package SDAColectionPractice.Mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;



public class ZmianaKluczy {
    public static void main(String[] args) {

        Map<MutableString, String> zepsutaMapa = new HashMap<>();

        final String wartosc = "abc";

        final MutableString klucz = new MutableString(wartosc);
        zepsutaMapa.put(klucz,wartosc);

        System.out.println(zepsutaMapa.get(klucz));
        System.out.println(zepsutaMapa);

        klucz.set("def");
        System.out.println(zepsutaMapa.get(klucz));
        System.out.println(zepsutaMapa);


    }



private static class MutableString{
    private String wartosc;
    public MutableString(final String wartosc){
        set(wartosc);

    }
    public String get(){
        return wartosc;
    }
    public void set(final String wartosc){
        Objects.requireNonNull(wartosc);
        this.wartosc=wartosc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableString that = (MutableString) o;
        return Objects.equals(wartosc, that.wartosc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wartosc);
    }

    @Override
    public String toString() {
        return "MutableString{" +
                "wartosc='" + wartosc + '\'' +
                '}';
    }
}}
