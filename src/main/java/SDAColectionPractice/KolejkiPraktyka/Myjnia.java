package SDAColectionPractice.KolejkiPraktyka;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Myjnia {
    Queue<Samochod> autaDoMycia = new ArrayDeque<>();


    public void UmyjWszystkieAuta(List<Samochod> auta){
        autaDoMycia.addAll(auta);
        for (Samochod auto : autaDoMycia){
            System.out.println(auto +" Zostalo umyte");
        }
    }
}
