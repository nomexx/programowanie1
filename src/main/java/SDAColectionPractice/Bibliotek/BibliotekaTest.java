package SDAColectionPractice.Bibliotek;

public class BibliotekaTest {
    Ksiazka malyKsiaze = new Ksiazka("St.Exuperie", "Maly Ksiaze");
    Ksiazka wPustyniIWDzungli = new Ksiazka("Siekiewicz", "W pustyni i w puszczy");
    Ksiazka oUfo = new Ksiazka("Swir z zone 21", "O UFO");
    Ksiazka czegoNie = new Ksiazka("Stieg Larsson", "Mężczyźni, którzy nienawidzą kobiet");
    Ksiazka ksiazeMgly = new Ksiazka("Carlos Ruiz Zafón", "Książę Mgły");
    Ksiazka choryPortier= new Ksiazka("Kelly Rower","Chory Portier");

    Polka no1 = new Polka(1);
    Polka no2 = new Polka(2);

    private Biblioteka biblioteka= new Biblioteka();

    public void dodanieNaPolke(){
        biblioteka.dodajKsiazki(no1,malyKsiaze);
        biblioteka.dodajKsiazki(no1,wPustyniIWDzungli);
        biblioteka.dodajKsiazki(no2, oUfo);
        biblioteka.dodajKsiazki(no2,choryPortier);
        biblioteka.dodajKsiazki(no1,czegoNie);
        biblioteka.dodajKsiazki(no1,ksiazeMgly);

     //   System.out.println("Test I :" + no1+ "\n"+no2 );

    }
    public void wypiszZawartosc(){
        System.out.println("II test: "+ biblioteka.wypiszZawartosc(no1)+"\n"+ biblioteka.wypiszZawartosc(no2));
    }


    public static void main(String[] args) {
        BibliotekaTest bibliotekaTest= new BibliotekaTest();
        bibliotekaTest.dodanieNaPolke();
        bibliotekaTest.wypiszZawartosc();

;;
    }
}
