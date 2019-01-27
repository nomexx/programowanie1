package SDAColectionPractice.Bibliotek;

public class Ksiazka {
    private String autor;
    private String tytul;

    public Ksiazka(String autor, String tytul) {
        this.autor = autor;
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ksiazka{");
        sb.append("autor='").append(autor).append('\'');
        sb.append(", tytul='").append(tytul).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
