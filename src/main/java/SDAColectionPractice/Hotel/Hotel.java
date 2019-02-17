package SDAColectionPractice.Hotel;

import java.util.*;

public class Hotel {
    private String nazwa;
    private String miasto;
    public static Gosc duszek= new Gosc("Duszek","Rezerwacji");

    public Hotel() {
    }

    public Hotel(String nazwa, String miasto, Map<Pokoj, Gosc> mapa) {
        this.nazwa = nazwa;
        this.miasto = miasto;
        this.mapa = mapa;
    }

    private Map<Pokoj,Gosc>mapa= new HashMap<>();



    public String getNazwa() {
        return nazwa;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public  Map<Pokoj, Gosc> getMapaPokoi() {
        return mapaPokoi;
    }

    public static void setMapaPokoi(Map<Pokoj, Gosc> mapaPokoi) {
        Hotel.mapaPokoi = mapaPokoi;
    }

    public static Map<Pokoj,Gosc>mapaPokoi= new HashMap<>();


    public static void zameldujGoscia(Pokoj pokoj,Gosc gosc){
        mapaPokoi.replace(pokoj,gosc);
    }
    private static void wymeldujGoscia(Pokoj pokoj,Gosc gosc){
        mapaPokoi.replace(pokoj,gosc);
    }
    private static Gosc znajdzGosciPoNrPokoju(int pokoj){
for (Map.Entry<Pokoj,Gosc>wpis:mapaPokoi.entrySet()){
   if( wpis.getKey().getNumer()==pokoj){
       return wpis.getValue();
   }
}return null;


    }
   private static Pokoj znajdzPokojPoNazwisku(String gosc){
        Set<Map.Entry<Pokoj,Gosc>>pokoje=mapaPokoi.entrySet();
        for (Map.Entry<Pokoj,Gosc>pokoj: pokoje){
            if(pokoj.getValue().getNazwisko().equals(gosc)){
                return pokoj.getKey();
            }

        }return null;

    }
    private static void zaproponujWolnePokoje(Standard pokoj1){
        Set<Map.Entry<Pokoj,Gosc>>pokoje= mapaPokoi.entrySet();

        for (Map.Entry<Pokoj,Gosc>pokoj :pokoje)
        {
            if(pokoj.getKey().getStandard().equals(pokoj1) && pokoj.getValue().equals(duszek)) {
                System.out.println(pokoj);
            }
        }
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
        System.out.println(mapaPokoi);
        System.out.println();

        Hotel.wymeldujGoscia(pokoj1,duszek);
        System.out.println(mapaPokoi);
        System.out.println();

        System.out.println( znajdzGosciPoNrPokoju(2));
        System.out.println();
        System.out.println(znajdzPokojPoNazwisku("IV"));
        System.out.println();




        zaproponujWolnePokoje(Standard.STANDARD);
    }
}
