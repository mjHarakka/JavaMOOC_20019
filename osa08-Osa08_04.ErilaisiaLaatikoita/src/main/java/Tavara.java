
public class Tavara {

    private String nimi;
    private int paino;

    public Tavara(String nimi, int paino) {
        this.nimi = nimi;
        this.paino = paino;
    }

    public int hashCode() {
        return this.nimi.hashCode();
    }

    public boolean equals(Tavara t) {
        if (this.nimi.equals(t.getNimi())) {
            return true;
        } else {
            return false;
        }
    }
    

    public Tavara(String nimi) {
        this(nimi, 0);
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getPaino() {
        return this.paino;
    }

}
