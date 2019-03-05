/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.ArrayList;

public class MaksimipainollinenLaatikko extends Laatikko{
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    
    public void lisaa(Tavara t) {
        int summa = 0;
        
        for (Tavara tavara: tavarat) {
            summa += tavara.getPaino();
        }
        
        if ((t.getPaino() + summa) <= maksimipaino) {
            this.tavarat.add(t);
        }
    }
    
    @Override
    public boolean onkoLaatikossa(Tavara t) {
        for (Tavara tavara: this.tavarat) {
            if (tavara.equals(t)) {
                return true;
            }
        }
        return false;
    }
    
    
    
}
