package SDAColectionPractice.Hotel;

import java.util.*;

import static SDAColectionPractice.Hotel.Hotel.*;

public class SiecHoteli {

    static Map<String,Hotel > siecHoteli = new HashMap<>();
   static Hotel hotel= new Hotel();

static     Hotel hotel1= new Hotel("Mariot","Warszawa",hotel.getMapaPokoi());
   static Hotel hotel2= new Hotel("BluRadison", "Gdansk", hotel.getMapaPokoi());
   static Hotel hotel3= new Hotel("U Jana", "Brzezniewo", hotel.getMapaPokoi());
   static Hotel hotel4= new Hotel("U Basi", "Zadupie Wielkie", hotel.getMapaPokoi());

   private static List<Pokoj>znajdzWolnyPokojWDanymMiescie(String miasto){
       List<Pokoj>wolnePokoje= new ArrayList<>();
       for (Map.Entry<String,Hotel>wpis:siecHoteli.entrySet()){

           if (wpis.getValue().getMiasto().equals(miasto) ){
               for (Map.Entry<Pokoj,Gosc>pokoje :wpis.getValue().getMapaPokoi().entrySet()){
                   if (pokoje.getValue().equals(duszek)){
                       wolnePokoje.add(pokoje.getKey());
                   }
               }
           }


       }return wolnePokoje;
   }

   private static int policzZameldowanychwSieci(){
       int licznik=0;
       for (Map.Entry<String,Hotel>wpis:siecHoteli.entrySet()){
           for (Map.Entry<Pokoj,Gosc>pokoje :wpis.getValue().getMapaPokoi().entrySet()){
                   if (!pokoje.getValue().equals(duszek)){
                       licznik++;
                   }

   }}return licznik;
   }

    public static void main(String[] args) {
        Gosc duszek= new Gosc("Duszek","Rezerwacji");
        Pokoj pokoj1= new Pokoj(1,Standard.STANDARD);
        Pokoj pokoj2= new Pokoj(2,Standard.STANDARD);
        Pokoj pokoj3= new Pokoj(3,Standard.STANDARD);
        Pokoj pokoj4= new Pokoj(4,Standard.STANDARD);
        Pokoj pokoj5= new Pokoj(5,Standard.LUX);
        Pokoj pokoj6= new Pokoj(6,Standard.STANDARD);
        Pokoj pokoj7= new Pokoj(7,Standard.STANDARD);
        Pokoj pokoj8= new Pokoj(8,Standard.KINGS_HOUSE);
        Pokoj pokoj9= new Pokoj(9,Standard.LUX);
        Pokoj pokoj10= new Pokoj(10,Standard.LUX);
        Gosc gosc1=new Gosc("Jan","Kowalski");
        Gosc gosc2=new Gosc("Janina","Kowalski");
        Gosc gosc3=new Gosc("Doda","Elektroda");
        Gosc gosc4=new Gosc("Elzbieta","IV");
        Gosc gosc5=new Gosc("Roman","Nowobogadzki");


        mapaPokoi.put(pokoj1,duszek);
        mapaPokoi.put(pokoj2,duszek);
        mapaPokoi.put(pokoj3,duszek);
        mapaPokoi.put(pokoj4,duszek);
        mapaPokoi.put(pokoj5,duszek);
        mapaPokoi.put(pokoj6,duszek);
        mapaPokoi.put(pokoj7,duszek);
        mapaPokoi.put(pokoj8,duszek);
        mapaPokoi.put(pokoj9,duszek);
        mapaPokoi.put(pokoj10,duszek);


        Hotel.zameldujGoscia(pokoj1,gosc1);
        Hotel.zameldujGoscia(pokoj3,gosc2);
        Hotel.zameldujGoscia(pokoj5,gosc3);
        Hotel.zameldujGoscia(pokoj8,gosc4);
        Hotel.zameldujGoscia(pokoj10,gosc5);



       siecHoteli.put(hotel1.getNazwa(),hotel1);
       siecHoteli.put(hotel2.getNazwa(),hotel2);
       siecHoteli.put(hotel3.getNazwa(),hotel3);
       siecHoteli.put(hotel4.getNazwa(),hotel4);


        System.out.println("Test I"+ znajdzWolnyPokojWDanymMiescie("Warszawa"));
        System.out.println();
        System.out.println("Test II"+ znajdzWolnyPokojWDanymMiescie("Gdansk"));
        System.out.println();
        System.out.println("Test III: "+ policzZameldowanychwSieci());

    }

}
