
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }
    
    public boolean vahemman(Raha verrattava) {
        
        if (this.eurot() == verrattava.eurot()) {
            
            if (this.sentit() < verrattava.sentit()) {
                return true;
            } else {
                return false;
            }
            
        } 
        
        if (this.eurot() < verrattava.eurot()) {
            return true;
        } else {
            return false;
        }
        
        
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.eurot() + lisattava.eurot(), this.sentit() + lisattava.sentit());
        
        return uusi;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

}
