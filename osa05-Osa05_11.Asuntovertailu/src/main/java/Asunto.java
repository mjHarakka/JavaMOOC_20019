
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.nelioita) {
            return true;
        } else {
            return false;
        }
    }
    
    public int hintaero(Asunto verrattava) {
        int hintaero = 0;
        
        if (verrattava.nelioita * verrattava.neliohinta > this.nelioita * verrattava.nelioita) {
            hintaero = verrattava.nelioita * verrattava.neliohinta - this.nelioita * verrattava.nelioita;
        } else {
            hintaero = this.nelioita * this.neliohinta - verrattava.nelioita * verrattava.nelioita;
        }
        
        return hintaero;
        
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if (this.nelioita * this.neliohinta > verrattava.nelioita * verrattava.neliohinta) {
            return true;
        } else {
            return false;
        }
    }

}
