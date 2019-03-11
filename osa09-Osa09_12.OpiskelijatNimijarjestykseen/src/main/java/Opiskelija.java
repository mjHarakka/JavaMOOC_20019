

public class Opiskelija implements Comparable<Opiskelija> {

    private String nimi;

    public Opiskelija(String nimi) {
        this.nimi = nimi;
    }
    
    @Override
    public int compareTo(Opiskelija o) {
        return this.nimi.compareTo(o.getNimi());
    }

    public String getNimi() {
        return nimi;
    }

    @Override
    public String toString() {
        return nimi;
    }

}
