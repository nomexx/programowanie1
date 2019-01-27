package SDAColectionPractice.zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj liczby");
        String[] liczby= scanner.nextLine().split("\\s");
        List<Integer> liczbyLista = new ArrayList();

        if(liczby.length==1 && liczby[0].equalsIgnoreCase("")){
            System.out.println("Pusto :(");

        }else{

        for (int i=0; i<liczby.length;i++){
            liczbyLista.add(Integer.parseInt(liczby[i]));
        } }

        int sumaUjemnych=0;
        int sumaDodatnich=0;
        int suma=0;
        int iledodatnich=0;
        int ileujemnych=0;
        for (int liczba:liczbyLista){
            if(liczba<0){
                sumaUjemnych+=liczba;
                ileujemnych++;
            }else if(liczba>0){
                sumaDodatnich+=liczba;
                iledodatnich++;
            }
            suma+=liczba;
        }

        System.out.println("Suma ujemnych="+ sumaUjemnych);
        System.out.println("Suma dodatnich="+ sumaDodatnich);
        System.out.println("Suma calkowita ="+suma);
        System.out.println("Mamy : "+iledodatnich+" liczb dodatnich ");
        System.out.println("Mamy : "+ileujemnych+" liczb ujemnych ");

    }
}
