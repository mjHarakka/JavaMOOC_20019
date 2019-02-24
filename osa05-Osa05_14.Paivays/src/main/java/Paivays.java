
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }
    
    public void etene(int montakoPaivaa) {
        for (int i = 0; i < montakoPaivaa; i++) {
            this.etene();
        } 
    }
    
    public Paivays paivienPaasta(int paivia) {
        int uusiPaiva = this.paiva;
        int uusiKuukausi = this.kuukausi;
        int uusiVuosi = this.vuosi;
        int erotus = 0;
        
        uusiPaiva += paivia;
        
        if (uusiKuukausi > 12) {
            uusiVuosi++;
            uusiKuukausi = 1;
        }
        
        if (uusiPaiva > 30) {
            uusiPaiva = uusiPaiva % 30;
            uusiKuukausi++;
        }
        
        Paivays uusiPaivays = new Paivays(uusiPaiva, uusiKuukausi, uusiVuosi);

        

        return uusiPaivays;
    }
    
    public void etene() {
        this.paiva++;
        
        if (this.paiva > 30) {
            this.kuukausi++;
            this.paiva = 0;
        }
        
        if (this.kuukausi > 12) {
            this.vuosi++;
            this.kuukausi = 1;
        }
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }

    public boolean aiemmin(Paivays verrattava) {
        if (this.vuosi < verrattava.vuosi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi < verrattava.kuukausi) {
            return true;
        }

        if (this.vuosi == verrattava.vuosi && this.kuukausi == verrattava.kuukausi &&
                 this.paiva < verrattava.paiva) {
            return true;
        }

        return false;
    }

}
