package SDAColectionPractice.Algorytmy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSortLista {

    private List<Integer> lista = new ArrayList<>();

    public void bublesort(List<Integer> lista) {
        int rozmiar = lista.size();
        if (lista == null || rozmiar == 0) {
            return;
        }

        for (int i = 0; i < rozmiar; i++) {
            boolean zamiana = false;

            for (int j = 0; j < rozmiar - 1; j++) {
                if (lista.get(j) < lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                    zamiana = true;
                }
            }
            if (!zamiana) {
                break;
            }
        }
    }

    public static void main(String[] args) {
BubbleSortLista bubbleSortLista= new BubbleSortLista();
Collections.addAll(bubbleSortLista.lista,2,4,8,3,7,9,1);
        System.out.println(bubbleSortLista.lista);
bubbleSortLista.bublesort(bubbleSortLista.lista);
        System.out.println(bubbleSortLista.lista);
    }
}