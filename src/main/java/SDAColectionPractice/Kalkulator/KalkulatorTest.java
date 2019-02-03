package SDAColectionPractice.Kalkulator;

public class KalkulatorTest {
    Kalkulator kalkulator = new Kalkulator();
    String wejscie = "5 + 3 + 5 - 10 - 34 ";
    public int oblicz(String wejscie){
       int wynik= kalkulator.oblicz(wejscie);
       return wynik;
    }

    public static void main(String[] args) {
        KalkulatorTest kalkulatorTest = new KalkulatorTest();
        String wejscie = "5 + 3 + 5 - 10 - 34 ";
        System.out.println("Test :"+ kalkulatorTest.oblicz(wejscie));
    }
}
