
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        
        if (summa >= 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }
        
        
    }
    
    public boolean syoEdullisesti(Maksukortti kortti) {
        // edullinen lounas maksaa 2.50 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        
        if (kortti.saldo() >= 2.5) {
            kortti.otaRahaa(2.5);
            edulliset++;
            return true;
        } else {
            return false;
        }
        
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        // maukas lounas maksaa 4.30 euroa.
        // jos kortilla on tarpeeksi rahaa, vähennetään hinta kortilta ja palautetaan true
        // muuten palautetaan false
        
        if (kortti.saldo() >= 4.3) {
            kortti.otaRahaa(4.3);
            maukkaat++;
            return true;
        } else {
            return false;
        }
        
    }
    
    
    public Kassapaate() {
        // kassassa on aluksi 1000 euroa rahaa
        this.rahaa = 1000;
    }

    public double syoEdullisesti(double maksu) {
        // edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        
        if (maksu >= 2.50) {
            this.rahaa += 2.50;
            this.edulliset++;
            return maksu - 2.50;
        } else {
            return maksu;
        }
    }

    public double syoMaukkaasti(double maksu) {
        // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
        if (maksu >= 4.30) {
            this.rahaa += 4.30;
            this.maukkaat++;
            return maksu - 4.30;
        } else {
            return maksu;
        }
    }


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
