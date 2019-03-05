
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class HukkaavaLaatikko extends Laatikko {
    private ArrayList<Tavara> tavarat;
    
    public HukkaavaLaatikko() {
        this.tavarat = new ArrayList<>();
    }

    public void lisaa(Tavara t) {
        this.tavarat.add(t);
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean onkoLaatikossa(Tavara t) {
        return false;
    }
}
