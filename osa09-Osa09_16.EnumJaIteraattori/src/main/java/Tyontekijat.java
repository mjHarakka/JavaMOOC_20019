/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikkoharakka
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Tyontekijat {
    private List<Henkilo> tyontekijat;

    public Tyontekijat() {
        tyontekijat = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava) {
        tyontekijat.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat) {
        lisattavat.stream()
                .forEach(t -> tyontekijat.add(t));
    }
    
    public void tulosta() {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();

        while (iteraattori.hasNext()) {
            System.out.println(iteraattori.next());
        }
    }
    
    public void tulosta(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();

        while(iteraattori.hasNext())
        {
            Henkilo h = iteraattori.next();

            if (h.getKoulutus() == koulutus) {
                System.out.println(h);
            }
            
            
        }
        
    }
    
    public void irtisano(Koulutus koulutus) {
        Iterator<Henkilo> iteraattori = tyontekijat.iterator();

        while (iteraattori.hasNext()) {
            if (iteraattori.next().getKoulutus() == koulutus) {
                iteraattori.remove();
            }
        }
    }

    
}
