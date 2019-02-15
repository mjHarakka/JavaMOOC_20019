
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.lukujenMaara = 0;
        this.summa = 0;
    }

    public void lisaaLuku(int luku) {
        // kirjoita koodia tähän
        this.lukujenMaara++;
        this.summa += luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }
    
    public int summa() {
        // kirjoita koodia tähän
        return this.summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän
        
        if (this.lukujenMaara == 0) {
            return 0;
        } else {
            return this.summa / (double)this.lukujenMaara;
        }
        
        
    }
    
}
