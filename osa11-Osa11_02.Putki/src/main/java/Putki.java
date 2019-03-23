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

public class Putki<T> {
    ArrayList<T> arvot;

    public Putki() {
        this.arvot = new ArrayList<>();
    }
    
    public void lisaaPutkeen(T arvo) {
        arvot.add(arvo);
    }
    
    public T otaPutkesta() {
        T returnElement = null;
        
        if (arvot.size() != 0) {
            returnElement = arvot.get(0);
        arvot.remove(0);
        }
        
        return returnElement;
    }
    
    public boolean onkoPutkessa() {
        if (!arvot.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
}
