package SDAColectionPractice.Algorytmy;

import java.util.Arrays;

public class QuickSort {

    private int tablica[];
    private int rozmiar;


    public void sort(int tablica[]) {
        if (tablica == null || tablica.length == 0) {
            return;
        }
        this.tablica = tablica;
        rozmiar = tablica.length;

        quickSort(0, rozmiar - 1);
    }

    private void quickSort(int mniejszyIndex, int wiekszyIndex) {
        int i = mniejszyIndex;
        int j = wiekszyIndex;

        int pivot = tablica[mniejszyIndex + (wiekszyIndex - mniejszyIndex) / 2];

        while (i <= j) {
            while (tablica[i] < pivot) {
                i++;
            }
            while (tablica[j] > pivot) {
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
        int temp= tablica[i];
        tablica[i]=tablica[j];
        tablica[j]= temp;
    }

   
    public static void main(String[] args) {
        QuickSort quickSort= new QuickSort();
       int tablica[]= {4, 95, 54,43,8,12};
        for (int i:tablica)
        {
            System.out.print(i+", ");
        }
        quickSort.sort(tablica);
        System.out.println();
        for (int i:tablica)
        {
            System.out.print(i+", ");
        }
    }


}
