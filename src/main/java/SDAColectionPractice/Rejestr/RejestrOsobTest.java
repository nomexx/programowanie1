package SDAColectionPractice.Rejestr;

import SDAColectionPractice.Sety.Osoba;

import java.util.ArrayList;
import java.util.List;

public class RejestrOsobTest {
    Osoba osoba1= new Osoba("Jan","Nowak",40);
    Osoba osoba2= new Osoba("Kazik","Kazik", 23);
    Osoba osoba3= new Osoba("Anna","Mucha",22);
    Osoba osoba4 = new Osoba("Krzysztof","Krawczyk",55);
    Osoba osoba5= new Osoba("Anna", "Gie", 55);
    Osoba osoba6 = new Osoba("Zenek", "Martyniuk", 66);

RejestrOsob rejestrOsob = new RejestrOsob();
    public void addPersons(){
        rejestrOsob.dodajOsobe(osoba1);
        rejestrOsob.dodajOsobe(osoba2);
        rejestrOsob.dodajOsobe(osoba3);
        rejestrOsob.dodajOsobe(osoba4);
        rejestrOsob.dodajOsobe(osoba5);
        rejestrOsob.dodajOsobe(osoba6);



        System.out.println("Test I : "+ rejestrOsob);
    }
    public void removePersons(){
        rejestrOsob.usunOsobe(osoba3);
        System.out.println("\n"+"Test II :"+ rejestrOsob);
    }
    public void wyswietlListe(){
        System.out.println("\n"+"Test III :");
        rejestrOsob.wypiszOsoby();
    }
    public void znajdzPoNazwisku(){
        System.out.println("\n"+"Test IV :");
        System.out.println( rejestrOsob.znajdzOsobePoNazwisku("Krawczyk"));
        System.out.println("\n"+"Test V :");
        System.out.println( rejestrOsob.znajdzOsobePoNazwisku("Banan"));
    }
    public void sredniaWieku (){
        System.out.println("Test VI :");
        System.out.println( rejestrOsob.avg());

    }
    public void najmlodszy(){
        System.out.println("Test VII:");
        System.out.println(rejestrOsob.min());
    }
    public void najstarszy(){
        System.out.println("Test VIII:");
        System.out.println(rejestrOsob.max());
    }

    public static void main(String[] args) {
        RejestrOsobTest rejestrOsobTest= new RejestrOsobTest();
        rejestrOsobTest.addPersons();
        rejestrOsobTest.removePersons();
        rejestrOsobTest.wyswietlListe();
        rejestrOsobTest.znajdzPoNazwisku();
        rejestrOsobTest.sredniaWieku();
        rejestrOsobTest.najmlodszy();
        rejestrOsobTest.najstarszy();
    }
}