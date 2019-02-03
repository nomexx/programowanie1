package SDAColectionPractice.KolejkiPraktyka;

public class Samochod {
    String marka;
    String model;
    int rok;
    int cena;

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRok() {
        return rok;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok=" + rok +
                ", cena=" + cena +
                '}';
    }

    public Samochod(String marka, String model , int rok , int cena){
        this.marka=marka;
        this.model=model;
        this.rok=rok;
        this.cena=cena;
    }



    public int getCena(){
        return cena;
    }
}
