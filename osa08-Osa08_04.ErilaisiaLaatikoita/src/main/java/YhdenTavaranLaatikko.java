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

public class YhdenTavaranLaatikko extends Laatikko {
    private ArrayList<Tavara> yksiTavara;
    
    public YhdenTavaranLaatikko() {
        this.yksiTavara = new ArrayList<>();
    }

    public void lisaa(Tavara t) {
        if (this.yksiTavara.size() < 1) {
            this.yksiTavara.add(t);
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean onkoLaatikossa(Tavara t) {
        for (Tavara tavara: this.yksiTavara) {
            if (tavara.equals(t)) {
                return true;
            }
        }
        return false;
    }

}
