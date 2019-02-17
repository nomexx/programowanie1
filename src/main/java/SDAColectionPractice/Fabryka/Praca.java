package SDAColectionPractice.Fabryka;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Praca {
    private static Map<Stanowisko, List<Zadania>> zadaniaDlaPracownika = new HashMap<>();

    public Praca() {
    }

    public static void dodajZadaniaNaStanowisku(Stanowisko stanowisko, Zadania zadania) {
        List<Zadania> listaZadan = new ArrayList<>();

        if (zadaniaDlaPracownika.containsKey(stanowisko)) {
            zadaniaDlaPracownika.get(stanowisko).add(zadania);
        } else {
            listaZadan.add(zadania);
            zadaniaDlaPracownika.put(stanowisko, listaZadan);
        }


    }

    public static void usunZadanieZeStanowiska(Stanowisko stanowisko, Zadania zadania) {

        zadaniaDlaPracownika.get(stanowisko).remove(zadania);
    }


    public static void wypiszZadaniaDlaStanowiska(Stanowisko stanowisko) {
        if (zadaniaDlaPracownika.containsKey(stanowisko)) {
            List<Zadania> zadanieDlaStanowiska = zadaniaDlaPracownika.get(stanowisko);
            System.out.println("Zadania na stanowisku :" + stanowisko + "->");
            for (Zadania zadania : zadanieDlaStanowiska) {
                System.out.println(zadania);
            }
        }
    }

    public static void zadaniaPracownika(Pracownik pracownik) {
        if(zadaniaDlaPracownika.containsKey(pracownik.getStanowisko())){
        System.out.println("Zadania dla pracownika: " + pracownik + "-->" + zadaniaDlaPracownika.get(pracownik.getStanowisko()));
    }}

    public static void main(String[] args) {
        Pracownik jan = new Pracownik("Jan", "Kowalski", Stanowisko.PAKOWACZ);
        Pracownik barbara = new Pracownik("Barbara", "Wiercipieta", Stanowisko.SORTOWACZ);
        Pracownik roman = new Pracownik("Roman", "Roman", Stanowisko.ROBOL);

        dodajZadaniaNaStanowisku(Stanowisko.PAKOWACZ, Zadania.PAKUJ);
        dodajZadaniaNaStanowisku(Stanowisko.SORTOWACZ, Zadania.SORTUJ);
        dodajZadaniaNaStanowisku(Stanowisko.ROBOL, Zadania.RZNIJ);
        dodajZadaniaNaStanowisku(Stanowisko.ROBOL, Zadania.TNIJ);
        wypiszZadaniaDlaStanowiska(Stanowisko.ROBOL);
        usunZadanieZeStanowiska(Stanowisko.ROBOL, Zadania.RZNIJ);
        wypiszZadaniaDlaStanowiska(Stanowisko.ROBOL);
        dodajZadaniaNaStanowisku(Stanowisko.ROBOL,Zadania.RZNIJ);
        System.out.println();
        zadaniaPracownika(barbara);
        System.out.println();
        zadaniaPracownika(jan);
        System.out.println();
        zadaniaPracownika(roman);

    }

}

