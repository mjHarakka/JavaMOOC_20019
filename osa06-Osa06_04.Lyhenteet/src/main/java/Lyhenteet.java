/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.HashMap;

public class Lyhenteet {
    HashMap<String, String> lyhenteet;

    public Lyhenteet() {
        lyhenteet = new HashMap<>();
    }
    
    public void lisaaLyhenne(String lyhenne, String selite) {
        lyhenteet.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne) {
        if (lyhenteet.containsKey(lyhenne)) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public String haeLyhenne(String lyhenne) {
        if (!lyhenteet.containsKey(lyhenne)) {
            return null;
        } else {
            return lyhenteet.get(lyhenne);
        }
    }
    
}
