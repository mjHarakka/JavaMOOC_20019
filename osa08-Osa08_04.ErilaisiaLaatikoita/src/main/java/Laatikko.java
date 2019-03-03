
import java.util.ArrayList;

public abstract class Laatikko {

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public abstract void lisaa(Tavara tavara);

    public void lisaa(ArrayList<Tavara> tavarat) {
        for (Tavara tavara : tavarat) {
            lisaa(tavara);
        }
    }

    public abstract boolean onkoLaatikossa(Tavara tavara);
}
