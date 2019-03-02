package SDAColectionPractice.Algorytmy.QuickSortZadanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSort {
     private List<Osoba>osobaList = new ArrayList<>();
   private int rozmiar;


    public void sort(List<Osoba>listaOsob) {
        if (listaOsob == null || listaOsob.size() ==0) {
            return;
        }
        this.osobaList = listaOsob;
        rozmiar = listaOsob.size();

        quickSort(0, rozmiar - 1);
    }

    private void quickSort(int mniejszyIndex, int wiekszyIndex) {
        int i = mniejszyIndex;
        int j = wiekszyIndex;

       Osoba pivot = osobaList.get(mniejszyIndex + (wiekszyIndex - mniejszyIndex) / 2);

        while (i <= j) {
            while (osobaList.get(i).compareTo(pivot)<0 ) {
                i++;
            }
            while (osobaList.get(j).compareTo(pivot)>0) {
                j--;

            }
            if(i<=j){
                zamienLiczby(i,j);
                i++;
                j--;
            }

        }
        if (mniejszyIndex<j){
            quickSort(mniejszyIndex,j);

        }
        if (i<wiekszyIndex){
            quickSort(i,wiekszyIndex);
        }
    }
    public void zamienLiczby(int i, int j){
       Osoba temp= osobaList.get(i);
       osobaList.set(i,osobaList.get(j));
       osobaList.set(j,temp);

    }

    public static void main(String[] args) {
        QuickSort quickSort= new QuickSort();
        List<Osoba> listaOsob=new ArrayList<>();
        Osoba osoba1 = new Osoba("Roman", 1992);
        Osoba osoba2 = new Osoba("Jan", 1989);
        Osoba osoba3 = new Osoba("Kazik", 1988);
        Osoba osoba4 = new Osoba("Ala", 1994);
        Osoba osoba5 = new Osoba("Ola", 1995);
        Collections.addAll(listaOsob,osoba1,osoba2,osoba3,osoba4,osoba5);
        System.out.println(listaOsob);
        System.out.println();
        quickSort.sort(listaOsob);
        System.out.println(listaOsob);


    }


}
