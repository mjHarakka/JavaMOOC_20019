/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
public class Piilo<T> {
    
    public T piilo;
    
    public void laitaPiiloon(T piilotettava) {
        this.piilo = piilotettava;
    }
    
    public T otaPiilosta() {
        T palautettava = null;
        palautettava = piilo;
        piilo = null;
        return palautettava;
    }
    
    public boolean onkoPiilossa() {
        if (piilo!=null) {
            return true;
        } else {
            return false;
        }
    }
    
}
