package SDAColectionPractice.Sety;

import java.util.*;

public class HashSetLearn {


      public static final Comparator<Osoba> PO_IMIENIU(){return Comparator.comparing(Osoba::getImie);}
    public SortedSet<Osoba> posortuj(Set<Osoba>osoby){
        SortedSet<Osoba> posortowaneOsoby= new TreeSet<>(PO_IMIENIU());
         posortowaneOsoby.addAll(osoby);
         return posortowaneOsoby;


        }

    public static void main(String[] args) {
    HashSetLearn hashSetLearn = new HashSetLearn();
        Set<Osoba> osoby = new HashSet<>();

        Osoba osoba1 = new Osoba("Mae", "Izea",33);
        osoby.add(new Osoba("Roman", "Giertych",33));
        osoby.add(osoba1);
        osoby.add(new Osoba("Rafal", "Maserak",33));
        osoby.add(new Osoba("Ireneusz", "Grzyb",33));
        osoby.add(new Osoba("Adam", "Adam",33));
        System.out.println(osoby.toString());
        System.out.println("");
        System.out.println(hashSetLearn.posortuj(osoby));
        System.out.println("");
        SortedSet<Osoba>posortowane = hashSetLearn.posortuj(osoby);
        SortedSet<Osoba> obetnij = posortowane.headSet(osoba1);
        osoby.removeAll(obetnij);
        System.out.println(osoby);




    }
}