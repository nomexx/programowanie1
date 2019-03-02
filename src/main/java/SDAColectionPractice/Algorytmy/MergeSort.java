package SDAColectionPractice.Algorytmy;

public class MergeSort {
    private int tablica[];
    private int tablicaPomocnicza[];
    private int rozmiar;


    private void sort(int[] tablica){
        if (tablica==null || tablica.length==0){
            return;
        }

        this.tablica=tablica;
        rozmiar=tablica.length;
        this.tablicaPomocnicza= new int[rozmiar];

        mergesort(0,rozmiar-1);


    }

    private void mergesort(int indexMin, int indexMax){
        if(indexMin<indexMax){
            int indexSrodkowy=indexMin +(indexMax-indexMin)/2;
            mergesort(indexMin,indexSrodkowy);
            mergesort(indexSrodkowy+1,indexMax);
            merge(indexMin,indexSrodkowy,indexMax);
        }
    }
    private void merge(int indexMin,int indexSrodek, int indexMax){
        for(int i=indexMin;i<= indexMax;i++){
            tablicaPomocnicza[i]=tablica[i];

        }
        int i= indexMin;
        int j= indexSrodek+1;
        int k= indexMin;

        while (i<=indexSrodek && j<=indexMax){
            if (tablicaPomocnicza[i]<=tablicaPomocnicza[j]){
                tablica[k]=tablicaPomocnicza[i];
                i++;
            }
            else {
                tablica[k]=tablicaPomocnicza[j];
                j++;
            }
            k++;

        }
        while (i<=indexSrodek){
            tablica[k]=tablicaPomocnicza[i];
            k++;
            i++;
        }

    }
    private static void wypiszTablice(int[] tablica){
        int rozmiar= tablica.length;
        for (int i=0;i<rozmiar;i++){
            System.out.println(tablica[i]+ " ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        int [] tablica = {12, 15,8,2,5,88,123,1};
        wypiszTablice(tablica);
        MergeSort mergeSort= new MergeSort();
        mergeSort.sort(tablica);
        System.out.println(" Posortowana tablica");
        wypiszTablice(tablica);
    }
}
