package SDAColectionPractice.Pralnia;

public class Ubranie {
 Material material;
 String rodzajUbrania;
 String kolor;


    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getRodzajUbrania() {
        return rodzajUbrania;
    }

    public void setRodzajUbrania(String rodzajUbrania) {
        this.rodzajUbrania = rodzajUbrania;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Ubranie(Material material, String rodzajUbrania, String kolor) {
        this.material = material;
        this.rodzajUbrania = rodzajUbrania;
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Ubranie{" +
                "material=" + material +
                ", rodzajUbrania='" + rodzajUbrania + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }

    public Ubranie() {
    }
}


