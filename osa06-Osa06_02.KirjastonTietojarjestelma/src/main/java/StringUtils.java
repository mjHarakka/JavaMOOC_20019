/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class StringUtils {
    
    public static boolean sisaltaa(String sana, String haettava) {
        if (sana.toLowerCase().trim() == null) {
            return false;
        } else if (haettava.toLowerCase().trim() == null) {
            return false;
        } else {
            return true;
        }
        
        
    }
    
}
