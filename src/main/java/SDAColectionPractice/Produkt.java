package SDAColectionPractice;

public class Produkt {
    private String nazwa;
    private int waga;


    public Produkt(String nazwa, int waga) {
        this.nazwa = nazwa;
        this.waga = waga;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWaga(
    ) {
        return waga;

    }
    public void setNazwa(){
        this.nazwa=nazwa;
    }
    public void setWaga(){
        this.waga=waga;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produkt{");
        sb.append("nazwa='").append(nazwa).append('\'');
        sb.append(", waga=").append(waga);
        sb.append('}');
        return sb.toString();
    }
}
