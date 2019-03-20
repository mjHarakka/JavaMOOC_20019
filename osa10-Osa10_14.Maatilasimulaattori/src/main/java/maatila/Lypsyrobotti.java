/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

/**
 *
 * @author mikkoharakka
 */
public class Lypsyrobotti {
    private Maitosailio ms;
    
    public Lypsyrobotti() {
        
    }
    
    public Maitosailio getMaitosailio() {
        return ms;
    }
    
    public void setMaitosailio(Maitosailio maitosailio) {
        this.ms = maitosailio;
    }
    
    public void lypsa(Lypsava lypsava) {
        
        if (ms != null) {
            ms.lisaaSailioon(lypsava.lypsa());
            lypsava.lypsa(); 
        }
        
    }
}
